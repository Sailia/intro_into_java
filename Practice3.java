import java.util.Scanner;

public class Practice3  {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int n = 0;
      
      //Stopping: n == -1
      while (n != -1) {
         System.out.print("Enter a number: ");
         n = input.nextInt();
         
         if (n % 2 == 0 && n != -1)   {
            System.out.println("Even");
         } else if (n != -1)  {
            System.out.println("Odd");
         }
      }
      
   }
}