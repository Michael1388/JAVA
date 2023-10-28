// Star sign - 4 parts

public class StarSign {

    public static void main(String[] args) {
        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        printStars(5);
        printStars(3);
        printStars(9);
        System.out.println("--- ");  // printing --- between the shapes
        printSquare(4);
        System.out.println("---");
        printRectangle(5, 6);
        System.out.println("---");
        printTriangle(3);
        System.out.println("---");
    }
    //Define a method called printStars that prints the given number of stars and a line break.
    public static void printStars(int number) {
        // first part of the exercise
        int shape = 1;
        while (shape <= number) {
            printTable(shape, number);
            return;
        }    
    }
    public static void printTable(int number, int coefficient) {
        //
        int printable=number;
        while (printable <= number * coefficient) {
            System.out.print("*");
            printable+=number;
        }
        System.out.println("");
    }
    //Define a method called printSquare(int size) that prints a suitable 
    //square with the help of the printStars method.
    public static void printSquare(int size) {
        // second part of the exercise
        int shape = 1;
        while (shape <= size) {
            printStars(size);
            shape++;            
        }    
    }
    //Write a method called printRectangle(int width, int height) that prints 
    //the correct rectangle by using the printStars method. 
    public static void printRectangle(int width, int height) {
        // third part of the exercise
        int printable = width;
        while (printable <= width * height) {
            //System.out.print(" ");
            printable += width;
            printStars(width);
        }
    }
    //Create a method called printTriangle(int size) that prints a triangle 
    //by using the printStars method.
    public static void printTriangle(int size) {
        // fourth part of the exercise
        int i = 0;
        while(i <= size){
            printStars(i);
            i++;
        }   
    }
}
