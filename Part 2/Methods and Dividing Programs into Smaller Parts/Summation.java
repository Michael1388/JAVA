//Expand the method sum in the exercise template so that it calculates and 
//returns the sum of the numbers that are given as the parameters.

public class Summation {

    public static int sum(int num1, int num2, int num3, int num4) {
        //create method function
        int add = num1+num2+num3+num4;
        return add;
    }

    public static void main(String[] args) {
        int result = sum(4, 3, 6, 1);
        System.out.println("Sum: " + result);
    }
}
