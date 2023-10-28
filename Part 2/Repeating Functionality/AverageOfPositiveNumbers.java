//Write a program that asks the user for input until the user inputs 0. 
//After this, the program prints the average of the positive numbers 
//(numbers that are greater than zero).

//If no positive number is inputted, the program prints
// "Cannot calculate the average"
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //keep up with amount and sum
        double sumOfNumbers = 0;
        int amountOfNumbers = 0;
        
        while (true) {
            //System.out.println();
            //read user input
            int userInput = Integer.valueOf(scanner.nextLine());
            //break loop if user enters 0 
            if (userInput == 0){                
                break;   
            }
            //for increasing amoutnOfNumbers by one for each user input - except 0
            //and gaining the sum
            if (userInput > 0){
                amountOfNumbers = amountOfNumbers +1; 
                sumOfNumbers = sumOfNumbers + userInput +0;
            } 
            //System.out.println("Sum: " + sumOfNumbers );
            //System.out.println("Amount: " + amountOfNumbers );
            
        //average the numbers unless they are negative
        }
        if (sumOfNumbers + amountOfNumbers > 0){
            double avg =  sumOfNumbers / amountOfNumbers;
             //for printing the average of the numbers
            System.out.println(avg);
        }else {
            System.out.println("Cannot calculate the average" );
        }
       
        
    }
}
