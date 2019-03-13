public class ConsecutiveAppearances {
   public static void main(String[] args) {
      int[] A = {55, 33, 22};
      int[] B = {7, 6, 55, 33, 22, 1};
      
      System.out.println(appearsConsecutively(A, B));
   }
   
   public static boolean appearsConsecutively(int[] A, int[] B)   {
      int count = 0, same = 0;
      int smallestArray = Math.max(A.length, B.length);
      boolean isSame = false;
      
      while (count < smallestArray) {
         if(A[count] == B[count])   {
            same++;
            count++;
         } else {
            count++;
         }
      }
      if (same == smallestArray) {
         isSame = true;
      }
      return isSame;
   }
}