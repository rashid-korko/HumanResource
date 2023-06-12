import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class LogIn {
    void login(){
        System.out.flush();
        String userName;
        String password;
        boolean LogInChecke = false;
        do{
            File userFile = new File("UserFile.txt");
            System.out.println("====>Welcome to the login page<====\n\n");
            System.out.println("Username : ");
            userName = KeyBoard.nextLine();
            System.out.println("Password : ");
            password = KeyBoard.nextLine();
            
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