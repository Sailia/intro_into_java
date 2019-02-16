import java.util.Scanner;
public class SummingRange  {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int num1, num2, largest, smallest, sum = 0;
      
      System.out.print("Enter an integer: ");
      num1 = input.nextInt();
      System.out.print("Enter an integer: ");
      num2 = input.nextInt();
      
      largest = Math.max(num1, num2);
      smallest = Math.min(num1, num2);
      int i = smallest;
      
      while (i <= largest)   {
         //Stop when smallest is bigger than largest
         sum += i;
         i++;
      }
      
      System.out.println("The sum is : " + sum);
   }
}