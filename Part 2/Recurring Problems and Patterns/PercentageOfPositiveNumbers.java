//Sometimes you need to use multiple variables. The example below shows a 
//program which reads numbers from the user until the user writes 0. Then the 
//program prints the number of positive and negative numbers given, and the 
//percentage of positive numbers from all numbers given.
import java.util.Scanner;


public class PercentageOfPositiveNumbers {
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        //for saving number of numbers
        int numberOfPositives = 0;
        int numberOfNegatives = 0;
        
        //for repeatedly asking for numbers
        while (true) {
            System.out.println("Give a number (0 to stop): ");
            //read user input
            int numberFromUser = Integer.valueOf(reader.nextLine());
            
            //for breaking the loop when user writes 0
            if (numberFromUser == 0){
                break;
            }
            //for increasing numberOfPositives by one
            //when user gives a positive number
            if(numberFromUser > 0){
                numberOfPositives = numberOfPositives + 1;
            }
            //for increasing numberOfNegatives by one
            //when user gives a positive number
            if(numberFromUser < 0){
                numberOfNegatives = numberOfNegatives + 1;
            }
            // also could have used ..
//            if (numberFromUser > 0){
//                numberOfPositives = numberOfPositives +1;    
//            }else {
//                numberOfNegatives = numberOfNegatives + 1;
//            }
        }
        //for printing the number of positive numbers
        System.out.println("Positive numbers: " + numberOfPositives);
        //for printing number of negative numbers 
        System.out.println("Negative numbers: " + numberOfNegatives);
        
        //for printing the percentage of positive numbers from all numbers
        if (numberOfPositives + numberOfNegatives > 0) {
            //print only if user has given numbers
            //to avoid dividing by zero
            double percentageOfPositives = 100.0 * numberOfPositives / (numberOfPositives + numberOfNegatives);
            System.out.println("Percentage of positive numbers: " + percentageOfPositives + "%");
        }
    }
}