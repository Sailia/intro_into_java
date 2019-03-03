import java.util.Scanner;
public class HW6P1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        int[] array;
        System.out.print("How many integers? ");
        n = input.nextInt();
        array = new int[n];
        System.out.print("Enter " + n + " integers: ");
        for(int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        System.out.print("Reversed:");
        for(int count = array.length; 0 < count; count--) {
            System.out.print(" " + array[count - 1]);
        }
        System.out.println();
        System.out.print("Every other:");
        for(int i = 0; i < array.length; i+=2) {
            System.out.print(" " + array[i]);
        }
        System.out.println();
    }
}