public class NestedLoop  {
   public static void main(String[] args) {
      for(int i= 1; i <= 3; i++) {
         int j = 1;
         while(j <= 2)  {
            System.out.print((i * j) + " ");
            j++;
         }
         System.out.println();
      }
   }
}