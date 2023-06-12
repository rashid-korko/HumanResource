import java.io.IOException;
import java.util.Scanner;
public class FirstMenu {
    void firstmenu() throws IOException {
        System.out.println("====>Welcome to Human & Natural Resource program<====");
        System.out.println("\t1.SignUp\n\t2.LogIn\n\t3.Exit\n==>Please enter the number of your choice : ");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        switch (choice) {
            case "1":
                SignUp signup = new SignUp();
                signup.signup();
            case "2":
                LogIn login = new LogIn();
                login.login();
                System.out.println("FirstMenu.java:16");
                SecondMenu secondmenu = new SecondMenu();
                secondmenu.Secondmenu();
                break;
            case "3":
            break;
        }
        scanner.close();
    }
}
