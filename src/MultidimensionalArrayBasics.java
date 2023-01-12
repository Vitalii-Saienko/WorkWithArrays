import java.util.Arrays;

class MultidimensionalArrayBasics {
    public static void main(String[] args) {
        int[] [] name = {{1, 2, 3, 8, 10, 11, 12}, {4, 5, 6, 9}, {5,5,5}};

        for (int i = 0; i < name.length; i++) {
            for (int j = 0; j < name[i].length; j++) {
                System.out.print(name[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}