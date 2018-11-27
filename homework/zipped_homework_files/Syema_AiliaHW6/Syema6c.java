public class Syema6c {
   public static void main(String[] args) {
      int[] array = {10, 5, 100, 3, 6, 2, 30};
      evenSumMinusOddProduct( array );
   }
   
   public static int evenSumMinusOddProduct( int[] A ) {
      int evenSum = 0;
      int oddProduct = 1;
      int result;
      
      for(int index = 0; index < A.length; index++) {
         if (index % 2 == 0) {
            evenSum += A[index];
         }
         else {
            oddProduct *= A[index];
         }
      }
      result = (evenSum - oddProduct);
      return result;
   }

}