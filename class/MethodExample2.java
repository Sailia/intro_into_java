public class MethodExample2
{
   public static void main( String[] args )
   {
      int sum1, sum2, sum3;
      
      sum1 = add(1,4);
      System.out.println(sum1);
      
      sum2 = add(3,5);
      System.out.println(sum2);
      
      sum3 = add(10,6);
      System.out.println(sum3);
      
   }
   
   public static int add(int a, int b)
   {
      int result = a + b;
      
      return result;
   }

}