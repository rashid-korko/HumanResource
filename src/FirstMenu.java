import java.io.IOException;
public class FirstMenu {
    public boolean firstmenu() throws IOException {
        boolean login_checke = false;
        System.out.println("====>Welcome to Human & Natural Resource program<====");
        System.out.print("\t1.SignUp\n"+
                         "\t2.LogIn\n"+
                         "\t3.Exit\n"+
                         "==>Please enter the number of your choice : ");
        String choice = KeyBoard.nextLine();
        System.out.println();
        switch (choice) {
            case "1":
                SignUp signup = new SignUp();
                signup.signup();
            case "2":
                LogIn login = new LogIn();
                login.login();
                login_checke = true;
                break;
            case "3":
            break;
        }
        return login_checke;
    }
}
