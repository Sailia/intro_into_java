import java.util.Scanner;

public class Range
{
   public static void main( String[] args )
   {
      int a;
      int b;
      int answer;
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a: ");
      a = input.nextInt();
      System.out.println("Enter b: ");
      b = input.nextInt();  
      
      answer = rangeProduct(a, b); 
      
      System.out.println(answer);
         
   }
   
   public static int rangeProduct( int a, int b )
   {
      int product = 0; //why doesn't product work without assignment here? 
      b++;
      while (a < b)
      {
         product += (a * (a + 1));
         a++;
      }
      return product; // I don't understand why my logic is wrong... 
   }
}