//PART 1: Where to
//Write a program which prints the integers from 1 to a number given by the user.

//PART 2:
//Where from
//Ask the user for the starting point as well.

//If the upper limit is smaller than the starting point, nothing is printed:
//NB remember that the lower and upper limits can be negative!

import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //ask use for a number
        System.out.println("Where to? ");
        //read user entries
        int wTo = Integer.valueOf(scanner.nextLine());
        //ask use for a  number
        System.out.println("Where from? ");
        int wFrom = Integer.valueOf(scanner.nextLine());
        //Part 1 solution alone
//        for(int i = 1; i <= wTo; i++){
//            System.out.println(i);
//        }
        //Part 2 solve for x and print the result      
        for(int j = wFrom; j <= wTo; j++){
            System.out.println(j);
        }
    }
}
