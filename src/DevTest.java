import java.util.Scanner;
public class DevTest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String prompt = "Enter a String";
        String string = SafeInput.getNonZeroLenString(scanner, prompt);
        System.out.println(string);
    }

}
