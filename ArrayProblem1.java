public class ArrayProblem1 {
   public static void main(String[] args) {
      int[] array = {1,0,4,5,3};
      System.out.println(onlyOneOrFour( array ));  
   }
   
   public static boolean onlyOneOrFour( int[] arr ) {
      int arrayLength = arr.length;
      int count = 0;
      for( int index = 0; index < arrayLength; index++ ) {
         if( arr[index] == 1 || arr[index] == 4 ) {
            count++;
            if( count == arrayLength ) {
               return true;
            }
         }
      }
      return false;
   }
}