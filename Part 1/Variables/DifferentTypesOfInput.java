
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a string: ");
        String textValue = scan.nextLine();
        System.out.println("Give an integer: ");
        int intValue = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double: ");
        double dubValue = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean: ");
        boolean boolValue = Boolean.valueOf(scan.nextLine());
        
        System.out.println("You gave the string " + textValue);
        System.out.println("You gave the integer " + intValue);
        System.out.println("You gave the double " + dubValue);
        System.out.println("You gave the boolean " + boolValue);
        

    }
}