import java.util.Scanner;
public class DevTest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String prompt = "Enter either y or n";
        boolean string = SafeInput.getYNConfirm(scanner, prompt);
        System.out.println(string);
    }

}
