import java.util.Scanner;

public class ShippingCosts
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner(System.in);
      
      System.out.println("Enter the weight of the package: ");
      
      double weight = input.nextDouble();
      
      System.out.println("");
      
      if(weight >= 0.1 && weight <= 1.0)
      {
         System.out.println("The cost is $3.50");
      }
      else if(weight >= 1.1 && weight <= 3.0)
      {
         System.out.println("The cost is $5.50");
      }
      else if(weight >= 3.1 && weight <= 10.0)
      {
         System.out.println("The cost is $8.50");
      }
      else if(weight >= 10.1 && weight <= 20.0)
      {
         System.out.println("The cost is $5.50");
      }
      else if(weight > 20.0)
      {
         System.out.println("Package cannot be shipped.");
      }
   }

}