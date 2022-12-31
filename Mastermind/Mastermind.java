import java.util.Scanner;
import java.util.Random;

public class Mastermind {
    static String testInput(String tryCode, String endCode) {
        for (int i = 0; i < tryCode.length(); i++) {
        char tryDigit = tryCode.charAt(i);
        for(int y = 0; y < endCode.length(); y++) {
                char endDigit = endCode.charAt(y);
                if(i == y & endDigit == tryDigit) {
                    break;
                }
                else if (i != y & tryDigit == endDigit) {
                    System.out.println("the digit" + " " + tryDigit + " " + "should at" + " " + y + 1 + ". place. \n");
                }
            }
        }
        return "perfekt the code match";
    }
    public static void main( String[] args) {
        Random random = new Random();
        int digit = random.nextInt(8) + 1; 
        int[] code = new int[4];
        String endCode = String.valueOf(digit);

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the code");
        String tryCode = sc.next();
        while(tryCode.length() != 4) {
            System.out.println( "your tryCode doesn't have the good length! \n");
            System.out.println( "please enter a Code with 4 digit: ");
            tryCode = sc.next();
        }
        sc.close();

        for(int i = 0; i < code.length; i++) {
            code[i] = digit;
            digit = random.nextInt(8) + 1;
            //System.out.println(code[i]);
            if (i > 0) {
                endCode += String.valueOf(code[i]);
            } 
        }

        testInput(tryCode, endCode);
        System.out.println("the endCode is:"  + " " + endCode + " " + endCode.length());
    }
}
