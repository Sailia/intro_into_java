public class HW6P4 {
    public static void main(String[] args) {
        int[] repeat = repeatedN(-8, 15);
        int[] a1 = repeatedN(4, 2);
        int[] a2 = repeatedN(2, 5);
        int[] a3 = repeatedN(-41, 3);	
        printArray(repeat);
        System.out.println();
        printArray(a1);
        System.out.println();
        printArray(a2);
        System.out.println();
        printArray(a3);
    }
    
    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        } 
    }
    
    public static int[] repeatedN (int range, int n) {
        int count = 0;
        int nTimes;
        int[] arr;
        if(range < 0) {
            arr = new int[n];
            for(int i = 0; i < arr.length; i++) {
               arr[i] = count;
            }
        } else {
            nTimes = (Math.abs(range) + 1) * n;
            arr = new int[nTimes];
        
            for(int i = 0; i < arr.length; i++) {
                if(count <= range) {
                    arr[i] = count;
                    count++;
                } else {
                    count = 0;
                    arr[i] = count;
                    count = 1;
                }
            }
        }
        return arr;
    }
}