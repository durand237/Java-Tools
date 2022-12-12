import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the range of the range");
        int range = scanner.nextInt();
        scanner.close();
        String[] gameArea = new String[range + 1];
        for(int i = 1; i < gameArea.length; i++) {
            gameArea[i] = Integer.toString(i);
            if((i % 3 == 0) && !(i % 5 == 0) ) {
                gameArea[i] = "Fizz";
            }
            else if((i % 5 == 0) && !(i % 3 == 0)) {
                gameArea[i] = "Buzz";
            }
            else if((i % 5 == 0) & (i % 3 == 0)) {
                gameArea[i] = "Fizz-Buzz";
            }
            System.out.println(gameArea[i]);
        }
        
    }
}
