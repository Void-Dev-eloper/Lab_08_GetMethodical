import java.util.Scanner;
public class GetUserName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = SafeInput.getNonZeroLenString(scanner, "Enter your first name");
        String lastName  = SafeInput.getNonZeroLenString(scanner, "Enter your last name");
        System.out.println("\nYour full name is " + firstName + " " + lastName);

    }
}
