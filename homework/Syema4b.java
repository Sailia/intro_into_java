public class Syema4b
{
   public static void main( String[] args )
   {
      int num1;
      int num2;
      int num3;
      int rand;
      
      rand = 15;
      
      num1 = (int)(Math.random() * rand) + 1;
      num2 = (int)(Math.random() * rand) + 1;
      num3 = (int)(Math.random() * rand) + 1;
      
      System.out.println("The random numbers are: " + num1 + ", " + num2 + ", and " + num3); 
      
      if(num1 > num2 && num1 > num3)
      {
         if(num2 > num3)
         {
            largest = num1;
            middle = num2;
            smallest = num3;
         }
      }
      
   }

}