import java.util.Scanner;
public class FavNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int favInt = SafeInput.getInt(sc, "Enter a Favorite Integer");
        double favDouble = SafeInput.getDouble(sc, "Enter a Favorite Double");

        System.out.println("Your Favorite Integer is: "+ favInt);
        System.out.println("Your Favorite Double is: "+ favDouble);
    }
}
