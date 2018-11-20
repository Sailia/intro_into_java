import java.util.Scanner;

public class NumberTriangle   {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter an integer n: ");
      int n = input.nextInt();
      System.out.print("Enter an integer k: ");
      int k = input.nextInt();
      int column = 0;

            
       for(int counter = 1; counter <= k; counter++)  {
       System.out.println();
          while(column < counter)   {
            System.out.print(n + " ");
            column++;
         }
         column = 0;
         n++;
      }

   }
   
}