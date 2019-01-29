import java.util.Scanner;

public class Problem1Jan28 {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int soda, candy;
      System.out.print("Enter soda amount: ");
      soda = input.nextInt();
      System.out.print("Enter candy amount: ");
      candy = input.nextInt();
      
      if (soda < 5 || candy < 5)  {
         System.out.println("Party is bad");
      } else if( candy >= (soda * 2) || soda >= (candy * 2))   {
         System.out.println("Party is great");
      } else {
         System.out.println("Party is good");
      }
   }
}