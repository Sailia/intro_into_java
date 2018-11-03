public class Syema6a {
   public static void main( String[] args ) {
         
         int[] array = { 35, 67, 45, 45, 55, 55, 78};
         System.out.println(indexOfFirstPair(array));
   }
   public static boolean previousElement( int[] array, int index) {
      //if the index is not the beginning of the array 
      if(index != 0) {
         //if the element is not equal to the element before it, return true 
         if(array[index] != array[index - 1]) {
            return true;
         }
      }
      return false;
   }
   
   public static boolean nextElement( int[] array, int index ) {
      //if the index is not at the end of the array 
      if(index != (array.length - 1)) {
         //if the element is the same as the element after it, return true 
         if(array[index] == array[index + 1]) {
            return true;
         }
      }
      return false;
   }
     
   public static int indexOfFirstPair( int[] array ) {
      int arrayLength = array.length;
      int arrayResult = array[arrayLength - 1];
      
      for( int index = 0; index <= arrayLength - 1; index++ ) { 
         if( previousElement(array, index) && nextElement(array, index)) {
            if( !nextElement(array, index + 1) ) {
               return arrayResult = array[index];
            }
         }
      } 
      return arrayResult;
   }
}