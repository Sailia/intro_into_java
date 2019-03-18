public class ConsecutiveAppearances {
   public static void main(String[] args) {
      int[] A = {55, 33, 22};
      int[] B = {7, 6, 55, 33, 22, 67, 9};
      
      System.out.println(appearsConsecutively(A, B));
   }
   
//    public static boolean appearsConsecutively(int[] A, int[] B)   {
//       int count = 0, countB = 0;
//       boolean consecutive = false;
//       
//       while(count < A.length && countB < B.length)   {
//          if(A[count] == B[countB]) {
//             count++;
//             countB++;
//          } else {
//             count = 0;
//             countB++;
//          }
//       }
//       if(count == A.length)   {
//          consecutive = true;
//       }
//       return consecutive;
//    }

      public static boolean appearsConsecutively(int[] A, int[] B)   {
         int count = 0;
         boolean found = false;
         
         for (int i = 0; i < B.length; i++)  {
            if (A[count] == B[i])   {
               if (count == A.length)  {
                  found = true;
               } else {
                  count++;
               }
            } else   {
               count = 0;
            }
         }
         return found;
      }      
}