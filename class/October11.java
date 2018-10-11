public class October11
{

   public static void main( String[] args )
   {
   
      System.out.println("Start");
      welcome();
      System.out.println("result is: " + add(5,6));
      System.out.println("End");
   }
   
   public static int add(int a, int b)
   {
      int sum = a + b;
      
      return sum;
   }
   
   public static void welcome()
   {
      System.out.println("Welcome");
   }
}

//return means to go back to main
//study control flow in book