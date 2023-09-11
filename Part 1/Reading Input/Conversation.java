import java.util.Scanner;

public class Conversation {
    
    public static void main(String[] args) {
        // Create a tool for reading user input and name it "scanner"
        Scanner scanner = new Scanner(System.in);
       
        // Print "any message"
        System.out.println("Greetings! How are you doing?");
        
        // Read the string written by the user, and assign it
        // to program memory "first"
        String first = scanner.nextLine();  
        System.out.println("Oh, how interesting. Tell me more!");
        String second = scanner.nextLine();
        System.out.println("Thanks for sharing!");
        
    }
}