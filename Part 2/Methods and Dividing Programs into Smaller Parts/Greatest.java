//Define a method called greatest that takes three numbers and returns the 
//greatest of them. If there are multiple greatest values, returning one of 
//them is enough. Printing will take place in the main program.

public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        //create method functionality
        int one = number1;
        int two = number2;
        int three = number3;
        
        if(one > two && one > three){
            return one;
        }else if(two > one && two > three){
            return two;
        }else{
            return three;
        }
        
    }
    //call method
    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
