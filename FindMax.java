public class FindMax   {
   public static void main(String[] args) {
      int[] numbers = new int[5];
      int[] arr = new int[7];
      int max = numbers[0];
      
      for(int i = 0; i < arr.length; i++) {
         // if( numbers[index] >= max )   {
//             max = numbers[index];
//          }
         max = Math.max( numbers[index], max );
      }
      System.out.println("Max is " + max);
   }
}