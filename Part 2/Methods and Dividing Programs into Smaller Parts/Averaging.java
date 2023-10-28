//Create a method called average that calculates the average of the numbers 
//passed as parameters. The previously created method sum must be used inside 
//this method!

public class Averaging {

    // implement the sum method here again
    public static double sum(int number1, int number2, int number3, int number4) {
        //create method sum
        double add = number1+number2+number3+number4;
        return add;
    }

    public static double average(int number1, int number2, int number3, int number4) {
        //create method average
        int one = number1;
        int two = number2;
        int three = number3;
        int four = number4;
        //return the result of method average calling method sum and / by number
        // of integer parameters passed in, in this case 4
        double avg = sum(one, two, three, four)/ 4;
        return avg;
    }

    public static void main(String[] args) {
        double result = average(4, 3, 6, 1);
        System.out.println("Average: " + result);
    }
}
