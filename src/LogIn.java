import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class LogIn {
    void login(){
        String userName;
        String password;
        boolean LogInChecke = false;
        do{

            Scanner scanner_login = new Scanner(System.in);
            File userFile = new File("UserFile.txt");
            System.out.println("====>Welcome to the login page<====\n\n");
            System.out.println("Username : ");
            userName = scanner_login.nextLine();
            System.out.println("Password : ");
            password = scanner_login.nextLine();
            scanner_login.close();
            
            try (Scanner fileScanner = new Scanner(userFile)) {
                while (fileScanner.hasNextLine()) {
                    String line = fileScanner.nextLine();
                    String[] parts = line.split(":");
                    if (parts.length == 2 && parts[0].equals(userName) && parts[1].equals(password)) 
                    {
                        System.out.println("Login successful!");
                        fileScanner.close();
                        LogInChecke = true;
                        return;
                    }
                }
                System.out.println("Login failed. Invalid username or password.");
            } catch (FileNotFoundException e) {
                System.out.println("User file not found.");
            }
        }while(LogInChecke == false);
    }
}