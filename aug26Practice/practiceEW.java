package aug26Practice;

public class practiceEW {
    //1.Write a Java program that takes 4 numbers as input to calculate and print the average of the numbers.





//2.please write a program that will return max number from 3 numbers

    public static void main(String[] args) {

        int num1 = 15;
        int num2 = 25;
        int num3 = 40;


        boolean compareNum1and2 = num1 < num2;
        System.out.println(compareNum1and2);

        boolean bol1 = num1<num2 && num1<num3; // comparing num1 with two other numbers
                        //true && true
                        // true
        boolean bol2 = num2<num1 && num2<num3; // comparing num2 with two other numbers
                        //false && true
                        //false
        boolean bol3 = num3<num1 && num3<num2; // comparing num3 with two other numbers
                        //false && false
                        //false

        if (bol1) {

            System.out.println("minimum number is the first number which is " + num1);
        }
        if (bol2) {

            System.out.println("minimum number is  the second number which is " + num2);
        }
        if (bol3){
            System.out.println("minimum number is  the third number which is " + num3);
        }




    }

//16. Write a Java program to print a face. Go to the editor
//Expected Output
//
// +"""""+
//[| o o |]
// |  ^  |
// | '-' |
// +-----+

//32. Write a Java program to compare two numbers. Go to the editor
//Input Data:
//Input first integer: 25
//Input second integer: 39
//Expected Output
//
//25 != 39
//25 < 39
//25 <= 39

//3.create a java program to check number is postive or negative
}
