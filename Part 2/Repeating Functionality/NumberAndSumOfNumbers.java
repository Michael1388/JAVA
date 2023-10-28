//Write a program that asks the user for input until the user inputs 0. After 
//this, the program prints the amount of numbers inputted and the sum of the 
//numbers. The number zero does not need to be added to the sum, but adding 
//it does not change the results.
//You need two variables to keep track of the information. Use one for keeping 
//track of the numbers inputted and other for keeping track of the sum
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        //for saving number of numbers
        int numberOfNumbers = 0;
        int sumOfNumbers = 0;
        
        //for repeatedly asking for numbers
        while (true) {
            System.out.println("Give a number: ");
            //read user input
            int numberFromUser = Integer.valueOf(reader.nextLine());
            
            //for breaking the loop when user writes 0
            if (numberFromUser == 0){
                break;
            }
            //for increasing numberOfNumbers by one
            //when user gives a number
            if(numberFromUser > 0 || numberFromUser < 0){
                numberOfNumbers = numberOfNumbers + 1;    
            //for adding sum of numbers    
            }
            if (numberFromUser > 0 || numberFromUser < 0){
                sumOfNumbers = sumOfNumbers + numberFromUser +0;
            }
        }
        //for printing the number of positive numbers
        System.out.println("Number of numbers: " + numberOfNumbers);
        //for printing number of negative numbers 
        System.out.println("Sum of the numbers: " + sumOfNumbers);
    }
}
