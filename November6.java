import java.util.Scanner;

public class November6 {
   public static void main(String[] args) {
      Scanner input = new Scanner( System.in );
      System.out.print("Enter the number of elements for your int array: ");
      int size = input.nextInt();
      int[] userArray = new int[size];
      int user;
      
      for(int i = 0; i < userArray.length; i++)
      {
         System.out.println("Enter an int");
         user = input.nextInt();
         userArray[i] = user;
         
      }
      
   }
   
}