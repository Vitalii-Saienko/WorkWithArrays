import java.util.Arrays;
import java.util.Scanner;

class MultidimensionalArrayString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        scanner.nextLine();
        String [][] name = new String[length][];
        for (int i = 0; i < name.length; i++) {
            name[i] = scanner.nextLine().split(" ");
            System.out.println(Arrays.toString(name[i]));
        }
    }
}