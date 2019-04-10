public class HW8P3 {
    public static void main(String[] args) {
        int[][] a1 = shiftRows(3);
        
    }
    
    public static int[][] shiftRows(int n) {
        int[][] array = new int[n][n];
        int count;
        for(int row = 0; row < n; row++) {
            count = row + 1;
            for(int col = 0; col < n; col++) {
                if(count > n) {
                    count -= n;
                    array[row][col] = count;
                    count++;
                } else {
                    array[row][col] = count;
                    count++;
                }
            } 
        }
        return array;
    }
}