//Write a method public static String word(). 
//The method must return a string of your choice.
import java.util.Scanner;

public class Word {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //call method word
        String stringOf = word();
        System.out.println(stringOf);
        
    }//create String method word
    public static String word(){
        return ("my choice");
    }
}