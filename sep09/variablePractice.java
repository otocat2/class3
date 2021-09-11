package sep09;

import java.util.Scanner;

//courtesy of mesut dayan in #coding-tasks

public class variablePractice {
    public static void main(String[] args) {
        //Task 1:
        //    Write a Java program to display the middle character of a string in uppercase
        //        --> If the length of the string is even number  String will have two middle characters.
        //        --> If the length of the string is odd number String  will have one middle character.
        //    example :
        //                Input 1 :  World             Output 1:Middle character is: R
        //                Input 2 :  computer          Output 2:Middle character is: PU
        //                .....
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your word");
        String entry=input.nextLine();
        int word=entry.length();
        System.out.println(word);
        String toUp="";
        if(word%2==0){
            int itseven=word/2;
            toUp= entry.substring(itseven-1,itseven+1).toUpperCase();
            System.out.println(toUp);
        }else{
            int itsodd=((word+1)/2+(-1));
            toUp=entry.substring(itsodd,itsodd+1).toUpperCase();
            System.out.println(toUp);
        }
        System.out.println("####################################");

        //#3 - Ask user to enter two words. Then add them together and print. But if the last letter of the first word and the first letter of the last letter is the same, print that character once.
        //                    Input:
        //                        one
        //                        eight
        //                    Output:
        //                        oneight

        System.out.println("enter your first word");
        String w1= input.nextLine();    //oreo


        System.out.println("enter your second word");
        String w2= input.nextLine();    // second word


        char c1=w1.charAt(w1.length()-1);   // ozge
                                            // length = 4
                                            // length() - 1 = e
                                            // first word last index/letter

        char c2=w2.charAt(0);   // we are looking for the FIRST letter of the second word
                                // w for white



        if (c1==c2){    // if you want to check if the first word's last letter is the same as the second word's first letter
                        // difference between = and ==
            String comb1=w1+(w2.substring(1)); // oreo + ozge substring method defines starting letter of second word
                                                // zge
                                                // oreozge
                                                // white + elephant
                                                // adult + tack

            System.out.println(comb1);}
        else{
            String comb1=w1+w2;                 // applebanana
                                                // orangepear
                                                // redwhite

            System.out.println(comb1);}
        System.out.println("######################################");
        // task 4. write a program that can print all the ODD numbers between 0 ~ 100 that can be divisible by 3 & 5
        int sumodd=0;
        System.out.println("Odd numbers that can be divided by 3 and 5 (from 0 and 100) are :");
        for ( int i=0; i<=100; i++) {


            if (i % 5 == 0 && i % 3 == 0 && i % 2 != 0) {
                sumodd = i;
                i++;

                System.out.println(sumodd);
            }
        }
        System.out.println("####################################");
        int sumeven=0;
        System.out.println("Even numbers that can be divided by 3 and 5 (from 0 to 100) are :");
        for ( int i=0; i<=100; i++) {

            if (i % 5 == 0 && i % 3 == 0 && i % 2 == 0) {
                sumeven = i;

                System.out.println(sumeven);
            }
        }
        System.out.println("########################################");

        /*
  task 6. write a program that can return the factorial number of any given number
            Ex:
                input: 6
                output: 720

            because:
                6! = 6 * 5 * 4 * 3 * 2* 1 = 120

                15!= 15 * 14 *.....* 1
 */


        System.out.println("Please enter a number to find its factorial value");
        int f= input.nextInt();
        long fact=1;
        for(int i=f; i>1; i--) {
            fact=fact*i;


            System.out.println(fact);}

    }

}

