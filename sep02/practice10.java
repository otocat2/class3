package sep02;

import java.util.Scanner;

public class practice10 {

    //Question 10
//Meaning of Grade
//Write a program that prompts the user to enter grade.

    public static void main(String[] args) {

        System.out.println("Enter grade: ");
        Scanner userInput = new Scanner(System.in); // creating an object from the Scanner class
        char gr = userInput.next().charAt(0);          // user writes a letter, that's why we use the char data type
        System.out.println(gr);                     //question: can we use 'String' instead of 'char' for line 15 data type?


// Your program should display the corresponding meaning of grade as per the following table
//
//Grade    Meaning
//A        Excellent
//
//B        Good
//
//C        Average
//
//D        Deficient  antonym: proficient
//
//F        Failing

       if ( gr == 'A') {
           System.out.println( "excellent");
       } else if ( gr == 'B'){
           System.out.println("good");

       } else if ( gr == 'C'){
           System.out.println("average");
       } else if(gr == 'D'){
           System.out.println("deficient");
       } else if ( gr == 'F' ) {
           System.out.println("failing");
       } else {
           System.out.println("number or input is invalid");
       }

    }
}