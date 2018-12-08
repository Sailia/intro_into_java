public class Problem42017  {
   public static void main(String[] args) {
      char[] arr = {'W', 'W', 'L', 'W', 'L', 'L', 'W', 'W', 'W', 'W', 'L', 'W', 'W', 'W'};
      System.out.print(longestStreak(arr));
   }
   
   public static int longestStreak(char[] record)  {
      int w = 0; 
      int l = 0;
      
      for(int letters = 0; letters < record.length; letters++) {
         if(record[letters] == 'W') {
            w++;
         }
         else  {
            l++;
         }
      }
      if(w > l)   {
         return w;
      }
      else  {
         return l;
      }
   }
}