import java.util.Scanner;

public class SafeInput {
    /**
     *
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @param low the lower bound of the range
     * @param high the upper bound of the range
     * @return a String response that is not zero length
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retString = "";
        do{
            System.out.print("\n" +prompt + ": ");
            retString = pipe.nextLine();
        }while(retString.isEmpty());

        return retString;

    }

    public static int getInt(Scanner pipe, String prompt){
        int retInt = 0;
        boolean isValid = false;
        do {
            System.out.println("\n"+ prompt);
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
            System.out.println("\n"+ prompt);
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
            System.out.println("\n"+ prompt + " In the range [" + low + " - " + high + "]");

            while(!pipe.hasNextInt()){
                System.out.println("[Error]: Invalid Number");
                System.out.println(prompt + " In the range [" + low + " - " + high + "]");
                pipe.next();
            }
            retInt = pipe.nextInt();
            isValid = retInt > low && retInt < high ? true : false;
            if(!isValid){
                System.out.println("[Error]: Integer out of range");
            }

        }while(!isValid);
        return retInt;
    }

    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high){
        double retDouble = 0;
        boolean isValid = false;
        do {
            System.out.println("\n"+ prompt + " in the range [" + low + " - " + high + "]");

            while(!pipe.hasNextDouble()){
                System.out.println("[Error]: Invalid Number");
                System.out.println("\n"+ prompt + " in the range [" + low + " - " + high + "]");
                pipe.next();
            }
            retDouble = pipe.nextDouble();
            isValid = retDouble >= low && retDouble <= high ? true : false;
            if(!isValid){
                System.out.println("[Error] Number out of Range");
            }
        }while(!isValid);
        return retDouble;
    }

    public static boolean getYNConfirm(Scanner pipe, String prompt){
        boolean isValid = false;
        boolean retBool = false;
        do {
            System.out.println(prompt + ": ");
            String retString = pipe.nextLine().trim().toLowerCase();
            if(retString.equals("y")){
                retBool = true;
                isValid = true;
            }else if (retString.equals("n")){
                isValid = true;
            }else{
                System.out.println("Please enter [y or n]\n['" + retString + "'] is not correct: ");
            }

        }while(!isValid);
        return retBool;
    }
    public static String getRegExString(Scanner pipe, String prompt, String regex){
        boolean isValid = false;
        String retString;
        do {
            System.out.println("\n"+prompt + ": ");
            retString = pipe.nextLine().trim();
            if(retString.matches(regex)){
                isValid = true;
            }else{
                System.out.println("Please enter a valid string");
            }
        }while(!isValid);
        return retString;
    }


    public static void printStars(int length) {
        for (int i = 0; i < length; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printSpacesAndString(String str, int sideLength, int totalLength) {
        int trueSideLength = (totalLength - str.length() - (sideLength*2))/2;

        System.out.print("***");
        for (int i = 0; i < trueSideLength; i++) {
            System.out.print(" ");
        }
        System.out.print(str);
        for (int i = 0; i < trueSideLength; i++) {
            System.out.print(" ");
        }
        System.out.println("***");
    }

    public static String getRangedLengthString(Scanner pipe,String prompt, int length){
        String retString = "";
        do {
            System.out.println(prompt);
            retString = pipe.nextLine();
        }while (!(!retString.isEmpty()) && !(retString.length() < length));
        return retString;
    }




}
