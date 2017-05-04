/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * File name  :  DynamicChangemaker.java
 * Purpose    :  Program to determine the optimal amount of coin denominations necessary to for a given amount
 * @author    :  Professor Johnson except for one section of code
 * @author    : Kea Braekman
 * Date       :  2017-05-03
 * Description:  This program is an algorithm that generates the optimal amount of coins needed to make a
 *               a given value. It also checks to see if the has user has valid inputs as well.
 * Notes      :  None
 * Warnings   :  None
 *
 *  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Revision History
 * ================
 *   Ver      Date     Modified by:   Reason for change or modification
 *  -----  ----------  ------------   ---------------------------------------------------------------------
 *  1.0.0  2017-04-19  B.J. Johnson   Initial release; stolen blatently from Professor Don Murphy with his
 *                                    express permission and blessing; just added this comment block
 *  1.1.0  2017-05-03  Kea Brakman    Wrote algorithm makeChangeWithDynamicProgramming, completed JavaDocs,
                                      tested the program with given test harness.
 *
 *  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
import java.util.Arrays;
public class DynamicChangemaker {

  /**
   *  Main method that handles all of the input arguments and calls makeChangeWithDynamicProgramming
   */
    public static void main(String[] args) {

        if (args.length != 2) {
            printUsage();
            return;
        }
        try {

            String[] denominationStrings = args[0].split(",");
            int[] denominations = new int[denominationStrings.length];

            for (int i = 0; i < denominations.length; i++) {
                denominations[i] = Integer.parseInt(denominationStrings[i]);
                if (denominations[i] <= 0) {
                    System.out.println("Denominations must all be greater than zero.\n");
                    printUsage();
                    return;
                }

                for (int j = 0; j < i; j++) {
                    if (denominations[j] == denominations[i]) {
                        System.out.println("Duplicate denominations are not allowed.\n");
                        printUsage();
                        return;
                    }
                }
            }

            int amount = Integer.parseInt(args[1]);
            if (amount < 0) {
                System.out.println("Change cannot be made for negative amounts.\n");
                printUsage();
                return;
            }



            Tuple change = makeChangeWithDynamicProgramming(denominations, amount);
            if (change.isImpossible()) {
                System.out.println("It is impossible to make " + amount + " cents with those denominations.");
            } else {
                int coinTotal = change.total();
                System.out.println(amount + " cents can be made with " + coinTotal + " coin" +
                        getSimplePluralSuffix(coinTotal) + " as follows:");

                for (int i = 0; i < denominations.length; i++) {
                    int coinCount = change.getElement(i);
                    System.out.println("- "  + coinCount + " " + denominations[i] + "-cent coin" +
                            getSimplePluralSuffix(coinCount));
                }
            }
        } catch (NumberFormatException nfe) {
            System.out.println("Denominations and amount must all be integers.\n");
            printUsage();
        }
    }

    /**
     * makeChangeWithDynamicProgramming is a method that takes in two arguments:
     * An integer array and an integer.
     * It distributes these integers efficiently to obtain the second integer used as input.
     * The goal is to optimize and get the minimum number of coins (of each denomination).
     *
     * @param denominations  the array of coins denominations (integers)
     * @param amount         the desired amount of cents
     *
     * @return optimal number of each coin denomination that creates the amount desired
     */
    public static Tuple makeChangeWithDynamicProgramming(int[] denominations, int amount) {
      Tuple[][] table = new Tuple[denominations.length][amount+1];
      int temp = 0;
      for(int i=0; i<denominations.length; i++){
        temp = 0;
        for(int j=0; j<amount+1; j++){
          if(j==0){
            table[i][j]=new Tuple(denominations.length);
          }
          else{
            if(j >= denominations[i]){
              table[i][j] = new Tuple(denominations.length);
              table[i][j].setElement(i,1);
              temp = j - denominations[i];
              if( (table[i][temp].equals(Tuple.IMPOSSIBLE))){
                table[i][j] = Tuple.IMPOSSIBLE;
              }
              else{
                table[i][j] = table[i][j].add(table[i][temp]);
              }
            }
            else{
              table[i][j] = Tuple.IMPOSSIBLE;
            }
          if(i != 0){
            if(!table[i][j].equals(Tuple.IMPOSSIBLE)){
              if( !table[i-1][j].equals(Tuple.IMPOSSIBLE) && (table[i-1][j].total() < table[i][j].total())){
                  table[i][j] = table[i-1][j];
                }
            }
            else{
                if(!table[i-1][j].equals(Tuple.IMPOSSIBLE)){
                  table[i][j] = table[i-1][j];
                }
              }
            }
          }
          }
        }
        return table[denominations.length - 1][amount];
      }


    /**
    *  Error Handling in the program in case the user inputs something wrong.
    * Guides the user into inputting the arguments properly.
    */
    private static void printUsage() {
        System.out.println("Usage: java DynamicChangemaker <denominations> <amount>");
        System.out.println("  - <denominations> is a comma-separated list of denominations (no spaces)");
        System.out.println("  - <amount> is the amount for which to make change");
    }

    /**
     *  Method to use proper gramma when refering to a singular coin or multiple coins.
     *  @param count  the number of coins
     *
     *  @return adds an s at the end of the word "coin" if the program refers to multiple coins of the same
     *  denomination. Does not do it if there is a singular coin.
     */
    private static String getSimplePluralSuffix(int count) {
        return count == 1 ? "" : "s";
    }
}
