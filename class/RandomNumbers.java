public class RandomNumbers
{
   public static void main( String[] args )
   {
      //Generate two random numbers one between 14 and 7 inclusive,
      //the other between 13 and 20 inclusive.  
      int num1;
      int num2;
      int howMany;
      
      howMany = 14 - 7 + 1;
      num1 = (int)(Math.random() * howMany) + 7;
      howMany = 20 - 13 + 1;
      num2 = (int)(Math.random() * howMany) + 13;
      
      System.out.println("num1 is " + num1);
      System.out.println("num2 is " + num2);
      
      if(num1 == num2)
      {
         System.out.println("Match!");
      }
      else
      {
         System.out.println("Try again");
      }
      
   }

}