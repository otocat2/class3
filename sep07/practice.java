package sep07;

import java.util.Scanner;

public class practice {

    public static void main(String[] args) {



//Question 4
//Write a program to find the factorial value of any number entered through the keyboard.

        // we need user input

        // we need to compare the number to its factorial value

        //now we know what factorial is
        // n = n * (n -1) !

        // message to the user
        System.out.println("enter a number and we will give you the factorial value: ");


        // scanner obj is when we want user input
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();

        int factor = 1;

        // nextLine vs nextInt
        // String vs number


        // let's create a program to count down

        //how do we count down?

        // for loop - start; stop ; step

        for(int i=1; i<=a; i++)
        {

            // n = n * (n - 1)
            // 5 = 5 * (4)!
            // 4 = 4 * (3)!
            // and so on , and so forth

            factor *= i;  // n = n * i
          //  factor = factor * i;



        }
        // we print outside of the for loop
        // b/c we want the result at the end, not continuously printing
        System.out.println(factor + " is the factorial value for a");


    }
}