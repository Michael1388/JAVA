import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
        //Create the tool for reading, assign it to variable called "scanner"
        Scanner scanner = new Scanner(System.in);
        
        //Print user a message "What's your name? "
        System.out.println("What's your name?");
         
        // Read the string written by the user, and assign it
        // to program memory "String name = (string that was given as input)"
        String name = scanner.nextLine();
        
        // Print "Hi " plus the user's input
        System.out.println("Hi " + name);

    }
}