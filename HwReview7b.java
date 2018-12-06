public class HwReview7b {
   public static void main(String[] args) {
   
   }
   
   public static in[] largestInCommon(int[] A, int[] B)   {
      int largest = -1;
      
      for(int outer = 0; outer < A.length; outer++)   {
         for(int inner = 0; inner < B.length; inner++)   {
            if(A[outer] == B[inner])   {
               largest = Math.max(largest, A[outer]);
            }
         }
      }
      return largest;
   }
}