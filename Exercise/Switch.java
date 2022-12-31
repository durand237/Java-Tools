import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {

        Scanner myWord = new Scanner(System.in);
        System.out.println("enter the word to define");
        String word = myWord.nextLine();
        myWord.close();
        switch(word) {
            case "hoch":
                System.out.println("The opposite is: tief");
                break;
            case "tief":
                System.out.println("The opposite is: hoch");
                break;
            case "klein":
                System.out.println("The opposite is: groß");
                break;
            case "groß":
                System.out.println("The opposite is: klein");
                break;
            case "stark":
                System.out.println("The opposite is: schwach");
                break;   
            case "schwach":
                System.out.println("The opposite is: stark");
                break; 
            default:
                System.out.println("the Word was not define");
        } 
    }
}