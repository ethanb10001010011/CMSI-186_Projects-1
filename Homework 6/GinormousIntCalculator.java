/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  GinormousIntCalculator.java
 *  Purpose       :  User inputed calculator for Ginormous Integers.
 *  @author       :  B.J. Johnson
 *  Date          :  2017-04-20
 *  Description   :  The user decides to input two ginormous integers and chooses between 5 operations:
                     addition, subtraction, multiplication, division or Fibonacci sequence.
 *  Warnings      :  None
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  Revision Histor
 *  ---------------
 *            Rev      Date     Modified by:  Reason for change/modification
 *           -----  ----------  ------------  -----------------------------------------------------------
 *  @version 1.0.0  2017-04-20  Kea Braekman  Initial writing and release

 Comments: Overall, this code isn't finished. I haven't compeltely figured out the signs of certain operations.
           However, the result given is always the right length and at least gives the correct absolute value.
           There must be issues in my sortLarger and sortSmaller methods.
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
 import java.io.IOException;
 import java.util.Scanner;
 import java.util.Arrays;
 import java.util.List;
 import java.util.ArrayList;

 public class GinormousIntCalculator{
   public static void main( String[] args ){
     Scanner reader = new Scanner(System.in);
     System.out.println(" 1 = Add, 2 = Subtract, 3 = Multiply, 4 = Divide, or 5 = Fibonacci: ");
     System.out.println("PS: Multiply and Divide don't work.");
     int operation = reader.nextInt();
     if(operation == 1 || operation == 2 || operation == 3 || operation == 4){
       reader = new Scanner(System.in);
       System.out.println("Input a ginormous integer ");
       String string1 = reader.nextLine();
       System.out.println("Input another ginormous integer ");
       String string2 = reader.nextLine();
       char sign1 = string1.charAt(0);
       char sign2 = string2.charAt(0);
       System.out.println("Operation = " + operation);
       System.out.println("sign 1 : " + sign1);
       System.out.println("sign 2 : " + sign2);
       char sign = ' ';
     if( (operation == 1) && (sign1 == '-') && (sign2 == '-')){
       GinormousInt Ginormous1 = new GinormousInt(string1);
       GinormousInt Ginormous2 = new GinormousInt(string2);
       char[] charArray1 = Ginormous1.removeSign(Ginormous1.charArray);
       char[] charArray2 = Ginormous2.removeSign(Ginormous2.charArray);
       int[] intArray1 = Ginormous1.intArray(charArray1);
       int[] intArray2 = Ginormous2.intArray(charArray2);
       intArray1 = Ginormous1.setLengthArray1(intArray1, intArray2);
       intArray2 = Ginormous2.setLengthArray2(intArray1, intArray2);
       String result = Ginormous1.addInt(intArray1, intArray2);
       System.out.println(string1 + " + " + string2 + " = -" + result);
     }

     if( (operation == 1) && (sign1 != '-') && (sign2 != '-')){
       GinormousInt Ginormous1 = new GinormousInt(string1);
       GinormousInt Ginormous2 = new GinormousInt(string2);
       char[] charArray1 = Ginormous1.removeSign(Ginormous1.charArray);
       char[] charArray2 = Ginormous2.removeSign(Ginormous2.charArray);
       int[] intArray1 = Ginormous1.intArray(charArray1);
       int[] intArray2 = Ginormous2.intArray(charArray2);
       String result = Ginormous1.addInt(intArray1, intArray2);
       System.out.println(string1 + " + " + string2 + " = " + result);
     }

     if( (operation == 1) && (sign1 == '-') && (sign2 != '-')){
       GinormousInt Ginormous1 = new GinormousInt(string1);
       GinormousInt Ginormous2 = new GinormousInt(string2);
       char[] charArray1 = Ginormous1.removeSign(Ginormous1.charArray);
       char[] charArray2 = Ginormous2.removeSign(Ginormous2.charArray);
       int[] intArray1 = Ginormous1.intArray(charArray1);
       int[] intArray2 = Ginormous2.intArray(charArray2);
       intArray1 = Ginormous1.setLengthArray1(intArray1, intArray2);
       intArray2 = Ginormous2.setLengthArray2(intArray1, intArray2);
       String result = Ginormous1.subInt(intArray1, intArray2);
       if(Ginormous1.sortLarger(intArray1, intArray2) == intArray1){
         sign = '-';
       }
       System.out.println(string1 + " + " + string2 + " = " + sign + result);
     }

     if( (operation == 1) && (sign1 != '-') && (sign2 == '-')){
       GinormousInt Ginormous1 = new GinormousInt(string1);
       GinormousInt Ginormous2 = new GinormousInt(string2);
       char[] charArray1 = Ginormous1.removeSign(Ginormous1.charArray);
       char[] charArray2 = Ginormous2.removeSign(Ginormous2.charArray);
       int[] intArray1 = Ginormous1.intArray(charArray1);
       int[] intArray2 = Ginormous2.intArray(charArray2);
       intArray1 = Ginormous1.setLengthArray1(intArray1, intArray2);
       intArray2 = Ginormous2.setLengthArray2(intArray1, intArray2);
       String result = Ginormous1.subInt(intArray1, intArray2);
       if(Ginormous1.sortLarger(intArray1, intArray2) == intArray2){
         sign = '-';
         System.out.println("works");
       }
       System.out.println(string1 + " + " + string2 + " = " + sign + result);
     }

     if( (operation == 2) && (sign1 == '-') && (sign2 != '-')){
       GinormousInt Ginormous1 = new GinormousInt(string1);
       GinormousInt Ginormous2 = new GinormousInt(string2);
       char[] charArray1 = Ginormous1.removeSign(Ginormous1.charArray);
       char[] charArray2 = Ginormous2.removeSign(Ginormous2.charArray);
       int[] intArray1 = Ginormous1.intArray(charArray1);
       int[] intArray2 = Ginormous2.intArray(charArray2);
       intArray1 = Ginormous1.setLengthArray1(intArray1, intArray2);
       intArray2 = Ginormous2.setLengthArray2(intArray1, intArray2);
       String result = Ginormous1.addInt(intArray1, intArray2);
       System.out.println(string1 + " - " + string2 + " = -" + result);
     }

     if( (operation == 2) && (sign1 != '-') && (sign2 == '-')){
       GinormousInt Ginormous1 = new GinormousInt(string1);
       GinormousInt Ginormous2 = new GinormousInt(string2);
       char[] charArray1 = Ginormous1.removeSign(Ginormous1.charArray);
       char[] charArray2 = Ginormous2.removeSign(Ginormous2.charArray);
       int[] intArray1 = Ginormous1.intArray(charArray1);
       int[] intArray2 = Ginormous2.intArray(charArray2);
       intArray1 = Ginormous1.setLengthArray1(intArray1, intArray2);
       intArray2 = Ginormous2.setLengthArray2(intArray1, intArray2);
       String result = Ginormous1.addInt(intArray1, intArray2);
       System.out.println(string1 + " - " + string2 + " = " + result);
     }

     if( (operation == 2) && (sign1 == '-') && (sign2 == '-')){
       GinormousInt Ginormous1 = new GinormousInt(string1);
       GinormousInt Ginormous2 = new GinormousInt(string2);
       char[] charArray1 = Ginormous1.removeSign(Ginormous1.charArray);
       char[] charArray2 = Ginormous2.removeSign(Ginormous2.charArray);
       int[] intArray1 = Ginormous1.intArray(charArray1);
       int[] intArray2 = Ginormous2.intArray(charArray2);
       intArray1 = Ginormous1.setLengthArray1(intArray1, intArray2);
       intArray2 = Ginormous2.setLengthArray2(intArray1, intArray2);
       String result = Ginormous1.subInt(intArray1, intArray2);
       if(Ginormous1.sortLarger(intArray1, intArray2) == intArray1){
         sign = '-';
       }
       System.out.println(string1 + " - " + string2 + " = " + sign + result);
     }

     if( (operation == 2) && (sign1 != '-') && (sign2 != '-')){
       GinormousInt Ginormous1 = new GinormousInt(string1);
       GinormousInt Ginormous2 = new GinormousInt(string2);
       char[] charArray1 = Ginormous1.removeSign(Ginormous1.charArray);
       char[] charArray2 = Ginormous2.removeSign(Ginormous2.charArray);
       int[] intArray1 = Ginormous1.intArray(charArray1);
       int[] intArray2 = Ginormous2.intArray(charArray2);
       intArray1 = Ginormous1.setLengthArray1(intArray1, intArray2);
       intArray2 = Ginormous2.setLengthArray2(intArray1, intArray2);
       String result = Ginormous1.subInt(intArray1, intArray2);
       if(Ginormous1.sortLarger(intArray1, intArray2) == intArray2){
         sign = '-';
       }
       System.out.println(string1 + " - " + string2 + " = " + sign + result);
     }
   }
     if(operation == 5){
       GinormousInt Ginormous1 = new GinormousInt(" ");
       reader = new Scanner(System.in);
       System.out.println("How long would you want this sequence to be? ");
       int sequence = reader.nextInt();
       Ginormous1.Fibonacci(sequence);
     }
   }
 }
