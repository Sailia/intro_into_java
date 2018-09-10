import java.util.Scanner;

public class SumSpaced 
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner(System.in);
      
      int sum = 0, n = 0;
      
      System.out.print("Please enter a number between 1-140");
      n = input.nextInt();
      
      sum = n*(n+1)/2;
      
      int sum1 = (sum / 1) % 10;
      int sum2 = (sum / 10) % 10; 
      int sum3 = (sum / 100) % 10;
      int sum4 = (sum / 1000) % 10;
      
      System.out.println(sum4 + " " + sum3 + " " + sum2 + " " + sum1);

   
   }


}