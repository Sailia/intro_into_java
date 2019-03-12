public class Exam2_Q1   {
   public static void main(String[] args) {
      int[] a = { 9, 2, 0, 8, -6 };
      cupcake(a, 1, 3);
      
      for(int i = 0; i < a.length - 1; i++)   {
         System.out.print(a[i] + " ");
         a[i + 1] = a[i] % 3 + 1;
         System.out.println(a[i + 1]);
      }
   }
   
   public static void cupcake(int[] b, int n1, int n2) {
      System.out.println(b[n1] + " " + b[n2]);
      int q = b[n1] % b.length;
      System.out.print(q + " ");
      int r = b[n2] % b.length;
      System.out.println(r + " ");
      b[n2] = q - 2;
      b[n1] = r - 2;
   }
   
}