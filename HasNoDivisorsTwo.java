public class HasNoDivisorsTwo {
   public static void main(String[] args) {
      System.out.println(noDivisors(21));
   }
   
   public static boolean noDivisors(int n)   {
      boolean noDiv = false;
      int count = 0;
      
      for(int i = 2; i < n; i++) {
         if(n % i == 0) {
            count++;
         }
      }
      if(count == 0)  {
         noDiv = true;
      }
      return noDiv;
   }
}