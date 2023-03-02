import java.util.Date;

public class Main {
    public static void main(String[] args) {
        String text="Текстовая строка";
        double x=100.0/7.0;
        double z=130;
        int n=-1234567;
        int k=7654321;
        int m=0xABC;
        int l=0123;
        Date now = new Date();
        System.out.printf("%s\t%d\t%f\n",text,k,z);
        System.out.printf("Десятичные числа:\t%1$g\t%2$e\t%1$07.2f\n",x,z);
        System.out.printf("Десятичные числа:\t%g\t%e\t%1$07.2f\n",x,z);
    }
}