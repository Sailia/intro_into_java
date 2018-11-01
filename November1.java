import java.util.Scanner;

public class November1 {
   
   public static void main( String[] args ){
      Scanner input = new Scanner(System.in);
      
      int[] nums = new int[4];
      System.out.println("The second element in nums is " + nums[1]);
      nums[1] = 7;
      System.out.println("The second element in nums is " + nums[1]);
      int product = 2 * nums[1];
      System.out.println("Product is " + product);
      
      
      //Declare an array of ints called temps with values 5, 6, and 0 
      int[] temps = { 5, 6, 0 };
      System.out.println("The second element in nums is " + temps[1]);
   }
   
 
   
}