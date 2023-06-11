import java.io.IOException;
import java.util.Scanner;
public class FirstMenu {
    void firstmenu() throws IOException {
        System.out.println("====>Welcome to Warehouse Management program<====");
        System.out.println("\t1.SignUp\n\t2.LogIn\n\t3.Exit\n==>Please enter the number of your choice : ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                SignUp signup = new SignUp();
                signup.signup();
                scanner.close();
                break;
            case 2:
                LogIn login = new LogIn();
                login.login();
                scanner.close();
                break;
            case 3:
                scanner.close();
                break;
        }
    }
}
