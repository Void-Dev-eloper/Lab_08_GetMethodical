import java.util.Scanner;
public class DevTest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String prompt = "Wanna Play Again? \n[y or n]:";
        boolean playAgain = SafeInput.getYNConfirm(scanner, prompt);
        System.out.println(playAgain);
    }

}
