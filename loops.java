public class loops
{
   public static void main( String[] args )
   {
      int result = 1;
      int count = 1;
      
      while ( count <= 10 )
      {
         result *= count;
         count++;
      }
      System.out.println(result);
   }

}