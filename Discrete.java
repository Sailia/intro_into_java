public class Discrete
{
   public static void main( String[] args )
   {
      int total = 1;
      int exp = 1;
      int i = 0;
      int j = 0;
      hope(total, exp, i, j);
      
   }
   
   public static void hope(int total, int exp, int i, int j)
   {
      int stop = 4;
      if( i<=stop )
      {
         if( i==0 )
         {
            exp=1;
            result(total, exp, j, i);
         }
         else
         {
            j=i;
            if(j==1)
            {
               exp=2;
               result(total, exp,j, i);
            }
            else if(j<=stop)
            {
               exp = exp*2;
               j++;
               result(total, exp,j, i);
            }
            else
            {
               j++;
               result(total, exp,j, i);
            }
         }
      }
      else
      {
         System.out.println(total);
      }
   }
  
   public static void result(int total, int exp, int j, int i)
   {
      total = total*(exp + 3);
      i++;
      hope(total, exp, i, j);
   }

}
