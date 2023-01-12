import java.util.Scanner;

public class GetBiggerNumbersInsideArray {
    public static void main(String[] args) {
        /*
        На вход подаётся целое число n - длина последовательности, а затем сама последовательность целых чисел.
         Выведите на печать все числа, большие предыдущего числа.
         The input is an integer n - the length of the sequence, and then the sequence of integers itself.
         Print all numbers greater than the previous number.
         */
        Scanner sc = new Scanner(System.in);
        int arrayLength = sc.nextInt();
        int [] name = new int[arrayLength];
        for (int i = 0; i < name.length; i++) {
            name[i] = sc.nextInt();
        }
        String row = new String(" ");
        for (int i = 0; i < arrayLength-1; i++) {
            if (name[i+1]>name[i]){
                row = row +name[i+1]+" ";
            }
        }
        System.out.println(row);
    }
}
