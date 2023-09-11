//The Double.valueOf command converts a string to a double. It takes the 
//string containing the value to be converted as a parameter.
import java.util.Scanner;

public class DoubleInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number: ");
        //As with integers, the reading is nested within the conversion. 
        //This is done as follows:
        double number = Double.valueOf(scanner.nextLine());
        System.out.println("You gave the number " + number);

    }
}
