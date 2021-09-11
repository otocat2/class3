package sep07;

import java.util.Scanner;

public class practice2 {

    public static void main(String[] args) {


    System.out.println("Please enter a number and we will reverse it: ");
    Scanner input5=new Scanner(System.in); // person enters 10
    int number5=input5.nextInt();           // taking 10 which is 'user input' and making it into an integer so that the compiler/computer understands
        String number = " " + number5;
        String reverseInput=" ";                 // now we do something totally different - we are declaring an Empty String var
    int lastIndex=reverseInput.length()-1;  //why are we doing above? b/c we are going to manipulate this String
    // length() method is a method that belongs to the String class
    // is there a length() method in Integer class? yes? no?

for(int i=lastIndex; i>=1; i--){
//     start ;      stop;   step;
    reverseInput += number.charAt(i);


} // ends for loop
        System.out.println("reverse of your integer number is: " + reverseInput);

    }   // ends main method
}   // ends class