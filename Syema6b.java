public class Syema6b {
   public static void main( String[] args ) {
      int[] arr = {1, 2, 3, 4, 3, 3, 3, 5};
      int b = 3;
      SnewSmallerArray( arr, b );   
   }
   
   public static int changeSecondArrayLength( int[] array, int num ) {
      int counter = 0;
      for( int index = 0; index < array.length; index++ ) {
         if (array[index] == num) {
            counter += 1;
         } 
      }
      return counter;
   }
   
   public static int[] newSmallerArray( int[] A, int b) {
      int minusB = changeSecondArrayLength(A, b);
      System.out.println(minusB);
      int[] secondArray = new int[A.length];
      
      for(int index = 0; index < A.length; index++) {
         //if the element in the array is not matching the number b 
         if(A[index] != b) 
            //get the index from array A and set that element to the same index in secondArray 
            secondArray[index] = A[index]; 
         }
      }
      return secondArray;   
   }
}