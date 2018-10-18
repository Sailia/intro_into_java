import java.util.Scanner;

public class Syema4a
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner(System.in);
      System.out.println("Please enter a character: ");
      String word = input.nextLine();
      char character = word.charAt(0);
      
      checker(character);
   }
   
   public static void checker(char variable)
   {  
      String characters = new String("@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~");
      int count = 64;
      
      if (variable >=0 && variable < 127)
      {
         int index = characters.indexOf(variable) + count;
         System.out.println(index); 
      }                     
      
   }

}