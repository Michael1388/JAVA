//Introduce the Scanner tool used for reading
import java.util.Scanner;

public class MessageThreeTimes {

    public static void main(String[] args) {
        //Create the tool for reading, assign it to variable caller "scanner"
        Scanner scanner = new Scanner(System.in);
        //Print user a message "Write a message: "
        System.out.println("Write a message:");
         //Read the user's string input, save it to program memory
        //"String message = (user input)"
        String message = scanner.nextLine();
        // Print the user input three times
        System.out.println(message);
        System.out.println(message);
        System.out.println(message);
        

    }
}
