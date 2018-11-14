public class CopyArrays  {
   public static void main(String[] args) {
      
   }
   
   public static int[] copyArray(int[])   {
      int[] copy = new int[x.length];
      
      for(int index = 0; index < x.length; index++;)  {
         copy[index] = x[index];
      }
      return copy;
   }
   //when passing an array to a method, the reference of the array is passed to the method. this is called pass by reference
   // that means any changes done to that array in the method will reflect the original array 
   
   
}