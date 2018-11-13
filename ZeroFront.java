public class ZeroFront  {
   public static void main(String[] args) {
      int[] arr = {1,0,0,1};
      int[] newArray = zeroFront(arr);
      for(int index = 0; index < newArray.length; index++) {
         System.out.println(newArray[index]);
      }
   }
   
   public static int[] zeroFront( int[] arr )   {
      int[] arrayTwo = new int[arr.length];
      for( int index = 0; index < arr.length; index++ )  {
         if(arr[index] != arr[-1])   {
            if(arr[index] > arr[index + 1])   {
               arrayTwo[index] = arr[index + 1];
            }
            else  {
               arrayTwo[index] = arr[index];
            }
         }
      }
      return arr;
   }
}