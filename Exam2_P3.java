import java.util.Scanner;
public class Exam2_P3  {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int n, count = 1;
      System.out.print("Enter a 10: ");
      while(count <= 3) {
         n = input.nextInt();
         if(count == 1 && n == 10)  {
            System.out.print("Great! Enter another: ");
            count++;
         } else if (count == 2 && n == 10)   {
            System.out.print("One more: ");
            count++;
         } else if (count == 3 && n == 10)   {
            System.out.println("Thats it!");
            count++;
         } else {
            System.out.print("Nope, enter a 10: ");
         }
      }
   }
}

