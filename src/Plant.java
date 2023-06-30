import java.io.*;

public class Plant extends Obeject {
    String Type;
    String Species;
    
    
    
    void Insert(){
        try (DataOutputStream output = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("Plant.bin", true)))) {
            output.writeUTF(Name);
            output.writeUTF(Country);
            output.writeUTF(Type);
            output.writeUTF(Species);
        } catch (IOException ex) {
            System.err.println("Error writing to file: " + ex.getMessage());
        }
    }

    void Edit(){
        try (RandomAccessFile file = new RandomAccessFile("Plant.bin", "rw")) {
            while (file.getFilePointer() < file.length()) {
                Name = file.readUTF();
                Long seek_pointer = file.getFilePointer();
                Country = file.readUTF();
                Type = file.readUTF();
                Species = file.readUTF();
                if (Name.equals(SearchName)) {
                    System.out.println("this all data for this plant :");
                    System.out.println(  "1.name : " + Name +
                                       "\n2.country : " + Country +
                                       "\n3.Type : " + Type +
                                       "\n4.Species : " + Species);
                    System.out.println("Please enter a data and new data you want to edited :");
                    System.out.print("country :");
                    String NewCountry = KeyBoard.nextLine();
                    System.out.print("Type :");
                    String NewType = KeyBoard.nextLine();
                    System.out.print("Species :");
                    String NewSpecies = KeyBoard.nextLine();
                    file.seek(seek_pointer);
                    file.writeUTF(Name);
                    file.writeUTF(NewCountry);
                    file.writeUTF(NewType);
                    file.writeUTF(NewSpecies);
                    System.out.println("your new data was saved thanks.....");
                    break;
                }
            }
        } catch (IOException ex) {
            System.err.println("Error editing file: " + ex.getMessage());
        }
    }

    void PlantCountryReports(){
        System.out.printf("this all data for %s :\n" , SearchCountry);
        try (RandomAccessFile file = new RandomAccessFile("Plant.bin", "r")) {
            while (file.getFilePointer() < file.length()) {
                Name = file.readUTF();
                Country = file.readUTF();
                Type = file.readUTF();
                Species = file.readUTF();
                if (Country.equals(SearchCountry)) {
                    count++;
                    System.out.println(count + "-");
                    System.out.println(  "name : " + Name +
                                       "\ncountry : " + Country +
                                       "\nType : " + Type +
                                       "\npecies : " + Species);
                    System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
                }
            }
        } catch (IOException ex) {
            System.err.println("Error editing file: " + ex.getMessage());
        }
        System.out.printf("we have %dth plant from %s.....\n" , count , SearchCountry);
    }
}
