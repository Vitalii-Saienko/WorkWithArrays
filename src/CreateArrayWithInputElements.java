import java.util.Scanner;

class CreateArrayWithInputElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String forArray = new String("");
        //int [] newArray = new int[];
        while (!scanner.hasNextInt()){
            forArray = forArray+scanner.nextInt();
            break;
            }
        System.out.println(forArray);
    }
}
