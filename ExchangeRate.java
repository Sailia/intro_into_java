import java.util.Scanner;


public class ExchangeRate
{

   public static void main( String[] args )
   {
      Scanner input = new Scanner(System.in);
      
      System.out.println("Enter the dollars/RMB exchange rate: ");
      
      double exchange_rate = input.nextDouble();
      
      System.out.println("Enter 0 to convert to RMB, or 1 to convert to dollars: ");
      
      int currency = input.nextInt();
      
      int rmb = 0;
      int dollar = 1;
      
      if(currency == rmb)
      {
         System.out.println("Enter the dollar amount: ");
      
         double dollar_amount = input.nextDouble();
         double converted_currency = exchange_rate * dollar_amount;
         
         System.out.println(dollar_amount + " is " + converted_currency);
      }
      else if(currency == dollar)
      {
         System.out.println("Enter the RMB amount: ");
         
         double rmb_amount = input.nextDouble();
         double converted_currency; 
         converted_currency = Math.round((rmb_amount / exchange_rate) * 100.00) / 100.00;
         
         System.out.println(rmb_amount + " yuan is " + converted_currency);
      }
   }
}