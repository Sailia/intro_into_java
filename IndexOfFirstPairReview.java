public class IndexOfFirstPairReview  {
   public static void main(String[] args) {
      int[] arr = {88,88,88,63,29,77,77,77,77,50,44,44,8,0,99,99};
      System.out.print(indexOfFirstPair(arr));
   }
   
   public static int indexOfFirstPair(int[] array)   {
      int index = -1;
      
      if(array[0] == array[1] && array[1] != array[2])   {
         index = 0;
         return index;
      }
      
      for(int i = 1; i < array.length - 2; i++)  {
         if(array[i -1] != array[i] && array[i] == array[i +1] && array[i +1] != array[i +2])   {
            return index;
         }
      }
      return index;
   }
}