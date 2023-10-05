//Write a program that reads an integer from the user and prints the square 
//of the given integer, i.e. the integer multiplied by itself.
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a number to find the quare root: ");
        int square = Integer.valueOf(scanner.nextLine());
        
        int product = square*square;
        System.out.println(product);
    }
}
