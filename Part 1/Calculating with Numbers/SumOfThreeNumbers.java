//Write a program that asks the user for three numbers. After this the program
//prints the sum of the numbers given by the user.
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int number1 = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give the second number:");
        int number2 = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give the third number:");
        int number3 = Integer.valueOf(scanner.nextLine());
        
        System.out.println("The sum of the numbers is " + (number1 + number2 + number3));

    }
}
