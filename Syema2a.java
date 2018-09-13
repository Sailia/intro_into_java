import java.util.Scanner;

public class Syema2a
{
   public static void main( String[] args )
   {
      //The program will calculate the volume of a sphere and display it
      //The volume of a sphere is 4 / 3 * pi * radius ^ 3 
      //The program must prompt the user for the radius 
      //print the value entered by the user and the calculated volume on a single line  
      
      //set pi definition, create an empty radius variable and create converted division to double variable
      Scanner input = new Scanner(System.in);
      double pi = 3.14;
      double radius;
      double division_converted_to_double = (double)4/3;
      
      //The program must prompt the user for the radius
      System.out.println( "Please enter a radius: ");
      
      //set the input to radius variable 
      radius = input.nextDouble();
      
      //The volume of a sphere is 4 / 3 * pi * radius ^ 3
      double volume = division_converted_to_double * pi * radius * radius * radius;
      
      //output the calculated volume 
      System.out.println("With a radius of " + radius + " the volume is: " + volume);
      
   }

}