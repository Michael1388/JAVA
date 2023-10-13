//Implement a program, which calculates the sum 1+2+3+...+n where n is given as user input.
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Last number? ");
        //store user inout into var n
        int n = Integer.valueOf(scanner.nextLine());
        //initialize var sum as 0 to keep up with sum
        int sum = 0;
        //iterate from 1 to n
        for (int i = 1; i <= n; i++){
            // add current value of i to sum
            sum += i;     
        }
        System.out.println("The sum is " + sum ); 
    }
}
