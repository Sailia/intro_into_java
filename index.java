import java.util.Scanner;

public class index {
   
   public static void main( String[] args ){
      Scanner input = new Scanner(System.in);
      

      //Declare an array of ints called temps with values 5, 6, and 0 
      int[] temps = { 5, 6, 0, 4, 10, -8, 1 };
      
         for( int index = 0; index < temps.length; index++) {
         System.out.println( temps[index] );   
      }
      addOneArrayToArray( temps );
   }
   public static void addOneArrayToArray( int[] arr ) {
      System.out.println( );

      for( int i = 0; i < arr.length; i++ ) {
         arr[i] += 1;       
      }
      
      for( int i = 0; i < arr.length; i++ )
      {
         System.out.println( arr[i] );
      }
   }
}