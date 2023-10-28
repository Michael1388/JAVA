//Advanced astrology (3 parts)

public class AdvancedAstrology {
    
    
    //part 1a of the exercise
    
    //You will also have to either copy the printStars method from your previous 
    //exercise or reimplement it in this exercise template.

    public static void printStars(int number) {
        // part 1 of the exercise
        int i = 0;
        while (i < number){
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }
    
    //part 1b of the exercise
    
    //Define a method called printSpaces(int number) that produces the number
    // of spaces specified by number. The method does not print the line break.
    
    public static void printSpaces(int number){
        // part 1 of the exercise
        int i = 0;
        while (i < number){
            System.out.print(" ");
            i++;
        }
    }
    
    //part 2 of the exercise
    
    //Printing a right-leaning triangle
    //Create a method called printTriangle(int size) that uses printSpaces and 
    //printStars to print the correct triangle. 
    

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int i = 0;
        int j = size;
        if(size == 1){
            System.out.print("*");
            System.out.println("");
        }else{
            while (i <= size){
                if (i != 0){
                    printSpaces(j);
                    printStars(i);
                }
                j--;
                i++;
            }
        }
    }
        //part 3 of the exercise
    
        //Define a method called christmasTree(int height) 
        //that prints the correct Christmas tree. The Christmas tree consists of
        // a triangle with the specified height as well as the base. 
        //The base is two stars high and three stars wide, and is placed at the 
        //center of the triangle's bottom. The tree is to be constructed by 
        //using the methods printSpaces and printStars.
    
    public static void christmasTree(int height){
        
        int i = 1;
        int j = height - 1;
        
        while (i <= height){
            printSpaces(j);
            printStars(i*2-1);
            i++;
            j--;
        }
        printSpaces(height-2);
        printStars(3);
        printSpaces(height-2);
        printStars(3);
    }
        
    //main class
    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.
        

        printTriangle(3);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}