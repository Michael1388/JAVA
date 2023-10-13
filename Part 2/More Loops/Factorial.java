//Implement a program which calculates the factorial of a number given by the user.

//Factorial of n, denoted n!, is calculated as 1 * 2 * 3 * ... * n. For example,
// the factorial of 4 is 24 or 4! = 1 * 2 * 3 * 4 = 24. Additionally, it has 
//been specified that the factorial of 0 is 1, so 0! = 1.

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //ask user for number
        System.out.println("Give a number: ");
        int num = Integer.valueOf(scanner.nextLine());

        //initialize variable sum and begin it at 1 to keep count
        int sum = 1;
        //iterate through loop from first number to last 
        for (int i = 1; i <= num; i++){
            // multiply value of i to the sum
            sum = i * sum;
        }//print the sum
        System.out.println("Factorial: " + sum);
    }   
}
