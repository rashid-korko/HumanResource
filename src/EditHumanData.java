import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EditHumanData {
    void edithumandata(){
        System.out.flush();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the person whose data you want to edit:");
        String personName = scanner.nextLine();

        try {
            File inputFile = new File("HumanData.txt");
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));

            String line;
            boolean found = false;

            while ((line = reader.readLine()) != null) {
                if (line.startsWith("Name: " + personName)) {
                    found = true;
                    System.out.println(line);
                    while ((line = reader.readLine()) != null && !line.isEmpty()) {
                        System.out.println(line);
                    }
                    break;
                }
            }

            reader.close();

            if (!found) {
                System.out.println("Person not found in file.");
                return;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Which field do you want to edit?");
        System.out.println("1. Name");
        System.out.println("2. Birthdate");
        System.out.println("3. Sex");
        System.out.println("4. Country");
        System.out.println("5. Number");
        System.out.println("6. Nationality");
        System.out.println("7. Ethnicities");
        System.out.println("8. Deathdate");
        int choice = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the new value for the field:");
        String newValue = scanner.nextLine();
        scanner.close();

        String fieldToEdit;
        switch (choice) {
            case 1:
                fieldToEdit = "Name";
                break;
            case 2:
                fieldToEdit = "Birthdate";
                break;
            case 3:
                fieldToEdit = "Sex";
                break;
            case 4:
                fieldToEdit = "Country";
                break;
            case 5:
                fieldToEdit = "Number";
                break;
            case 6:
                fieldToEdit = "Nationality";
                break;
            case 7:
                fieldToEdit = "Ethnicities";
                break;
            case 8:
                fieldToEdit = "Deathdate";
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        try {
            File inputFile = new File("HumanData.txt");
            File tempFile = new File("TempHumanData.txt");
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

            String line;
            boolean foundPerson = false;

            while ((line = reader.readLine()) != null) {
                if (line.startsWith("Name: " + personName)) {
                    foundPerson = true;
                    String[] parts = line.split(": ");
                    String fieldName = parts[0];
                    if (fieldName.equalsIgnoreCase(fieldToEdit)) {
                        writer.write(fieldName + ": " + newValue + "\n");
                    } else {
                        writer.write(line + "\n");
                    }
                } else {
                    writer.write(line + "\n");
                }
            }

            reader.close();
            writer.close();

            if (!foundPerson) {
                System.out.println("Person not found in file.");
            } else {
                boolean successful = tempFile.renameTo(inputFile);
                if (successful) {
                    System.out.println("Data updated successfully.");
                } else {
                    System.out.println("Error updating data.");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}