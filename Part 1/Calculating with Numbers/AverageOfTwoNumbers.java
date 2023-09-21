//Write a program that asks the user for two integers and prints their average.
import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        //System.out.println(first);
        
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());
        //System.out.println(second);
        
        double result = 1 * first + second;
        System.out.println("The average is " + result/2);

    }
}