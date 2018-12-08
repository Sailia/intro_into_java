import java.util.Scanner;

public class Problem32017  {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int n;
      System.out.print("Enter an int:");
      n = input.nextInt();
      
      int[] arr = new int[n];
      int count = 1;
      
      for(int index = 0; index < arr.length; index++) {
         arr[index] = count;
         count++;
      }
      
      count = 0;
      for(int index = 1; index < arr.length; index++) {
         arr[count] = index;
         arr[index] = index;
         System.out.print("Line " + index + ":   "); 
         for(int inner = 0; inner < arr.length; inner++) {
            System.out.print(arr[inner]);
         }
         count++;
         System.out.println();
      }
      
   }
}