public class RepeatingCharacters {
   public static void main(String[] args) {
      int[] freq = {3, 1, 5, 2};
      char[] text = {'m', 's', 'k', 'p'};
      char[] array = repeatChars(freq, text);
      
      for(int index = 0; index < array.length; index++)  {
         System.out.print(array[index] + " ");
      }
   }
   
   public static char[] repeatChars(int[] freq, char[] text)   {
      int arrayIndex = 0;
      
      for(int index = 0; index < freq.length; index++)   {
         arrayIndex += freq[index];
      }
      System.out.println(arrayIndex);
      
      char[] array = new char[arrayIndex];
      int j = 0;
      int count = 0;
      
      for(int index = 0; index < text.length; index++)   {
         count = freq[index];
         for(int inner = 0; inner < count; inner++)   {
            array[j] = text[index];
            j++;
         }
      }
      return array;
   }
}