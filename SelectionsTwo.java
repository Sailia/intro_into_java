import java.util.Scanner;

public class SelectionsTwo
{
   public static void main( String[] args )
   {
     Scanner kbd = new Scanner(System.in);
     double gpa;
     
     System.out.println("Enter your gpa: ");
     gpa = kbd.nextDouble();
     
     System.out.println("Lets try new stuff");
     
     if(gpa >= 3.8)
     {
      System.out.pringn("Good job");
      System.out.pringn("Keep up the good work!");
     } 
     else
     {
      System.out.println("Work Hard!");
      System.out.println("You will get there");      
     }
     System.out.println("Done");
     System.out.println("Bye!");
   }

}