import java.util.Scanner;
/**
 * take in two 3D vectors and compute their dot product
 * @ Gavin 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Create scanner for user input
    Scanner input = new Scanner(System.in);

    // create array to represent x
    int[] x = new int[4];
   
    // ask user to enter 3 number    
    System.out.println("Please enter the 3 values for the first vector");
    
    // create for loop for x
    for(int i = 1; i < x.length; i++){
      x[i] = input.nextInt();
    }
  
    // create array to represent y
    int[] y = new int[4];
    
    // ask user to enter 3 number    
    System.out.println("Please enter the 3 values for the second vector");
    
    // create for loop for y
    for(int i = 1; i < y.length; i++){
      y[i] = input.nextInt();
    }
    
    // create variable to represent the equation
    int sum1 = (x[1] * y[1]);
    int sum2 = (x[2] * y[2]);
    int sum3 = (x[3] * y[3]);

    // determine answer
    System.out.println("The dot product is " + (sum1 + sum2 + sum3));
  }
}
