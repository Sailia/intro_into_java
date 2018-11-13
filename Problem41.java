public class Problem41  {
   public static void main(String[] args) {
      
   }
   
   public static int elementsBiggerThan(int[] a, int n)   {
      int count = 0;
      
      for(int index = 0; index < a.length; index++;)  {
         if(a[index] > n)  {
            count++;
         }
      }
      return count; 
   }
}