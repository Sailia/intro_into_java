public class MethodExample
{
   public static void main( String[] args )
   {
   
      double b = 3.1;
      
      double c = twice(b);
      System.out.println("c: " + c);

   }
   
   public static double twice(double a)
   {
      double result = a * 2;
      
      return result;
   }
}