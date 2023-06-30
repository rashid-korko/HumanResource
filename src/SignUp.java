import java.io.FileWriter;
import java.io.IOException;



public class SignUp {
    void signup() {
        String UserName;
        String Password;
        String ConfirmPassword;
        String Email;
        String PhoneNumber;
        String FirstName;
        String LastName;
        String Birthday;
        int n = 0;
        
        System.out.println("====>Welcome to the sign up page<====\n\n");
        System.out.println("Please enter a username: ");
        UserName = KeyBoard.nextLine();
        System.out.println("Please enter a First name :");
        FirstName = KeyBoard.nextLine();
        System.out.println("Please enter a Last name :");
        LastName = KeyBoard.nextLine();
        System.out.println("Please enter a Email :");
        Email = KeyBoard.nextLine();
        System.out.println("Please enter a Phone number :");
        PhoneNumber = KeyBoard.nextLine();
        System.out.println("Please enter a Birthday (dd/mm/yyyy) :");
        Birthday = KeyBoard.nextLine();
        do{
            if (n > 0)
            {
                System.out.println("your password not confirmed....");
            }
            System.out.println("Please enter a password: ");
            Password = KeyBoard.nextLine();
            System.out.print("Please confirm your password :");
            ConfirmPassword = KeyBoard.nextLine();
            n++;
        }while(!(Password.equals(ConfirmPassword)));

        try (FileWriter writer = new FileWriter("UserFile.txt", true)) {
            writer.write(UserName + ":" + Password + "\n");
            System.out.println("User registration successful!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}