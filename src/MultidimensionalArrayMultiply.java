/*
create multiplication table using two input length
 */
import java.util.Arrays;
import java.util.Scanner;

public class MultidimensionalArrayMultiply {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        String [][] array = new String[n][m];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array [i][j] = String.valueOf((i+1)*(j+1));
                if (j< array[i].length-1) {
                    System.out.print(array[i][j] + " ");
                }
                else {
                    System.out.println(array[i][j]);
                }
                }
            }
            System.out.println("");
        }
        //System.out.println(Arrays.deepToString(array));
    }
