/*
1. create array
2. initialize it using loop
3. calculate the sum of elements of array
 */
public class Main {
    public static void main(String[] args) {
        int [] vetal = new int[10];
        for (int i = 0; i < vetal.length; i++) {
            vetal[i] = i*2;
            System.out.print(" "+vetal[i]);
        }
        System.out.println();
        int sum = 0;
        for (int i = 0; i < vetal.length; i++) {
            sum = sum + vetal[i];
        }
        System.out.println(sum);
    }
}
//https://stepik.org/lesson/469577/step/9?unit=460403