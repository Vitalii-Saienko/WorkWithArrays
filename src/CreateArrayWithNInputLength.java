import java.util.Scanner;

public class CreateArrayWithNInputLength {
    public static void main(String[] args) {
        /*
        На вход подаётся натуральное число n.
        Создайте массив натуральных чисел от единицы до n включительно и выведите его на печать (в одной строке, через пробел).
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] newArray = new int[n];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = i+1;
            System.out.print(" "+newArray[i]);
        }
    }
}
