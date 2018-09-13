import java.util.Scanner;

public class Syema2b
{
   public static void main( String[] args )
   {
      //Create scanner object 
      Scanner input = new Scanner(System.in);
      
      //prompt the user for starting velocity 
      System.out.print( "Please enter the starting velocity: ");
      
      //set starting velocity to a variable
      double starting_velocity = input.nextDouble(); 
      
      //prompt the user for ending velocity
      System.out.print( "Please enter the ending velocity: ");
      
      //set ending velocity to a variable
      double ending_velocity = input.nextDouble();
      
      //prompt the user for time taken
      System.out.print( "Please enter the time taken: ");
      
      //set time taken to a variable
      double time = input.nextDouble(); 
      
      //calculate the average acceleration and set to a variable
      double average_acceleration = ((ending_velocity - starting_velocity) / time);
      
      //output average acceleration
      System.out.println( "The average acceleration is: " + average_acceleration ); 
      
   }

}