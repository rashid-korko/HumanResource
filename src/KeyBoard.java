import java.util.Scanner;

public class KeyBoard {

    public static String nextLine(){
        Scanner keyboard = new Scanner(System.in);
        return keyboard.nextLine();
    }

    public static void cleanScreen(){
        System.out.print("\033[H\033[2J");
        // System.out.flush();
    }
}
