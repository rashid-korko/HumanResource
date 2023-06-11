import java.io.FileWriter;
import java.io.IOException;

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
    }
    public void saveToFile() {
        try (FileWriter writer = new FileWriter("HumanData.txt")) {
            writer.write("Name: " + name + "\n");
            writer.write("Age: " + age + "\n");
            System.out.println("Data saved to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
    