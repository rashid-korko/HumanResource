import java.io.*;

public class Plant extends Obeject {
    String Type;
    String Species;
    
    
    void Insert(){
        SaveInFile(Name,Country,Type,Species);
    }

    void Edit(){
        try (RandomAccessFile file = new RandomAccessFile("Plant.bin", "rw")) {
            while (file.getFilePointer() < file.length()) {
                Name = file.readUTF();
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
                    file.seek(file.getFilePointer() - 6 * 2);
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

    void SaveInFile(String Name,String Country,String Type,String Species){
        try (DataOutputStream output = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("Plant.bin", true)))) {
            output.writeUTF(Name);
            output.writeUTF(Country);
            output.writeUTF(Type);
            output.writeUTF(Species);
        } catch (IOException ex) {
            System.err.println("Error writing to file: " + ex.getMessage());
        }
    }
}
