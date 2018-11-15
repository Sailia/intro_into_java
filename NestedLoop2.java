public class NestedLoop2  {
   public static void main(String[] args) {
      int stop = 8;
      for(int i= 1; i <= 4; i++) {
         int j = 1;
         while(j <= stop)   {
            System.out.print("*");  
         }
         System.out.println();
         stop -= 1;
      }
   }
}