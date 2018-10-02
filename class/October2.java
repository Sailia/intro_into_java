// dice1 = (int)(Math.random() * 6) + 1; 
//0.0 * 6 = 0.0 + 1 = 1.0 (int)1.0 = 1
//0.1 * 6 = 0.6 + 1 = 1.6 (int)1.6 = 1
//0.2 * 6 = 1.2 + 1 = 2.2 (int)2.2 = 2
//0.3 * 6 = 1.8 + 1 = 2.8 (int)2.8 = 2

public class October2
{
   public static void main( String[] args )
   {
      //*Program to practice generating random numbers 
      int dice1 = (int)(Math.random() * 6 ) + 1;
      int dice2 = (int)(Math.random() * 6 ) + 1;
      
      System.out.println("dice1 rolled " + dice1);
      System.out.println("dice2 rolled " + dice2);
   }

}