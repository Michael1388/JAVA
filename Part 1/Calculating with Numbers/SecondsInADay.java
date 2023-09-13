// implement a program that asks the user for the number of days. After that,
//the program prints the number of seconds in the given number of days.
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many days would you like to convert to seconds?");
        int number = Integer.valueOf(scanner.nextLine());
        int sum = number * 24 *60 *60;
        System.out.println(sum);

    }
}
