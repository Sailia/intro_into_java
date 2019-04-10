public class HW8P1 {
    public static void main(String[] args) {
        int[][] a1 = { { 4, -2, 10 },
                       { 19, 3, -5 } };
        int[] b1 = columnSums(a1);	
        for(int i = 0; i < b1.length; i++) {
            System.out.println(b1[i] + " ");
        }
    }
    
    public static int[] columnSums(int[][] a) {
        int[] arr = new int[a[0].length];
        int sum = 0;
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[0].length; j++) {
                arr[j] += a[i][j];
            }
        }
        return arr;
    }
}