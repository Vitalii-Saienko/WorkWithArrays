import java.util.Scanner;

/*
На вход подаётся целое число n > 1. Сформируйте массив чётных чисел от 2 до n (включительно).
Выведите на печать массив в одной строке, через пробел.
Посчитайте и выведите на печать сумму элементов массива.
The input is an integer n > 1. Form an array of even numbers from 2 to n (inclusive).
Print the array on one line, separated by a space.
Count and print the sum of the array elements.
 */
public class GetTheLengthAndCalculateTheSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int myArraysLength = n/2;
        int [] name = new int[myArraysLength];
        int sum = 0;
        int counter = 2;
        for (int i = 0; i < name.length; i++) {
            name[i] = counter+i*counter;
            sum = sum + name[i];
            System.out.print(" "+name[i]);
        }
        System.out.println("\n"+sum);
    }
}
