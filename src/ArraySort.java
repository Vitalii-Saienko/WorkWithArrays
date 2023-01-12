import java.util.Arrays;
import java.util.Scanner;
/*
1. Input the length (n)
2. Input elements of array
3. Find the k-element in sorted array

 */
public class ArraySort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] myArray = new int[n];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = sc.nextInt();
        }
        Arrays.sort(myArray);
        int k = sc.nextInt();
        if (k <= 0 || k > myArray.length) {
            System.out.println("Error");
        } else {
            System.out.println(myArray[k - 1]);
        }

    }
}