import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NewHuman {
    void newhuman(){
        String name;
        String birthdate;
        String sex;
        String country;
        String number;
        String nationality;
        String ethnicities;
        String deathdate;
        Scanner scanner = new Scanner(System.in);
        System.out.println("name: ");
        name = scanner.nextLine();
        System.out.println("sex :");
        sex = scanner.nextLine();
        System.out.println("country :");
        country = scanner.nextLine();
        System.out.println("nationality :");
        nationality = scanner.nextLine();
        System.out.println("number :");
        number = scanner.nextLine();
        System.out.println("Birthday (dd/mm/yyyy) :");
        birthdate = scanner.nextLine();
        System.out.println("ethnicities :");
        ethnicities = scanner.nextLine();
        System.out.println("deathdate (dd/mm/yyyy) if not deat yet write (00/00/0000) :");
        deathdate = scanner.nextLine();
        saveToFile( name ,  birthdate ,  sex ,  country ,  number ,  nationality ,  ethnicities ,  deathdate);
        scanner.close();
    }
    public void saveToFile(String name , String birthdate , String sex , String country , String number , String nationality , String ethnicities , String deathdate) {
        try (FileWriter writer = new FileWriter("HumanData.txt" , true)) {
            writer.write("Name: " + name + "\n");
            writer.write("Birthdate: " + birthdate + "\n");
            writer.write("Sex: " + sex + "\n");
            writer.write("Country: " + country + "\n");
            writer.write("Number: " + number + "\n");
            writer.write("Nationality: " + nationality + "\n");
            writer.write("Ethnicities: " + ethnicities + "\n");
            writer.write("Deathdate: " + deathdate + "\n");
            System.out.println("Data saved to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
    