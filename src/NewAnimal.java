import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NewAnimal {
    void newanimal(){
        System.out.flush();
        String kind;
        String type;
        String birthdate;
        String sex;
        String country;
        String number;
        String deathdate;
        Scanner scanner = new Scanner(System.in);
        System.out.println("kind: ");
        kind = scanner.nextLine();
        System.out.println("sex :");
        sex = scanner.nextLine();
        System.out.println("country :");
        country = scanner.nextLine();
        System.out.println("type :");
        type = scanner.nextLine();
        System.out.println("number :");
        number = scanner.nextLine();
        System.out.println("Birthday (dd/mm/yyyy) :");
        birthdate = scanner.nextLine();
        System.out.println("deathdate (dd/mm/yyyy) if not deat yet write (00/00/0000):");
        deathdate = scanner.nextLine();
        saveToFile(kind , birthdate , sex , country , number , type , deathdate);
        scanner.close();
    }
    public void saveToFile(String kind , String birthdate , String sex , String country , String number , String type , String deathdate) {
        try (FileWriter writer = new FileWriter("AnimalData.txt" , true)) {
            writer.write("Kind: " + kind + "\n");
            writer.write("Type: " + type + "\n");
            writer.write("Sex: " + sex + "\n");
            writer.write("Country: " + country + "\n");
            writer.write("Number: " + number + "\n");
            writer.write("Birthdate: " + birthdate + "\n");
            writer.write("Deathdate: " + deathdate + "\n");
            System.out.println("Data saved to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
