import java.util.Scanner;

public class SafeInput {
    /**
     *
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return a String response that is not zero length
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retString = "";
        do{
            System.out.print("\n" +prompt + ": "); // show prompt add space
            retString = pipe.nextLine();
        }while(retString.length() == 0);

        return retString;

    }

    public static int getInt(Scanner pipe, String prompt){
        int retInt = 0;
        boolean isValid = false;
        do {
            System.out.println(prompt);
            while(!pipe.hasNextInt()){
                System.out.println("[Invalid Number]: Enter a Valid Number");
                System.out.println(prompt);
                pipe.next();
            }
            retInt = pipe.nextInt();
            isValid = true;
        }while(!isValid);
        return retInt;
    }

    public static double getDouble(Scanner pipe, String prompt){
        double retDouble = 0;
        boolean isValid = false;
        do {
            System.out.println(prompt);
            while(!pipe.hasNextDouble()){
                System.out.println("[Invalid Number]: Enter a Valid Number");
                System.out.println(prompt);
                pipe.next();
            }
            retDouble = pipe.nextDouble();
            isValid = true;
        }while(!isValid);
        return retDouble;
    }

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high){
        int retInt = 0;
        boolean isValid = false;
        do {
            System.out.println(prompt);

            while(!pipe.hasNextInt()){
                System.out.println("[Error]: Invalid Number or Out of Ranged");
                System.out.println(prompt);
                pipe.next();
            }
            retInt = pipe.nextInt();
            isValid = true;
        }while(!isValid || retInt < low || retInt > high);
        return retInt;
    }

    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high){
        double retDouble = 0;
        boolean isValid = false;
        do {
            System.out.println(prompt);

            while(!pipe.hasNextDouble()){
                System.out.println("[Error]: Invalid Number");
                System.out.println(prompt);
                pipe.next();
            }
            retDouble = pipe.nextDouble();
            isValid = true;
        }while(!isValid || retDouble < low || retDouble > high);
        return retDouble;
    }

    public static boolean getYNConfirm(Scanner pipe, String prompt){
        String retString = "";
        boolean retBool;
        boolean isValid = false;
        do {
            System.out.println(prompt);
            while(!pipe.hasNextLine()){
                System.out.println("[Error]: Invalid Input");
                System.out.println(prompt);
                pipe.next();
            }
            retString = pipe.nextLine().trim().toLowerCase();
            retBool = retString.equals("y");

        }while(!retBool);
        return retBool;
    }
}
