
//The Integer.valueOf command converts a string to an integer. It takes the 
//string containing the value to be converted as a parameter.
import java.util.Scanner;

public class IntegerInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        //When using a Scanner object, the reading of the value is usually 
        //inserted directly into the type conversion. This happens like so:
        int number = Integer.valueOf(scanner.nextLine());
        
        System.out.println("You gave the number " + number);

    }
}