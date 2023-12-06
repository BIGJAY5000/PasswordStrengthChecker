import java.util.Scanner;
public class InputHelper {
    public static void main(String[] args) {
        //Test Method
        Scanner scan = new Scanner(System.in);

        prettyHeader("HI HAVE A GREAT DAY");
    }

    //This method loops until a valid integer input is received. Returns int value.
    public static int getInt(Scanner in, String prompt) {
        boolean done = false;
        int x = 0;
        System.out.println(prompt);
        do {
            if (in.hasNextInt()) {
                x = in.nextInt();
                done = true;
            } else {
                System.out.println("You have entered an invalid value");
            }
            in.nextLine(); //clear buffer
        } while (!done);
        return x;
    }

    public static int getRangedInt(Scanner in, String prompt, int min, int max) {
        boolean done = false;
        int x = 0;
        System.out.println(prompt);
        do {
            if (in.hasNextInt()) {
                x = in.nextInt();
                //check to see if value is in the range
                if (x <= max && x >= min) {
                    done = true;
                } else {
                    System.out.println("You have entered an invalid value");
                }

            } else {
                System.out.println("You have entered an invalid value");
            }
            in.nextLine(); //clear buffer
        } while (!done);
        return x;
    }

    public static double getDouble(Scanner in, String prompt) {
        boolean done = false;
        double x = 0;
        System.out.println(prompt);
        do {
            if (in.hasNextDouble()) {
                x = in.nextDouble();
                done = true;
            } else {
                System.out.println("You have entered an invalid value");
            }
            in.nextLine();
        } while (!done);
        return x;
    }

    public static double getRangedDouble(Scanner in, String prompt, double min, double max) {
        boolean done = false;
        double x = 0;
        System.out.println(prompt);
        do {
            if (in.hasNextDouble()) {
                x = in.nextDouble();
                //check to see if value is in the range
                if (x <= max && x >= min) {
                    done = true;
                } else {
                    System.out.println("You have entered an invalid value");
                }

            } else {
                System.out.println("You have entered an invalid value");
            }
            in.nextLine(); //clear buffer
        } while (!done);
        return x;
    }

    public static int getPositiveNonZeroInt(Scanner in, String prompt) {
        boolean done = false;
        int x = 0;

        System.out.println(prompt);
        do {
            if (in.hasNextInt()) {
                x = in.nextInt();
                if (x > 0) {
                    done = true;
                } else {
                    System.out.println("You have entered an invalid value");
                }
            } else {
                System.out.println("You have entered an invalid value");
            }
            in.nextLine();
        } while (!done);
        return x;
    }

    public static String getRegExString(Scanner in, String prompt, String regEx) {
        boolean done = false;
        String input;
        System.out.println(prompt);
        do {
            input = in.nextLine();
            if (input.matches(regEx)) {
                done = true;
            } else {
                System.out.println("You have entered an invalid value");
            }
        } while (!done);
        return input;
    }

    public static boolean getYNConfirm(Scanner in, String prompt) {
        boolean done = false;
        String YN;
        do {
            System.out.println(prompt);
            YN = in.nextLine();
            YN = YN.toUpperCase();
            if (YN.equals("N") || YN.equals("Y")) {
                done = true;
            } else {
                System.out.println("You have entered an invalid input");
            }
        } while (!done);
        if (YN.equals("Y")) {
            return false;
        } else {
            return true;
        }
    }

    public static String getNonZeroLenString(Scanner in, String prompt) {
        boolean done = false;
        String input;
        System.out.println(prompt);
        do {
            input = in.nextLine();
            if (input.length() > 0) {
                done = true;
            } else {
                System.out.println("You have entered an invalid input");
            }
        } while (!done);
        return input;
    }

    public static void prettyHeader(String msg) {
        String x = "";
        int y = msg.length();
        int z = (54 - y) / 2;
        int a = 0;
        for (int i = 0; i <= 60; i++) {
            x += "*";
        }
        System.out.println(x);
        x = "";

        for (int j = 0; j <= 60; j++) {
            if (j < 3 || j > 57) {
                x += "*";
            } else if (j > z + 3 && j < 57 - z) {
                x += (msg.substring(a, a + 1));
                a++;
            } else {
                x += " ";
            }
        }
        System.out.println(x);

        x = "";
        for (int k = 0; k <= 60; k++) {
            x += "*";
        }
        System.out.println(x);
    }
}

