public class Syema7a {
   public static void main(String[] args) {
      int[] arr = {3,1,5,2};
      char[] text = {'m','s','k','p'};
      char[] newArray = repeatChars(arr, text);
      
      for(int index = 0; index < newArray.length; index++)  {
         System.out.print(newArray[index] + " ");
      } 
   }
   
   public static char[] repeatChars(int[] freq, char[] text)  {
      int sum = 0;
      for(int index = 0; index < freq.length; index++)   {
         sum += freq[index];   
      }
      
      char[] arr = new char[sum];
      int resultIndex = 0;
      for(int index = 0; index < freq.length; index++)   {
         int counter = 0;
         int number = freq[index];
         while(counter < number)   {
            arr[resultIndex] = text[index];
            resultIndex++;
            counter++;
         }
      }
   return arr;
   }
}