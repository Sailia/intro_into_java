public class HW6P2 {
    public static void main(String[] args) {
        int[] a1 = { 2, 9, 5, 6, 7, -1, 0 };
        boolean b1 = inMiddle(a1);
        System.out.println(b1);
        int[] a2 = { -2, -1, 0, 3, 4 };
        boolean b2 = inMiddle(a2);
        System.out.println(b2);
    }
    
    public static boolean inMiddle(int[] arr) {
        
        boolean consecutive = false;
            if( (arr.length >= 3) && (arr.length % 2 != 0) ) {
                int middle = (arr.length/2);
                if((arr[middle]) == (arr[middle - 1] + 1) && ((arr[middle+1]) == (arr[middle] + 1))) {
                    consecutive = true;
                }
            }
        return consecutive;
    }
}