public class Problem8   {
   public static void main(String[] args) {
      int[] A = {6,8,15,22,77,93,98};
      int[] B = {5,15,22,44,93};
      int result = howManyInCommon(A, B);
      System.out.print(result);
   }
   
   public static int howManyInCommon(int[] A, int[] B)   {
      int count = 0;
      
      for(int outer = 0; outer < A.length; outer++)   {
         for(int inner = 0; inner < B.length; inner++)   {
            if(A[outer] == B[inner])   {
               count++;
            }
         }
      }
      return count;
   }
}