/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  GinormousInt.java
 *  Purpose       :  Creates and manipulates two integers that are larger than 64 bits.
 *  @author       :  Kea Braekman
 *  Date          :  2017-04-20
 *  Description   :  This class will incorporate a Ginormous Integer. As a design choice, we decided to use character
                     array.
                     Includes the following:
                     public GinormousInt(String inputInteger)    // Constructor for a single GinormousInt.
                     public int[] intArray(char[] charArray)     // Converts the Characr Arry into an Integer array.
                     public char[] removeSign(char[] charArray1) // Removes the eventual sign in an integer array.
                     public int[] setLengthArray1                // Sets the length of the second integer array according
                     (int[] intArray1, int[] intArray2)             first one.
                     public int[] setLengthArray2                // Sets the length of the first integer array according
                     (int[] intArray1, int[] intArray2)             to the second one.
                     public String toString(int[] intArray)      // Converts an integer array into a string.
                     public int[] sortLarger                     // Returns the largest of two arrays.
                     (int[] intArray1, int[] intArray2)
                     public int[] sortSmaller                    // Returns the smallest of two arays.
                     (int[] intArray1, int[] intArray2)
                     public String addInt                        // Adds two integer arrays.
                     (int[] intArray1, int[] intArray2)
                     public String subInt                        // Subtract two integer arrays.
                     (int[] intArray1, int[] intArray2)
                     public int[] half(int[] intArray1)          // Halves an integer array.
                     public int[] timesTwo(int[] intArray)       // Doubles an integer array.
                     public int[] stringToIntArray               // Converts a string into an integer array.
                     (String string)
                     public String multiplyInt                   // Multiplies two integer arrays.
                     (int[] intArray1, int[] intArray2)
                     public String divInt                        // Divides two integer arrays.
                     (int[] intArray1, int[] intArray2)
                     public void Fibonacci(int sequence)         // Prints the Fibonacci sequence,
                                                                    the length of the sequence depends
                                                                    on the number inputted.

 *  Warnings      :  None
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  Revision Histor
 *  ---------------
 *            Rev      Date     Modified by:  Reason for change/modification
 *           -----  ----------  ------------  -----------------------------------------------------------
 *  @version 1.0.0  2017-04-20  Kea Braekman  Initial writing and release
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
 import java.io.IOException;
 import java.util.Scanner;
 import java.util.Arrays;
 import java.util.List;
 import java.util.ArrayList;


 public class GinormousInt{
   String inputInteger;
   char[] charArray;
   int[] intArray;
   int[] addArray1;
   String addResult;

   public GinormousInt(String inputInteger){
     int i = inputInteger.length() -1;
     charArray = new char[inputInteger.length()];
     boolean sign = true;
     if(String.valueOf(inputInteger.charAt(0)) == "-"){
       sign = false;
       while(i>=1){
         charArray[i] = inputInteger.charAt(i);
         i = i - 1;
       }
     }
     if(  String.valueOf(inputInteger.charAt(0)) == "+"){
       sign = true;
       while(i>=1){
         charArray[i] = inputInteger.charAt(i);
         i = i - 1;
       }
     }
     else{
       while(i>=0){
       charArray[i] = inputInteger.charAt(i);
       i = i - 1;
     }
   }
 }

   public int[] intArray(char[] charArray){
     int i = charArray.length -1;
     int j = 0;
     while (charArray[j] == '0' && j < charArray.length-1){
       j=j+1;
     }
     int k = charArray.length - j;
     intArray = new int[k];
     while(k>=1){
       intArray[k-1] = Character.getNumericValue(charArray[i]);
       k = k - 1;
       i= i -1;
     }
     return intArray;
   }

   public char[] removeSign(char[] charArray1){
     int i = charArray1.length -1;
     if(charArray1[0] == '+' || charArray1[0] == '-'){
       char[] charArray2 = new char[charArray1.length - 1];
       while(i>=1){
         charArray2[i-1] = charArray1[i];
         i=i-1;
       }
       return charArray2;
     }
     else{
       return charArray1;
     }
   }

   public int[] setLengthArray1(int[] intArray1, int[] intArray2){
     int i = intArray1.length;
     int j = intArray2.length;
     if(i<j){
       int[] newIntArray1 = new int[j];
       while(i>=1){
         newIntArray1[j-1] = intArray1[i-1];
         i = i-1;
         j = j-1;
       }
       return newIntArray1;
     }
     else{
       return intArray1;
     }
   }

   public int[] setLengthArray2(int[] intArray1, int[] intArray2){
     int i = intArray1.length;
     int j = intArray2.length;
     if(i>j){
       int[] newIntArray2 = new int[i];
       while(j>=1){
         newIntArray2[i-1] = intArray2[j-1];
         j = j-1;
         i = i-1;
       }
       return newIntArray2;
     }
     else{
       return intArray2;
     }
   }


   public String toString(int[] intArray) {
     String result = " ";
     for (int i = 0; i < intArray.length; i++){
       result = result.concat(Integer.toString(intArray[i]));
     }
     return result;
   }

   public int[] sortLarger(int[] intArray1, int[] intArray2){
     int i = intArray1.length;
     int j = intArray2.length;
     int k = 0;
     if(i<j){
       return intArray2;
     }
     if(i>j){
       return intArray1;
     }
     else{
       while(k<i){
         if(intArray1[k] > intArray2[k]){
           return intArray1;
         }
         if(intArray1[k] < intArray2[k]){
           return intArray2;
         }
         else{
           k = k+1;
         }
       }
       }
       return intArray1;
     }

     public int[] sortSmaller(int[] intArray1, int[] intArray2){
       int i = intArray1.length;
       int j = intArray2.length;
       int k = 0;
       if(i<j){
         return intArray1;
       }
       if(i>j){
         return intArray2;
       }
       else{
         while(k<i){
           if(intArray2[k] > intArray1[k]){
             return intArray1;
           }
           if(intArray2[k] < intArray1[k]){
             return intArray2;
           }
           else{
             k = k+1;
           }
         }
         }
         return intArray2;
       }


   public String addInt(int[] intArray1, int[] intArray2){
     int[] newIntArray1 = setLengthArray1(intArray1, intArray2);
     int[] newIntArray2 = setLengthArray2(intArray1, intArray2);
     int i = newIntArray1.length;
     int[] addArray1 = new int[i+1];
     while(i>=0){
       addArray1[i] = 0;
       i = i-1;
     }
     /*We set the array to an array full of zeros.
     */
     i = newIntArray1.length;
     int carry = 0;
     while(i>=1){
       addArray1[i] = newIntArray1[i-1] + newIntArray2[i-1] + carry;
       if(addArray1[i]<=9){
         carry = 0;
       }
       if(addArray1[i]>9){
         carry = 1;
         addArray1[i] = addArray1[i] - 10;
       }
       i = i -1;
     }
     addArray1[i] = carry;
     i = addArray1.length;
     int[] addArray2 = new int[i-1];
     if(addArray1[0] == 0){
       while(i >= 2){
         addArray2[i-2] = addArray1[i-1];
         i = i-1;
       }
       return(toString(addArray2));
     }
     else{
       return(toString(addArray1));
     }
   }

   public String subInt(int[] intArray1, int[] intArray2){
     int[] newIntArray1 = sortLarger(setLengthArray1(intArray1, intArray2), setLengthArray2(intArray1, intArray2));
     int[] newIntArray2 = sortSmaller(setLengthArray1(intArray1, intArray2), setLengthArray2(intArray1, intArray2));
     int i = newIntArray1.length;
     int[] subArray1 = new int[i];
     while(i>=1){
       subArray1[i-1] = 0;
       i = i-1;
     }
     /*We set the array to an array full of zeros.
     */
     i = newIntArray1.length;
     while(i>=1){
       subArray1[i-1] = newIntArray1[i-1] - newIntArray2[i-1];
       if(subArray1[i-1]<0){
         subArray1[i-1] = newIntArray1[i-1] - newIntArray2[i-1] + 10;
         newIntArray2[i-2] = newIntArray2[i-2] + 1;
       }
       i = i -1;
     }
     i = subArray1.length;
     int[] subArray2 = new int[i-1];
     if(subArray1[0] == 0){
       while(i >= 2){
         subArray2[i-2] = subArray1[i-1];
         i = i-1;
       }
       return(toString(subArray2));
     }
     else{
       return(toString(subArray1));
     }
   }

   public int[] half(int[] intArray1){
     int i = 0;
     int[] result = new int[intArray1.length];
     while(i<=intArray1.length-1){
       result[i] = result[i] + (intArray1[i] / 2);
       if(intArray1[i] % 2 == 1 && i<intArray1.length-1){
         result[i+1] = 5;
       }
       i=i+1;
     }
     return result;
   }


   public int[] timesTwo(int[] intArray){
     String stringResult = addInt(intArray, intArray);
     int[] result1 = stringToIntArray(stringResult);
     int[] result2 = new int[result1.length - 1];
     int i = 1;
     while(i < result1.length){
       result2[i-1] = result1[i];
       i = i +1;
     }
     return result2;
   }

   public int[] stringToIntArray(String string){
     int a = string.length();
     int[] intArray = new int[a];
     int i = 0;
     while(i <= a-1){
       intArray[i] = Character.getNumericValue(string.charAt(i));
       i = i +1;
     }
     return intArray;
   }


   public String multiplyInt(int[] intArray1, int[] intArray2){
     String result = "0";
     int a = intArray2.length-1;
     int[] intArray3 = new int[a+1];
     intArray3[a] = 1;
     if(intArray2[a] % 2 == 1){
       result = addInt(stringToIntArray(result), intArray1);
     }
     while(!(Arrays.equals(intArray2, intArray3))){
       intArray1 = timesTwo(intArray1);
       intArray2 = half(intArray2);
       if(intArray2[a] % 2 == 1){
         result = addInt(stringToIntArray(result), intArray1);
       }
     }
     return result;
   }
   /*I tried and tried again. The russian peasant method seems to work with simple examples.
   However, it often messes up the first integer of the result as it adds both integer arrays.
   Sometimes it changes the first integer or adds a -1 or something of that nature...
   Overall, I usually get most of the integers in the result right, but this methos isn't
   fully functional.
   */

/*
   public String divInt(int[] intArray1, int[] intArray2){
     int a = intArray1.length;
     int[] intArray3 = new int[a];
     int[] intArray4 = new int[1];
     intArray4[0] = 1;
     String result = "0";
     if(intArray2 == sortLarger(intArray1, intArray2)){
       result = "0";
     }
     else{
       while(intArray1 == sortLarger(intArray1, intArray3)){
         System.out.println("Array1: " + Arrays.toString(intArray1));
         System.out.println("result: " + result);
         intArray1 = stringToIntArray(subInt(intArray1, intArray2));
         result = addInt( stringToIntArray(result), intArray4);
       }
     }
     return result;
   }
   */

   /*I tried and tried again. The division method makes sense in my mind, but it doesn't work
   in my code. The subtraction doesn't seem to dunction properly and the while loop is infinite.
   Overall, this method isn't finished.
   */


   public void Fibonacci(int sequence){
     int i = 0;
     String a = "0";
     String b = "0";
     String c = "1";
     while(i<sequence){
       a = b;
       b = c;
       c = addInt( stringToIntArray(a), stringToIntArray(b) );
       c = c.replaceAll("\\s","");
       System.out.println(a);
       i = i+1;
     }
   }


   public static void main( String[] args ){
     String z = ("418");
     String y = ("7281");
     GinormousInt a = new GinormousInt(z);
     char[] b = a.charArray;
     System.out.println(Arrays.toString(a.stringToIntArray("987654")));
     a.Fibonacci(10);
     System.out.println("Character array 1 without sign: " + Arrays.toString(a.removeSign(b)));
     System.out.println("Character array 1: " + Arrays.toString(b));
     int[] c = a.intArray(b);
     System.out.println("half of 3647592725 " + Arrays.toString(a.half(c)));
     System.out.println("string to Int Array " + Arrays.toString(a.stringToIntArray(z)));
     System.out.println("Double of 232992 " + Arrays.toString(a.timesTwo(c)));
     System.out.println("Integer array 1: " + Arrays.toString(c));
     GinormousInt d = new GinormousInt(y);
     char[] e = d.charArray;
     System.out.println("Character array 2: " + Arrays.toString(e));
     int[] f = d.intArray(e);
     System.out.println("Setlength Array 1: " + Arrays.toString(d.setLengthArray1(c,f)));
     System.out.println("Integer array 1: " + Arrays.toString(c));
     System.out.println("Integer array 2: " + Arrays.toString(f));
     System.out.println("sortLarger: " + Arrays.toString(a.sortLarger(c, f)));
     System.out.println("sortSmaller: " + Arrays.toString(a.sortSmaller(c, f)));
     System.out.println(z + " + ");
     System.out.println(y + " = ");
     System.out.println(a.addInt(c,f));
     System.out.println(y + " - ");
     System.out.println(z + " = ");
     System.out.println(a.subInt(c,f));
     System.out.println("half: " + Arrays.toString(c));
     System.out.println(y + " * ");
     System.out.println(z + " = ");
     System.out.println(a.multiplyInt(c,f));
   }
 }
