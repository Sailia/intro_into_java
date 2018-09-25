import java.util.Scanner;

/*
Part 3b:Create a Java class named YourName3b so mine would be 
Carden3b.java
Prompt the user for a four digit integer.  
This program will calculate and display the reverse of the four digit 
integer.  For example if the user entered the integer 3621, 
the program will calculate and display 1263.  
You may assume that the user will always enter a four digit integer 
(verification not required).  
Hint:  you do not need loops for this program.  
Think about how to solve this using integer division 
and the modulus operator.  Note: you may not use Strings to 
solve this problem.
*/

public class Syema3b
{
   public static void main( String[] args )
   {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Please enter a four digit integer: ");
    int number = input.nextInt(); 
    
    // 1 2 6 3 = (1*1000) + (2*100) + (6 * 10) + 3
    // 1 2 6 3 = 1 2 6 3 % 1000 = remainder 263
    // 263 = (2 * 100) + 
    
    int first_digit = (number / 1) % 10;
    int second_digit = (number / 10) % 10;
    int third_digit = (number / 100) % 10;
    int last_digit = (number / 1000) % 10;
    
    System.out.println(number + " reversed is: " + first_digit + "" + second_digit + "" + third_digit + "" + last_digit);   
   }

}