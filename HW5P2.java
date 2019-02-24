public class HW5P2 {
    public static void main(String[] args) {
        int p1 = digitProduct(5);
        int p2 = digitProduct(1078);
        int p3 = digitProduct(-186321);
        int p4 = digitProduct(0);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        
    }
    
    public static int digitProduct(int n) {
        int number = Math.abs(n);
        int count = 0, original = number, product = 1, singleNum;
        
        if(number == 0) {
            number = 1;
            return number;
        }
        
        while(number > count) {
            if(number % 10 == 0) {
                number = number / 10;
            } else {
                singleNum = number % 10;
                product = product * singleNum;
                number = number / 10;
            }
        }
        return product;
    }
}