import java.util.Scanner;

class CountRowsAndColumns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int index = 0;
        while (scanner.hasNext()){
            counter++;
            String name = scanner.nextLine();

            index = index + name.length();
        }
        System.out.println(counter + " " + index);
    }
}
