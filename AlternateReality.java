 public class AlternateReality {
   public static void main(String[] args) {
      char[] c1 = alternatingArray('a', 'b', 4);
      char[] c2= alternatingArray('y', 'x', 3);
      char[] c3= alternatingArray('s', 'o', 1);
      for(int i = 0; i < c3.length; i++)  {      
         System.out.print(c3[i] + " ");
      }
   }
   
   public static char[] alternatingArray(char c1, char c2, int n)  {
      char[] arr = new char[n];
      
      arr[0] = c1;
      
      for(int i = 1; i < arr.length; i++) {
         if(i % 2 != 0) {
            arr[i] = c2;         
         } else {
            arr[i] = c1;
         }
      }
      return arr;
   }
 }