import java.util.Scanner;

public class September20
{
   public static void main( String[] args )
   {
     Scanner input = new Scanner(System.in);
     
     int y = input.nextInt();
     boolean leap = false;
     
     
     if(y % 4 == 0)
     {
      leap = true;
      if(y % 100 == 0);
         {
            leap = false;
         }
         if(y % 400 == 0);
         {
            leap = true;
         }
     } 
     System.out.println("is a leap year? " + leap);
   }
}