
import java.util.Scanner;
import java.util.ArrayList;

public class MyFrontToBack {

    public static void main(String[] args) {
    // create the word list for storing strings
        ArrayList<Integer> teachers = new ArrayList<>();

        teachers.add(1);
        teachers.add(2);
        teachers.add(3);
        teachers.add(4);
        
        //in a while loop backwards 
        //int index = numbers.size() - 1;
        // while (index >= 0) {
            // int number = numbers.get(index);
            // System.out.println(number);
            // index = index - 1;
        
            //System.out.println(teachers.size());
            //FOR LOOPS
            //iterate backwards (int i = xxxx.size()-1; indicates the index position ie 3 whose value is the number 4)
        for(int i = teachers.size()-1; i >= 0; i--)
       {
            System.out.println(teachers.get(i));
            
        }
        System.out.println("...and then: ");
        //iterate forward (index is 0, .size() is four, i ++)
        for(int i = 0; i < teachers.size(); i ++){
            System.out.println(teachers.get(i));
        }
    }    
}