public class HW8P2 {
    public static void main(String[] args) {
//         int[] a3 = {6, 3, 0, 4, 5, -11, 12, 77, 88};
        
//         reverseLinearize(a3, 3, 3);
    }
    
    public static int[][] reverseLinearize(int[] a, int r, int c) {
        int[][] arr = new int[r][c];
        int count = 0;
        
        if(a.length == (r * c)) {
            for(int row = 0; row < arr.length; row++) {
                for(int col = 0; col < arr[0].length; col++) {
                    arr[row][col] = a[count];
                    count++;
                }
            }
        }
        return arr;
    }
}