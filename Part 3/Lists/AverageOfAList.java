//The exercise template contains a base that reads numbers from the user and adds
// them to a list. Reading is stopped once the user enters the number -1.

//When reading ends, calculate the average of the numbers in it, and then print that value.

import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }
        
        System.out.println("");
        // Then it computes the average of the numbers on the list
        
        // sum the list
        int sum = 0;
        for (int i = 0; i < list.size(); i++){
            sum += list.get(i);}
            //System.out.println("Sum: " + sum);
            
            //Average the sum: "sum code / average code"
           
            if(list.size() > 0){
            double result = list.size();
            System.out.println("Average: " + sum/result);
        }
    }
}