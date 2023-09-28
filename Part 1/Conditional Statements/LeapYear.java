//A year is a leap year if it is divisible by 4. However, if the year is 
//divisible by 100, then it is a leap year only when it is also divisible by 400.
//Write a program that reads a year from the user, and checks whether or not 
//it is a leap year.
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a year:     ");
        int year = Integer.valueOf(scan.nextLine());
        

        // Check if the year is divisible by 4 and not divisible by 100 or divisible by 400
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
        
        
//        boolean leap = false;
//        // if the year is divided by 4
//        if (year % 4 == 0) {
//          // if the year is century
//            if (year % 100 == 0) {
//            // if year is divided by 400
//            // then it is a leap year
//                if (year % 400 == 0){
//                    leap = true;
//                }else{
//                    leap = false;   
//          // if the year is not century
//                }
//            
//            }else{
//                leap = true;
//            }
//        
//        }else{
//            leap = false;
//        }
//        if (leap){
//            System.out.println(year + " is a leap year.");
//        }else{
//            System.out.println(year + " is not a leap year.");
//        }
    }
}