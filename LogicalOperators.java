public class LogicalOperators 
{

   public static void main( String[] args )
   {
      boolean r1 = false;
      boolean r2 = false;
      boolean r3 = false;
      
      // boolean result = r1 && r2;
      
      // r1 = 2 >= 0;
//       r2 = 3 == 4;
//       
//       System.out.println( "r1 is " + r1 );
//       System.out.println( "r2 is " + r2 );
      // System.out.println( "r1 && r2 is " + result );
      
      r1 = 2 >= 2; //true
      r2 = 3 == 4; //false
      r3 = 2 == 2; //true 
      
      
      boolean result = r1 ^ r2;
      boolean result2 = r1 ^ r3;
      
      System.out.println( result );
      System.out.println( result2 );
   }

}