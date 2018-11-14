public class Problem20  {
   public static void main(String[] args) {
      double[] arr = {1.5,2.0,1.0,9.0,1.5,9.5,2.5};
      
      double[] result = separate(arr);
      
      for(int index = 0; index < result.length; index++) {
         System.out.print(result[index] + " ");
      }
   }
   
   public static double[] separate (double[] myA) {
      double[] myB = new double[myA.length + 1];
      double sum = 0;
      
      for(int index = 0; index < myA.length; index++) {
         sum += myA[index];
      }
      double avg = sum/myA.length;
      int j = 0;
      
      for(int index = 0; index < myA.length; index++) {
         if(myA[index] < avg) {
            myB[j] = myA[index];
            j++;
         }
      }
      myB[j] = avg;
      j++;
      
      for(int index = 0; index < myA.length; index++) {
         if(myA[index] > avg) {
            myB[j] = myA[index];
            j++;
         }
      }
      return myB;
   }
}