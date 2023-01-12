import java.util.Scanner;
/*
1. create array with length given by user
2. fulfill the array with input
3. print the last element of the array
 */
public class CreateArrayAndFulfillWithInputNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int n = sc.nextInt();
        int [] name = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < name.length; i++) {
            name[i] = sc.nextInt();
        }
        System.out.println("The last element in array is: "+name[n-1]);
    }
}
