import java.util.Scanner;

public class PrettyHeader {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int TOTAL_LENGTH = 60;
        final int SIDE_LENGTH = 3;
        String header = SafeInput.getRangedLengthString(sc, "Enter Header: ", (TOTAL_LENGTH - (SIDE_LENGTH * 4)));

        SafeInput.printStars(TOTAL_LENGTH);
        SafeInput.printSpacesAndString(header, SIDE_LENGTH, TOTAL_LENGTH);
        SafeInput.printStars(TOTAL_LENGTH);


    }
}
