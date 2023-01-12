import java.util.Scanner;

public class ArrayFromInputString {
    public static void main(String[] args) {
        /*
        The input is a string of elements separated by a comma. 
        Create an array from it and output the elements of the array each on a separate line.
         */
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        String [] name = string.split(",");
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }
        System.out.println(name.length);
    }
}
