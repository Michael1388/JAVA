//Write a program that reads values from the user until they input a 0. 
//After this, the program prints the total number of inputted values. 
//The zero that's used to exit the loop should not be included in the 
//total number count.
import java.util.Scanner;

public class NumberOfNumbers {

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
            }//increase var "number" by 1 if user inputs number other than zero
            if (entry >= 1 || entry <= -1){
                number = number + 1;
            }// print total number of entries excluding zero entered
        }System.out.println("Number of numbers: " + number);
        
    }
}
