//Implement a program which calculates the sum of a closed interval, and prints it. 
//Expect the user to write the smaller number first and then the larger number.

//You can base your solution to this exercise to the solution of last exercise 
//— add the functionality for the user to enter the starting point as well.

import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //ask user for number
        System.out.println("First number? ");
        int first = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Last number? ");
        int last = Integer.valueOf(scanner.nextLine());
        //initialize variable sum and begin it at 0 to keep count
        int sum = 0;
        //iterate through loop from first number to last 
        for (int i = first; i <= last; i++){
            // add value of i to the sum
            sum += i;
        }//print the sum
        System.out.println("The sum is: " + sum);
    }

}