import java.util.Scanner;

public class CheckIfSame
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner(System.in);
      
      //Prompt the user for two integers
      
      System.out.println("Please enter a number: ");
      int num1 = input.nextInt();    
      
      System.out.println("Please enter a second number: ");
      int num2 = input.nextInt();
      
      /*
      1.Write a program named CheckIfSame.java2.
      Prompt the user for two integers.  
      The program should determine whether the two integers 
      have the same quotient when divided by 10, and if they are divisible by 10
         a.If the two integers have the same quotient, print “Quotients are the same!”
         b.If they are both evenly divisible by 10, print “Both divisible by ten!”
      */
      
      if(num1 / 10 == num2 / 10)
      {
         System.out.println("Quotients are the same!");
      
         if(num1 % 10 == 0 && num2 % 10 == 0)
         {
            System.out.println("Both divisible by ten!");
         } 
      
      /*
      3.If the two integers are both divisible by 10 and have the same quotient, 
      check whether the quotient is divisible by 2.
      If they are, print “Quotients are divisible by two!”, 
      if not print “Quotients are not divisible by two!”
      */
            if((num1 / 10 == num2 / 10) && (num1 % 10 == 0 && num2 % 10 == 0))
            {
               if(num1 % 2 == num2 % 2)
               {
                  System.out.println("Quotients are divisible by two!");
               }
               else
               {
                  System.out.println("Quotients are not divisible by two");
               }
         }
      }
      /*
      4.If the two integers are not divisible by 10, 
      check if the two integers have the same remainder when divided by 10.  
      If they do, print “Remainders are the same!”
      */
      else if((num1 % 10 != 0) && (num2 % 10 != 0))
      {
         if(num1 % 10 == num2 % 10)
         {
            System.out.println("Remainders are the same!");
         }
      }
      /*
      5.If they do not have the same quotient, are not divisible by 10, 
      and do not have the same remainder when divided by 10, 
      print “Nothing is the same!”
      */
      if((num1 / 10 != num2 / 10) && (num1 % 10 != 0 && num2 % 10 != 0) && (num1 % 10 != num2 % 10))
      {
         System.out.println("Nothing is the same!");
      }
   }

}