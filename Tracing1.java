public class Tracing1   {

     public static void main(String []args){
        int r = 5;
        int s = r / 3 - 1;
        boolean w = r < s;
        
        System.out.println( w + " s " + (r / 2.0));
        s += 2;
        if (!w) {
            System.out.print("pink");
        } else  {
            System.out.println("blue");
        }
        r++;
        double p = s / 2;
        System.out.println(p);
        
        if ( r > 0 && p > 0)    {
            s += 2;
            if( s > 5 ) {
                System.out.println( "p" + r + s );
            } else  {
                System.out.println( "p" + s + r );
            }
        } else  {
            System.out.println( r >= 2 );
            w = s < 0 || r < 10;
        }
        System.out.println( s + " s");
        System.out.print( r );
        System.out.println( w );
    }
}
