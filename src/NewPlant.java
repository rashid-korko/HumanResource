import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NewPlant {
    void newplant(){
        String name;
        String country;
        String type;
        String species;
        String number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("name: ");
        name = scanner.nextLine();
        System.out.println("species :");
        species = scanner.nextLine();
        System.out.println("country :");
        country = scanner.nextLine();
        System.out.println("type :");
        type = scanner.nextLine();
        System.out.println("number :");
        number = scanner.nextLine();
        saveToFile(name , species , country , number , type);
        scanner.close();
    }
    public void saveToFile(String name , String species , String country , String number , String type) {
        try (FileWriter writer = new FileWriter("PlantData.txt" , true)) {
            writer.write("Kind: " + name + "\n");
            writer.write("Type: " + type + "\n");
            writer.write("Sex: " + species + "\n");
            writer.write("Country: " + country + "\n");
            writer.write("Number: " + number + "\n");
            System.out.println("Data saved to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
