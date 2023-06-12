import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SignUp {
    void signup() {
        System.out.flush();
        String UserName;
        String Password;
        String ConfirmPassword;
        String Email;
        String PhoneNumber;
        String FirstName;
        String LastName;
        String Birthday;
        int n = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("====>Welcome to the sign up page<====\n\n");
        System.out.println("Please enter a username: ");
        UserName = scanner.nextLine();
        System.out.println("Please enter a First name :");
        FirstName = scanner.nextLine();
        System.out.println("Please enter a Last name :");
        LastName = scanner.nextLine();
        System.out.println("Please enter a Email :");
        Email = scanner.nextLine();
        System.out.println("Please enter a Phone number :");
        PhoneNumber = scanner.nextLine();
        System.out.println("Please enter a Birthday (dd/mm/yyyy) :");
        Birthday = scanner.nextLine();
        do{
            if (n > 0)
            {
                System.out.println("your password not confirmed....");
            }
            System.out.println("Please enter a password: ");
            Password = scanner.nextLine();
            System.out.print("Please confirm your password :");
            ConfirmPassword = scanner.nextLine();
            n++;
        }while(!(Password.equals(ConfirmPassword)));

        scanner.close();

        try (FileWriter writer = new FileWriter("UserFile.txt", true)) {
            writer.write(UserName + ":" + Password + "\n");
            System.out.println("User registration successful!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}