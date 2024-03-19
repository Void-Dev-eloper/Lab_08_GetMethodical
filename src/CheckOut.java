import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isRunning;
        double totalPrice = 0;

        do {
            double price = SafeInput.getRangedDouble(sc,"What is the price?", .50, 10.0);
            totalPrice += price;
            sc.nextLine();
            isRunning = SafeInput.getYNConfirm(sc,"Are you finished?");
        }while (!isRunning);
        System.out.printf("\nTotal price: %.2f", totalPrice);
    }
}
