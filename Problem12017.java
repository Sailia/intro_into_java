import java.util.Scanner;

public class Problem12017  {
   public static void main(String[] args) {
      int a;
      int b;
      int c; 
      
      Scanner input = new Scanner(System.in);
      
      System.out.println("Enter a: ");
      a = input.nextInt();
      System.out.println("Enter b: ");
      b = input.nextInt();
      System.out.println("Enter c: ");
      c = input.nextInt();
      
      if(a % b == 0 && a % c == 0)  {
         System.out.println("a is a multiple of the other two.");
      }
      else if(b % c == 0 && b % c == 0)  {
         System.out.println("b is a multiple of the other two.");
      }
      else if(c % b == 0 && c % a == 0)  {
         System.out.println("c is a multiple of the other two.");
      }
      else  {
         System.out.println("NONE of them is a multiple of the other two.");
      }
   }
}