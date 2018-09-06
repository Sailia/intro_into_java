import java.util.Scanner;

class September6
{
   public static void main( String[] args )
   {
      
      Scanner input = new Scanner(System.in);
      
      // set empty int variable 
      int sum1;
      int sum2;
      
      //get two int inputs to set to int variable
      System.out.println("Please enter a number to be added: ");
      sum1 = input.nextInt();
      System.out.println("Please enter another number to be added: ");
      sum2 = input.nextInt();
      
      //calculate total
      int total = sum1 + sum2;
      
      //output total
      System.out.println("The total is " + total);
      
   
   }
   
}

//Class version:

class September6_
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner(System.in);
      
      /*
      //get two int inputs 
      System.out.println("Enter an integer: ");
      int first = input.nextInt();
      System.out.println("Enter an integer: ");
      int second = input.nextInt();
      
      //calculate total:
      int total = first + second;
      
      //output total
      System.out.println("The sum is " + total);
      
      int num1 = 19;
      int num2 = 7;
      
      int sum = num1 + num2;
      int difference = num1 - num2;
      int product = num1 * num2;
      int remainder = num1 % num2;
      
      System.out.println( "The sum is " + sum );
      System.out.println( "The difference is " + difference );
      System.out.println( "The product is " + product );
      System.out.println( "The remainder is " + remainder );
      */
      
      /*
      int x = 3;
      double y = x;
      
      //implicit cast:
      System.out.println( "y is " + y );
      */
      
      double y = 4.5;
      int x = (int)y;
      
      System.out.println( "x is " + x );

   
      
   }
   
}