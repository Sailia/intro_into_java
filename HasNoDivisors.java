public class HasNoDivisors {
   public static void main(String[] args) {
      System.out.print(hasNoDivisors(21));
   }
   
   public static boolean hasNoDivisors(int n)   {
      for(int i = 1; i < n; i++) {
         return (i % n == 0);
      }
      return false;
   }
}