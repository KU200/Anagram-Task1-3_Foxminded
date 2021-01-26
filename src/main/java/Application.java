import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        while (true) {
            System.out.println("\n" + "Input the string that is needed to reverse and press Enter or input 'e' and press Enter for exit " + "\n");
            Scanner keyboard = new Scanner(System.in);
            String keyboardInput = keyboard.nextLine();
            if (!keyboardInput.equals("e")) {
                AnagramMaker anagramMaker = new AnagramMaker();
                System.out.println("\n" + "Reversed string: " + "\n" + "\n" + anagramMaker.revers(keyboardInput));
            } else if (keyboardInput.equals("e")) {
                System.out.println("\n" + "The application has been closed");
                break;
            }
        }
    }
}
