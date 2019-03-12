public class HelloWorld{

     public static void main(String []args){
        System.out.println(amicableNumbers(9, 20));
     }
     
     public static boolean amicableNumbers(int a, int b)    {
         int sumA = 0, sumB = 0, count = 1;
         boolean equal = false;
         
         while (count < a)  {
             if(a % count == 0) {
                sumA += count;
             }
             count++;
         }
         count = 1;
         while (count < b)  {
            if(b % count == 0) {
                sumB += count;
            }
            count++;
        }
        if(sumA == sumB)   {
            equal = true;
        }
        return equal;
     }
}