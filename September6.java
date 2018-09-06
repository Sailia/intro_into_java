import java.util.Scanner;

class September6
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner(System.in);
      
      int sum1;
      int sum2;
      System.out.println("Please enter a number to be added: ");
      
      sum1 = input.nextInt();
      
      System.out.println("Please enter another number to be added: ");
      
      sum2 = input.nextInt();
      
      int total = sum1 + sum2;
      
      System.out.println("The total is " + total);
      
   
   }
   
}

//Class version:

class September6_
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner(System.in);
      
      
      //get two int inputs 
      System.out.println("Please enter a number to be added: ");
      int first = input.nextInt();
      System.out.println("Please enter another number to be added: ");
      int second = input.nextInt();
      
      //calculate total:
      int total = first + second;
      
      //output total
      System.out.println("The total is " + total);
   }
   
}