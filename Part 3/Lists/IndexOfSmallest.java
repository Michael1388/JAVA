//1. Write a program that reads numbers from the user. 
//2. When number 9999 is entered,the reading process stops.
//3. After this the program will print the smallest number in the list, 
//4. and also the indices where that number is found. 
//5. Notice: the smallest number can appear multiple times in the list.


import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // implement here a program that reads user input
        // until the user enters 9999
        ArrayList<Integer> list = new ArrayList<>();
        while(true){
        int input = scanner.nextInt();
        if(input == 9999){
            break;
        }
        list.add(input);
        
        }//end of while loop

        System.out.println(""); // new line empty space
        
        // after that, the program prints the smallest number ...
        int smallest = list.get(0);        
        for(int i = 0; i < list.size(); i++){
            int number = list.get(i);
            if (smallest > number){
                smallest = number;     
            }                
        }
        System.out.println("Smallest number: " + smallest);
        
        // and its index -- the smallest number
        // might appear multiple times
        
        for(int i = 0; i < list.size(); i++){                
            if(smallest == list.get(i)){
            System.out.println("Found at index: " + i);
            
            }                 
        }
    }
}
