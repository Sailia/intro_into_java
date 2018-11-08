// Create a program named November8 Create an int array with 5 elements. Populate  each element with a random number from 1 to 100 
import java.util.Scanner;

public class November8 {
   public static void main( String[] args ) {
      int random;
      //int array with 5 elements 
      int[] numbers = new int[5];
      
      for(int index = 0; index < numbers.length; index++)   {
         random = (int)(Math.random() * 100) + 1;
         numbers[index] = random;  
      }
      
      for(int index = 0; index < numbers.length; index++)   {
         System.out.print( numbers[index] + " " );
      }
      
   }
}