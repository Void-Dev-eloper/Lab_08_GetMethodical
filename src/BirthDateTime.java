import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = SafeInput.getRangedInt(sc,"year", 1950, 2015);
        int month = SafeInput.getRangedInt(sc,"month", 1, 12);
        int day = switch (month) {
            case 2 -> SafeInput.getRangedInt(sc, "day", 1, 29);
            case 1, 3, 5, 7, 8, 10, 12 -> SafeInput.getRangedInt(sc, "day", 1, 31);
            default -> SafeInput.getRangedInt(sc, "day", 1, 30);
        };

        System.out.println("Your Birthday is " + year + ' ' + month + ' ' + day);


    }
}
