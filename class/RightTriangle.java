import java.util.Scanner;

public class RightTriangle
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner(System.in);
      double a;
      double b;
      double c;
      
      
      System.out.println("Enter a: ");
      a = input.nextDouble();
      System.out.println("Enter b: ");
      b = input.nextDouble();
      System.out.println("Enter c: ");
      c = input.nextDouble();
      
      if(a < 0 || b < 0 || c < 0)
      {
         System.out.println("Please enter a positive number");
      }
      else
      {
         rightTriangle(a, b, c);
      }
      
   }
      
      public static void rightTriangle(double a, double b, double c)
      {
         double largest = Math.max(a,b);
         double next_largest = Math.max(largest,c);
         double smallest = Math.min(a,b);
         double next_smallest = Math.min(smallest,c);
         double sum_of_small = (Math.sqrt(smallest)) + (Math.sqrt(next_smallest));
         double middle = next_smallest;
         
         System.out.println(largest +" "+ next_largest +" "+ smallest + " " + next_smallest + " " + sum_of_small);
         
         next_largest = Math.max(largest, next_largest); 
         
         if(largest > next_largest)
         {
           if((Math.sqrt(largest)) == sum_of_small)
           {
              System.out.println("Can form a right angle"); 
           }
         }
         else if(next_largest > largest)
         {
           if((Math.sqrt(next_largest)) == sum_of_small)
           {
               System.out.println("Can form a right angle");
           } 
         } 
         else
         {
            System.out.println("Cannot form a right angle");
         }
         
      }
}