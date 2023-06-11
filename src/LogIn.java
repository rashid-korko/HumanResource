import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class LogIn {
    void login(){
        String userName;
        String password;
        Scanner scanner = new Scanner(System.in);
        File userFile = new File("UserFile.txt");
        System.out.println("====>Welcome to the login page<====\n\n");
        System.out.println("Username : ");
        userName = scanner.nextLine();
        System.out.println("Password : ");
        password = scanner.nextLine();

        scanner.close();

        try (Scanner fileScanner = new Scanner(userFile)) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split(":");
                if (parts.length == 2 && parts[0].equals(userName) && parts[1].equals(password)) {
                    System.out.println("Login successful!");
                    return;
                }
            }
            System.out.println("Login failed. Invalid username or password.");
        } catch (FileNotFoundException e) {
            System.out.println("User file not found.");
        }
    }
}