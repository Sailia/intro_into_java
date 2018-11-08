public class ArrayProblems3 {
   public static void main(String[] args) {
     int[] arr = {22,2,0};
     
     System.out.println(sumOfAllEvens(arr)); 
   }
   
   public static int sumOfAllEvens( int[] arr ) {
      int counter = 0;
      
      for( int index = 0; index < arr.length; index++ ) {
         if( arr[index] % 2 == 0 ) {
            counter += arr[index];
         }
      }
      return counter;
   }
}