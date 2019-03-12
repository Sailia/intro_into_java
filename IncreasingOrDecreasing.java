import java.util.Scanner;
public class IncreasingOrDecreasing {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int n1, n2, n3;
      
      System.out.print("Enter value: ");
      n1 = input.nextInt();
      System.out.print("Enter value: ");
      n2 = input.nextInt();
      System.out.print("Enter value: ");
      n3 = input.nextInt();
      
      if(n1 < n2 && n2 < n3)  {
         System.out.println("INCREASING!");
      } else if (n1 > n2 && n2 > n3)   {
         System.out.println("DECREASING!");
      } else {
         System.out.println("NEITHER!");
      }
   }
}