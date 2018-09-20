import java.util.Scanner;

public class Syema3c
{
   public static void main( String[] args )
   {  
      int num1;
      int num2;
      int num3;
      
      int smallest_num = 0;
      int middle_num = 0;
      int largest_num = 0;
      
      Scanner input = new Scanner(System.in);
      System.out.println("Please enter an integer: ");
      num1 = input.nextInt();
      System.out.println("Please enter an integer: ");
      num2 = input.nextInt();
      System.out.println("Please enter an integer: ");
      num3 = input.nextInt();
      
      /*
      pick a number 
      pick another number
      check which one is lower
      */
      if(num1 >= num2){
         smallest_num = num2;
         middle_num = num1;
         if(num1 >= num3){
            largest_num = num1;
         }

      }
      
      if(num1 <= num2)
      {
         smallest_num = num1;
         middle_num = num2;
         if(num2 <= num3)
         {
            largest_num = num3;
         }
      }
      /*
      check the next number
      check if the next number is lower than the kept number
      */
   //    else if(num2 >= num3){
//          smallest_num = num2;
//          middle_num = num1;
//          largest_num = num2;
//       }
      
      System.out.println(largest_num + " " + middle_num + " " + smallest_num);
      
      /*
      if(num1 >
      if the next number is lower
      keep the lower number
      if it is not lower, keep the kept number
      and put it on the table
      
      pick a number 
      pick another number
      check which one is lower
      if the first one is lower
      put it on the table next to the first number
      put the third number next to the second number
      
      */
      
      
      
      // if(num1 >= num2 && num1 >= num3){
//          third_int = num1;
//       }else if(num1 >= num2 && num1 <= num3){
//          third_int = num1;
//       }else if(num1 <= num2 && num1 >= num3){
//          third_int = num1;
//       }else if(num1 <= num2 && num1 <= num3){
//          third_int = num1;  
//       }else if(num2 >= num1 && num2 >= num3){
//          second_int = num2;
//       }else if(num2 >= num1 && num2 <= num3){
//          second_int = num2;
//       }else if(num2 <= num1 && num2 >= num3){
//          second_int = num2;
//       }else if(num2 <= num1 && num2 <= num3){
//          second_int = num2;
//       }else if(num3 >= num1 && num3 >= num2){
//          first_int = num3;
//       }else if(num3 >= num2 && num3 <= num1){
//          first_int = num3;
//       }else if(num3 <= num2 && num3 >= num1){
//          first_int = num3;
//       }else if(num3 <= num2 && num3 <= num1){
//          first_int = num3;
//       }
      
   }

}