public class ZeroFront  {
   public static void main(String[] args) {
      int[] arr = {1,0,1,0,1};
      int[] newArray = zeroFront(arr);
      
      for(int index = 0; index < arr.length; index++)  {
         System.out.print(newArray[index] + " ");
      }
   }
   
   public static int[] zeroFront( int[] arr )   {
      int[] array2 = new int[arr.length];
      int j = 0;
      
      for(int index = 0; index < arr.length; index++) {
         if(arr[index] == 0)  {
            array2[j] = arr[index];
            j++;
         }  
      }
      
      for(int index = 0; index < arr.length; index++)  {
         if(arr[index] != 0)  {
            array2[j] = arr[index];
            j++;
         }
      }
      return array2;
   }
}