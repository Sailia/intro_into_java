public class HwReview6c   {
   public static void main(String[] args) {
      
   }
   
   public static int evenOrOdd(int[] A)   {
      int evenSum = 0;
         int oddProduct = 1;
         int diff;
         
         for(int i = 0; i < A.length; i++)   {
            if(i % 2 == 0)   {
               evenSum += A[i];
            }
            else  {
               oddProduct *= A[i];
            }
         }
         diff = evenSum - oddProduct;
         return diff;
   }
}