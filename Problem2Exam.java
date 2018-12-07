import java.util.Scanner;

public class Problem2Exam  {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      int n, count = 0;
      
      System.out.print("Enter n: ");
      n = input.nextInt(); 
      double[] arr = new double[n];
      double avg = 0.0;
      double real = 0.0;
      
      System.out.println("Enter " + n + " reals:");
      
      while(count != n) {
         real = input.nextDouble();
         arr[count] = real;
         count++;
         avg += real;
      }
      count = 0;
      avg = avg / n;
      for(int index = 0; index < arr.length; index++) {
         if(avg > arr[index]) {
            count++;
         }
      }
      System.out.println("Average is " + avg);
      System.out.println("Num values below avg: " + count);  
   }
}