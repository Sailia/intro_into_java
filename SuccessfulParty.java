import java.util.Scanner;

public class SuccessfulParty
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner(System.in);
      int number_of_balloons;
      int day;
      boolean weekend;
      
      System.out.print("Enter the number of balloons: ");
      number_of_balloons = input.nextInt();
      
      System.out.print("Enter the day of the week: ");
      day = input.nextInt();
      
      if(day == 6 || day == 7)
      {
         weekend = true;
      }
      else
      {
         weekend = false;
      }
      
      if(weekend)
      {
         System.out.print("Party was successful");
      }
      else if(number_of_balloons >= 40 && number_of_balloons <= 60)
      {
         System.out.print("Party was successful");
      }
      else
      {
         System.out.print("Party was unsuccessful"); 
      }
   }
}