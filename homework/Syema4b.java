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
      
      int largest = Math.max(Math.max(num1,num2),num3);
      int smallest = Math.min(Math.min(num1,num2),num3);
      int middle = (num1 + num2 + num3) - (largest + smallest);
      
      System.out.println("The middle value is " + middle);
      
      
   }

}