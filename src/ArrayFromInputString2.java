/*
1.get the string line with elements
2.print sorted int-array
 */
import java.util.Arrays;
import java.util.Scanner;

class ArrayFromInputString2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String [] stringArray = line.split(" ");
        int index = stringArray.length;
        int [] array = new int[index];
        for (int i = 0; i < stringArray.length; i++) {
            array[i] = Integer.parseInt(stringArray[i]);
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
