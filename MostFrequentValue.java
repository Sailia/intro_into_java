public class MostFrequentValue   {
   public static void main(String[] args) {
      int[] arr = {14,1,7,2,2};
      int result = mostFrequentValue(arr);
      System.out.println(result);
   }
   
   public static int mostFrequentValue(int[] myArray) {
      int counter = 0;
      int currentCount = 0;
      int maximumCount = 0;
      int nextIndex = 0;
      
      for(int index = 0; index < myArray.length; index++)  {
         currentCount = counter;
         while(nextIndex < myArray.length) {
            if(myArray[index] == myArray[nextIndex])  {
               counter++;
               nextIndex++;
            }  
            else  {
               nextIndex++;
            }
         }
         if(counter >= currentCount) {
            maximumCount = myArray[index];  
         }  
      }
      return maximumCount;
   }
}

