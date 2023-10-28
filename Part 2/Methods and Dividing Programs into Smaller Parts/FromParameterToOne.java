//Create the following method in the exercise template: 
//public static void printFromNumberToOne(int number). 
//It should print the numbers from the number passed as a parameter down to one.

public class FromParameterToOne {

    public static void main(String[] args) {
        // call method and pass in parameter
        printFromNumberToOne(10);

    }//create method printFromNumberToOne as decribed above
    public static void printFromNumberToOne(int number){
        int i = number;
        while (i >= 1){
            System.out.println(i);
            i--;
        }
    }

}
