public class HaveThree  {
   public static void main(String[] args) {
      int[] arr = {3,1,3,2};
      System.out.println(haveThree(arr));
   }
   
   public static boolean haveThree(int[] arr)  {
      int counter = 0;
      
      for(int index = 0; index < arr.length; index++) { 
         if(arr[index] == 3)  { //if the element is equal to 3 
            if( index == 0 && arr[index + 1] != 3 ) { // and it is not the first element and the second element is not 3
               counter++; //add 1 to counter 
            } 
            else if( index != arr.length && arr[index - 1] != 3 ) { // I have no idea why this works... 
               counter++;
            }
            else if( arr[index - 1] != 3 && arr[index + 1] != 3 ) { //if the element after and the element before the element in question is not 3 
               counter++; //add 1 to counter 
            }  
         } 
      }
      return (counter == 3); //return true if counter is 3, false otherwise 
   }  
}