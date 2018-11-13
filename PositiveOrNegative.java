public class PositiveOrNegative  {
   public static void main(String[] args) {
      posNeg(1, -1, false);
   }
   
   public boolean posNeg(int a, int b, boolean negative) {
     if (negative)  
     {
       if( (a % 2 != 0) && (b % 2 != 0) )  
       {
         negative = true;
       }
     } 
     else if ( (a % 2 == 0 && b % 2 != 0) || (a % 2 != 0 && b % 2 == 0) ) 
     {
       negative = true;
     }
     return negative;
   }
}