public class ArrayProblem2 {
   public static void main( String[] args ) {
      int[] array = {4,12,0,16,32,8};
      System.out.println(howManyOdds(array));
   }
   
   public static int howManyOdds( int[] arr ) {
      int counter = 0;
      
      for( int index = 0; index < arr.length; index++ ) {
         if( arr[index] % 2 != 0 ) {
            counter += 1;
         }
      }
      return counter;
   }
}