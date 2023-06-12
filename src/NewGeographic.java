import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NewGeographic {
    void newgeographic(){
        System.out.flush();
        String name;
        String type;
        String country;
        String area;
        Scanner scanner = new Scanner(System.in);
        System.out.println("name: ");
        name = scanner.nextLine();
        System.out.println("country :");
        country = scanner.nextLine();
        System.out.println("type :");
        type = scanner.nextLine();
        System.out.println("area :");
        area = scanner.nextLine();
        saveToFile(name , country , area , type);
        scanner.close();
    }
    public void saveToFile(String name , String country , String area , String type) {
        try (FileWriter writer = new FileWriter("GeographicData.txt" , true)) {
            writer.write("Kind: " + name + "\n");
            writer.write("Type: " + type + "\n");
            writer.write("Country: " + country + "\n");
            writer.write("Number: " + area + "\n");
            System.out.println("Data saved to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
