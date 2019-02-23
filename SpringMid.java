import java.util.Scanner;

public class SpringMid  {
   public static void main(String[] args) { 
      Scanner input = new Scanner(System.in);
      double num1, num2, num3;
      System.out.print("Enter a: ");
      num1 = input.nextDouble();
      System.out.print("Enter b: ");
      num2 = input.nextDouble();
      System.out.print("Enter c: ");
      num3 = input.nextDouble();
      
      if (num1 < num2 && num2 < num3)   {
         System.out.print("Sum: " + (num1 + num2 + num3));
      } else if (num1 > num2 && num2 > num3) {
         System.out.print("Minus: " + (num1 - num2 - num3)); 
      } else if (num1 == num2 || num1 == num3 || num2 == num3) {
         if (num1 == num2) {
            System.out.print("Same: " + num1);
         } else if (num1 == num3)   {
            System.out.print("Same: " + num3);
         } else {
            System.out.print("Same: " + num2);
         }
      } else {
         System.out.print("Product: " + Math.round(num1 * num2 * num3));
      } 
   }
}