public class Digimon
{
   public static void main( String[] args ){
      
   }

   public boolean lastDigit(int a, int b) {
     boolean same = true;
     
     if (a == (b % 10)) {
       same = true;  
     }
     else {
       same = false;
     }
     return same;
   }

}