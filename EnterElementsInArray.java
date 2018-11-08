import java.util.Scanner;

public class EnterElementsInArray  {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      System.out.println("How many elements do you want in your array? ");
      int len = input.nextInt();
      int temp;
      int[] numbers = new int[len];
      
      for(int i = 0; i < numbers.length; i++) {
         System.out.print( "Enter element integer " + (i + 1) + ": ");
         temp = input.nextInt();
         numbers[i] = temp;
      }
      
      for(int i = 0; i < numbers.length; i++) {
         System.out.print(numbers[i] + " ");
      }
   }
}