//Write a program that asks the user for input 

//until the user inputs 0. 

//After this, the program prints the average of the numbers.

//The number zero does not need to be counted to the average. 

//You may assume that the user inputs at least one number.

//The average of the numbers can be calculated by dividing the 
//sum of numbers
//with the 
//amount of the numbers
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //keep up with input
        double sumOfNumbers = 0;
        int amountOfNumbers = 0;
        
        while (true) {
            System.out.println("Give a number: ");
            //read user input
            int userInput = Integer.valueOf(scanner.nextLine());
            //break loop if user enters 0 
            if (userInput == 0){
                break;
            }
            //for increasing amoutnOfNumbers by one for each user input - except 0
            if (userInput > 0 || userInput < 0){
                amountOfNumbers = amountOfNumbers +1; 
            }
            //for adding the sum of numbers 
            if (userInput > 0 || userInput < 0){
                sumOfNumbers = sumOfNumbers + userInput +0;
            }
            System.out.println("Sum: " + sumOfNumbers );
            System.out.println("Amount: " + amountOfNumbers );
            
           
        //average the numbers
        }double avg =  sumOfNumbers / amountOfNumbers;
        //for printing the average of the numbers
        System.out.println("Average of the numbers: " + avg );
        
    }
}