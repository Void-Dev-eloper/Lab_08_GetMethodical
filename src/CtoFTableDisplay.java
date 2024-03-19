import java.util.Scanner;

public class CtoFTableDisplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fTemp;
        for(int c = -100; c <= 100; c++) {
            fTemp = CtoF(c);
            System.out.printf("%d\t%.2f\n", c, fTemp);
        }
    }

    public static double CtoF(double c){return (9.0/5.0) * c + 32.0;}

}
