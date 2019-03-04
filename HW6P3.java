import java.util.Scanner;
public class HW6P3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2, i, place = 0;
        boolean found = false;
        int[] arr;
        System.out.print("Enter n1: ");
        n1 = input.nextInt();
        System.out.print("Enter n2: ");
        n2 = input.nextInt();
        arr = new int[n2];
        System.out.print("Enter " + n2 + " values: ");
        for(i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        
        for(i = 0; i < arr.length; i++) {
            if(arr[i] == n1) {
                found = true;
                place = i;
            }      
        } 
        if (found && place == arr.length -1) {
            System.out.println("No values after " + n1);
        } else if(found == false) {
            System.out.println(n1 + " does not occur"); 
        } else {
            for(i = place + 1; i < arr.length; i++) {
                if(arr[i] % 2 == 0) {
                    System.out.println(arr[i] + " is even");
                } else {
                    System.out.println(arr[i] + " is odd");
                }
            }
        }
    }
}