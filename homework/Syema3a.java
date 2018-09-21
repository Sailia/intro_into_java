import java.util.Scanner;

public class Syema3a
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner(System.in);
      double base_salary = 2000;
      double commission = 0;
      double total_pay = 0;
      
      System.out.println("Please enter your sales amount: ");
      
      double sales_amount = input.nextInt();
      
      if(sales_amount >= 1000 && sales_amount <= 5000){
         commission = (3 * sales_amount) / 100;
      } else if(sales_amount >= 5000.01 && sales_amount <= 10000){
         commission = (6 * sales_amount) / 100;
      } else if(sales_amount >= 10000.01){
         commission = (8 * sales_amount) / 100;    
      } else {
         commission = 0;
      } 
      
      total_pay = commission + base_salary;
      
      System.out.println("Sales commission was: " + commission);
      System.out.println("Total pay is: " + total_pay);
      
      if(sales_amount >= 12000){
         System.out.println("You've gained a bronze star!");
         System.out.println("You've gained a silver star!");
         System.out.println("You've gained a gold star!");
      }else if(sales_amount >= 8000){
         System.out.println("You've gained a bronze star!");
         System.out.println("You've gained a silver star!");
      }else if(sales_amount >= 4000){
         System.out.println("You've gained a bronze star!");
      }      
   }
}