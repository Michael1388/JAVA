        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        

//Next, we'll implement a program one piece at a time. 
//This is always strongly recommended when coding.

//Repeating, breaking and remembering (5 parts)

// Part 1: Reading: 
//Implement a program that asks the user for numbers (the 
//program first prints "Write numbers: ") until the user gives the number -1.
//When the user writes -1, the program prints "Thx! Bye!" and ends.


//Part 2: Sum of numbers: 
//Extend the program so that it prints the sum of the
//numbers (not including the -1) the user has written.

//Part 3: Sum and the number of numbers:
//Extend the program so that it also prints the number of numbers 
//(not including the -1) the user has written.

//Part 4: Average of numbers:
//Extend the program so that it prints the mean of the numbers 
//(not including the -1) the user has written.

//Part 5: Even and odd numbers:
//Extend the program so that it prints the number of even and odd numbers (excluding the -1).

import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give numbers:");
        //count
        int sum = 0;
        int numNums = 0;
        double avNums = 0;
        int even = 0;
        int odd = 0;
        
        while (true){
            int num = Integer.valueOf(scanner.nextLine());
            //if -1 break; then go to print
            if (num == -1){
                break;
            }
            //even or odd?
            if (num % 2 == 0){
                even++;
            }else{
                odd++;
            }
            //if not -1 then add Sum, count Numbers,count avNums
            if (num != -1){
                sum = sum + num;
                numNums++;
                avNums++;
                continue;
            }
        }
        //print accompanying result
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numNums);
        //create double avg to print Average result
        double avg = sum/avNums;
        System.out.println("Average: " + avg);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
