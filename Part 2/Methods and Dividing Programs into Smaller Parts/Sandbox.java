// import java.util.Scanner;


// public class Sandbox {

//     public static void main(String[] args) {
//         Scanner reader = new Scanner(System.in);

//         System.out.print("Write numbers, negative numbers are invalid: ");
//         int sum = 0;
//         int validNumbers = 0;
//         int invalidNumbers = 0;

//         while (true) {
//             int input = Integer.valueOf(reader.nextLine());

//             if (input == 0) {
//                 System.out.println("Sum of valid numbers: " + sum);
//                 System.out.println("Valid numbers: " + validNumbers);
//                 System.out.println("Invalid numbers: " + invalidNumbers);
//                 break;
//             }

//             if (input < 0) {
//                 invalidNumbers++;
//                 continue;
//             }

//             sum += input;
//             validNumbers++;
//         }
        
//     }
// }

import java.util.Scanner;

public class Sandbox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // program code
        System.out.println("Let's try if we can travel to the method world:");
        greet();

        System.out.println("Looks like we can, let's try again:");
        greet();
        greet();
        greet();
    }

    // own methods
    public static void greet() {
        System.out.println("Greetings from the method world!");
    }
}
