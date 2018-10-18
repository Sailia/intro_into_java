public class Accumulation
{
   public static void main( String[] args )
   {
      int sum = 0;
      int count = 1;
      while( count <= 100 )
      {
         sum = sum + count; //accumulator variable 
         count = count + 1;
      }
    System.out.println( count );
   }

}