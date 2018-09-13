import java.util.Scanner;

public class Syema2c 
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner(System.in);
      
      //prompt the user for the restaurant bill (the subtotal) 
      System.out.print( "Please enter your total bill: " );
      double restaurant_bill = input.nextDouble();
      
      //prompt the user for the gratuity rate  
      System.out.print( "Please enter your gratuity rate: " );
      double gratuity_rate = input.nextDouble();
      
      //calculate the gratuity
      double calculated_gratuity = (gratuity_rate / 100) * restaurant_bill;
 
      //add gratuity to total bill
      double total_bill = calculated_gratuity + restaurant_bill;
        
      //output total
      System.out.println( "The gratuity is $" + calculated_gratuity + " and the total is $" + total_bill );   
   }

}