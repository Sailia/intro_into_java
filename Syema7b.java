public class Syema7b {
   public static void main(String[] args) {
      int[] A = {33,11,77,44,55};
      int[] B = {99,88,222,66,1000};
      int result = largestInCommon(A,B);
      System.out.print(result);  
   }
   
   public static int largestInCommon(int[] A, int[] B)   {
      int firstElement = 0;
      int secondElement = -1;
      
      for(int index = 0; index < A.length; index++)   {
         int counter = 0;
         while(counter < B.length) {
            if(A[index] == B[counter]) { 
               firstElement = B[counter];
               secondElement = Math.max(firstElement, secondElement);
               counter++;
            }
            else  {
               counter++;
            }
         }
      }
      return secondElement;  
   }
}