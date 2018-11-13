public class HaveThree  {
   public static void main(String[] args) {
      int[] arr = {3,1,3,2};
      System.out.println(haveThree(arr));
   }
   
   public static boolean haveThree(int[] arr)  {
      int counter = 0;
      
      for(int index = 0; index < arr.length; index++) {
      //if the element is equal to 3 and the index is not 0 or not end of the array 
         if(arr[index] == 3)  {
            if( index == 0 && arr[index + 1] != 3 ) {
               counter++;
            } 
            else if( index != arr.length && arr[index - 1] != 3 ) {
               counter++;
            }
            else if( arr[index - 1] != 3 && arr[index + 1] != 3 ) {
               counter++;
            }  
         } 
      }
      return (counter == 3);
   }  
}