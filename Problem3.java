import java.util.Scanner;

public class Problem3   {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int num = 0, count = 3, num2 = 0;
      
      while(count > 1)  {
         System.out.print("Enter an integer: ");
         num = input.nextInt();
         
         System.out.println("");
         
         if(num == num2)  {
            num2 = num;
            count--; 
         } else   {
            count = 3;
            num2 = num;
         }
      }
      
      System.out.println("Same entered 3 in row.");
   }  
}