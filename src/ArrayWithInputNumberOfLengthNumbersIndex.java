import java.util.Scanner;
/*
На вход подаётся натуральное число n > 0, на следующей строке - последовательность целых чисел, а затем -
индекс id < n. Создайте из неё массив и выведите на печать значение элемента массива c индексом id.
 */
public class ArrayWithInputNumberOfLengthNumbersIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int n = sc.nextInt();
        int [] name = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < name.length; i++) {
            name[i] = sc.nextInt();
        }
        System.out.println("Enter the index of element:");
        int id = sc.nextInt();
        System.out.println("The element "+id+" in array is: "+name[id]);
    }
}
