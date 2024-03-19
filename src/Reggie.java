import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String SSN, mNum, menuChoice;

        SSN = SafeInput.getRegExString(sc, "Enter your SSN", "^\\d{3}-\\d{2}-\\d{4}$");
        mNum = SafeInput.getRegExString(sc, "Enter your mNum", "^(M|m)\\d{5}$");
        menuChoice = SafeInput.getRegExString(sc, "Enter a menu choice, [O = Open, S = Save, V = View, Q = Quit]", "^[OoSsVvQq]$");

        System.out.println("Your SSN is " + SSN + "\n");
        System.out.println("Your M Number is " + mNum + "\n");
        System.out.println("You Chose " + menuChoice + "\n");


    }
}
