//Expand the previous program so that the main program asks the user for the 
//number of times the phrase will be printed (i.e. how many times the method will be called).
import java.util.Scanner;

public class Reprint {

    public static void main(String[] args) {
        // ask the user for how many times should the text be printed
        // then call the printText-method multiple times with a while-loop
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("How many times?");
        //read user input, store in var "times"
        int times = Integer.valueOf(scanner.nextLine());
        //iterate through for loop and call method "printText"
        
        for (int i = 1; i <= times; i++){
            printText();
        }
    }
    // create print line(return)for method written in previous exercise
    // Don't change the next line that defines the method!
    // (We aren't giving a method a parameter yet)
    public static void printText() {
        System.out.println("In a hole in the ground there lived a method");
    }
}
