
public class CtoFTableDisplay {
    public static void main(String[] args) {
        double f;
        for(int c = -100; c <= 100; c++) {
            f = CtoF(c);
            System.out.printf("%d\t%.2f\n", c, f);
        }
    }

    public static double CtoF(double c){return (9.0/5.0) * c + 32.0;}

}
