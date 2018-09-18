import java.util.Scanner;

public class September11
{
  public static void main( String[] args )
  {
   //create scanner object 
   Scanner input = new Scanner(System.in);
   
   double num1;
   double num2;
   
   //quiz on slides 1 and 2 
   
   System.out.println( "Please enter a decimal number: " );
   num1 = input.nextDouble();
   
   System.out.println( "Please enter another decimal number: " );   
   num2 = input.nextDouble();
   
   //Type cast the values 
   // (int) = casting operator  
   int a = (int)num1;
   int b = (int)num2;
   
   System.out.println( "converted decimal is " + a );
   System.out.println( "converted decimal is " + b );
  } 

}