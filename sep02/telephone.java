package sep02;

import java.util.Scanner;

public class telephone {
    public static void main(String[] args) {
        // declare our vars
        // double, long, int

        System.out.println("the number of calls you wish to make: ");
        Scanner call = new Scanner(System.in);


        int input = call.nextInt(); // we are looking for the next integer the user inputs

        double a = ( 200 + (input - 100) * 0.6 ); // we give a var called 'a' and we establish a base price of Rs. 200 and then we subtract 100 b/c the problem
                                                    // says 'up to 100 calls' which effectively means if it is under this range, we will use the 'a' formula to calculate call price
        double b = ( 200 + (50*0.6) + (input - 150) * 0.5); // we 200 plus 50 calls times the price for that , plus the difference

        double c = ( 200 + (50*0.6) + (input - 200) * 0.4);



    }
}

//Minimum Rs. 200 for up to 100 calls.
//Plus Rs. 0.60 per call for next 50 calls.
//Plus Rs. 0.50 per call for next 50 calls.
//Plus Rs. 0.40 per call for any call beyond 200 calls.