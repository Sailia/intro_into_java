public class HwReview7a {
   public static void main(String[] args) {
   
   }
   
   public static char[] repeatChars(int[] freq, char[] text)   {
      int sum = 0;
      
      for(int i = 0; i < freq.length; i++)   {
         sum = sum + freq[i];
      }
      
      char[] result = new char[sum];
      
      int index = 0; //to keep track of values in result array 
      
      for(int outer = 0; outer < freq.length; outer++)   {
         for(int inner = 0; inner < freq[outer]; inner++)   {
            result[index] = text[outer];
            index++;
         } 
      }
      return result;
   }
}