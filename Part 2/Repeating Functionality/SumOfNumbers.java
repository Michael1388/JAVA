//Write a program that reads numbers from the user until the user inputs a 
//number 0. After this the program outputs the sum of the numbers. The number 
//zero does not need to be added to the sum, even if it does not change the 
//results.
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        //read input from user
        Scanner scanner = new Scanner(System.in);
        //keep track of variable "number"
        int number = 0;
        // read block until exited
        while (true) {
            //print message asking for a number
            System.out.println("Give a number: ");
            //read inputted number
            int entry = Integer.valueOf(scanner.nextLine());
            //exit loop if user inputs a zero 0
            if(entry == 0){
                break;
            }//add var "number" to var "entry" of user inputed numbers
            if (entry >= 1 || entry <= -1){
                number = number + entry;
            }
        // print sum of entries excluding zero
        }System.out.println("Sum of the numbers: " + number);
        
    }
}