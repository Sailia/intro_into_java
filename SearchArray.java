public class SearchArray  {
   public static void main(String[] args) {
     // create an integer array named a1 of size 7 and let the user initialize it.
     int[] a1 = {3,5,4,6,10,0,14};
     int result = searchArray(a1, 4); //4 was randomly chosen 
   }
   
   public static int searchArray( int[] a, int b ) {
     // create a method named searchArray which takes an integer array a and an integer b as parameteres and returns an integer
     // the method should return the index where the fist occurrence of the integer b was found in the array a
     // if b was not found, the method should just return -1 
      int first = -1;
      
      for(int index = 0; index < a.length; index++)   {
         if(a[index] == b) {
            return index;
         }
      }
      return first;
   }
}