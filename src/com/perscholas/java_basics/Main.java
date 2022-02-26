package com.perscholas.java_basics;

import java.util.Arrays;

public class Main {
       static void ArrayLength(){
           int arr[] = new int[3];
           //declare an array
           arr[0] = 1;
           arr[1] = 2;
           arr[2] = 3;
           for (int i = 0; i < arr.length; i++) {
               System.out.println(arr[i]);
           }
       }
       static void ReturnTheMiddleNumber(){
           System.out.println("----> Return only Midlle Number index ");
           int[] myInt = {13, 5, 7, 68, 2};
           System.out.println("Accessing array index \" 7 \" : " + myInt[2]);
       }
       static void CopyArray(){
          //declare array and assign values
           String[] color1 = {"Volvo", "BMW", "Ford", "Mazda"};
           System.out.println("the length of Array : " + color1.length);
           // Copying elements of color1[] to color2[[]

           String[] colors2 = Arrays.copyOf(color1, 4);
       }
       static void LastIndex(){
           System.out.println( "--------> Get the First and the last index of an array" );
           //  Declare an array of 5 elements
           int[] Num = {12, 34, 45, 56, 65};
           // get the last index of the Array
           System.out.println(Num[Num.length-1]);
           // get out the first index of an array
           System.out.println(Num[Num.length-5]);
          /* Num[5] = 32;
                         System.out.println(Num[Num.length-5]);
                        System.out.println("throw an error Index 5 out of bounds for length 5"); */
       }
       static void LoopThruArray(){
           int[] intArray = new int[5];
           for (int i = 0; i < intArray.length; i++) {
               intArray[i] = i;
           }
           System.out.println(Arrays.toString(intArray));
       }
       static void ArrayOfFive(){
           // Declare an array of five numbers
           int [] arrayNum = new int[5];
           // loop thru an array length
           for (int i = 0; i < arrayNum.length ; i++) {
           // multiplied by 2 to the corresponding index in the array
               arrayNum[i] = i * 2;
               // print out the array
               System.out.println(Arrays.toString(arrayNum));
           }
       }
       static void MiddleIndex() {
           // Declare an array
           int[] myAge = {45, 12, 4, 8, 9};
           System.out.println("Print String array ======> ");
           for (int i = 0; i < myAge.length; i++) {
               if (i != myAge.length / 2) {
                   System.out.println(myAge[i]);
               }

           }
       }

       static void SwapArray(){
           // Declare an array of five element
           String[]  Names = {"faisal", "ahmed", "abdulle", "abdi", "ali"};
            //  print each element of an array
           System.out.println(Arrays.toString(Names));
           // swap element of first index[1] to the middle index [2]
            String firstIndex = Names[0];
            String middleIndex = Names[2];
            firstIndex = Names[0];
            middleIndex = Names[2];
           System.out.println(Arrays.toString(Names));
           }
           static void ArrayOfDiffDataTypes(){
           // Create an array that includes an integer, 3 strings, and 1 double. Print the array.
               Object[] arr = {54, "faisal", 1.89};
               System.out.println(Arrays.toString(arr));
           }
    public static void main(String[] args) {
           // call out methods from the main class
           ArrayLength();
           ReturnTheMiddleNumber();
           CopyArray();
           LastIndex();
           LoopThruArray();
           LastIndex();
           ArrayOfFive();
           MiddleIndex();
           SwapArray();
           ArrayOfDiffDataTypes();
    }
}
