//Write a method 
//public static void divisibleByThreeInRange(int beginning, int end) 
//that prints all the numbers divisible by three in the given range. The numbers
// are to be printed in order from the smallest to the greatest.
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //call method and pass in parameters
        divisibleByThreeInRange(2,10);
    }// create method and print the result
    public static void divisibleByThreeInRange(int beginning, int end){
        int i = beginning;
        for (i = beginning; i <= end; i++){
            if (i % 3 == 0){
                System.out.println(i);   
            } 
        }   
    }

}
