import java.util.Scanner;

public class Sums
{
   public static void main( String[] args )
   {
      //controller 
      int num1 = userInput();
      
      int sum = addSum(userInput(), num);
      boolean check = (checkSum(sum, num1));
      int counter = 0;
      
      while (check == false)
      {
         num = userInput();
         sum = addSum(userInput(), num);
         check = checkSum(sum, num);
         counter++;
      }   
      System.out.println("You entered " + counter + " ints");
   }
   
   public static int userInput()
   {
      //takes in user input and returns the input 
      System.out.println("Enter an int: ");
      Scanner input = new Scanner(System.in);
      int number = input.nextInt();
      return number;
   
   }
   
   public static int addSum(int sum, int num)
   {
      //adds user input and returns the total  
      sum += num;
      return sum;
   {
   
   public static boolean checkSum(int sum, int num)
   {
      //checks if the total is equal to the last input 
      
      if(sum == num)
      {
         return true;
      }
      else
      {
         return false;
      }
   
   }

}