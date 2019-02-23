import java.util.Scanner;

public class Asterisks  {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int total, numRows, numAst, count = 0;
      
      System.out.print("Enter the number of rows: ");
      numRows = input.nextInt();
      System.out.print("Enter the number of asterisks per row: ");
      numAst = input.nextInt();
      total = numAst;
      
      while(numRows > count)   {
         if(numAst > 0) {
            System.out.print("* ");
            numAst--;
         }  else {
            count++;
            numAst = total;
            System.out.println();
         }   
      }
   }
}