import java.io.*;

public class Geography extends Obeject {
    String Type;
    String Area;
    
    void Insert(){
        SaveInFile(Name,Type,Country,Area);
    }

    void Edit(){
        try (RandomAccessFile file = new RandomAccessFile("Geography.bin", "rw")) {
            while (file.getFilePointer() < file.length()) {
                Name = file.readUTF();
                Type = file.readUTF();
                Country = file.readUTF();
                Area = file.readUTF();
                if (Name.equals(SearchName)) {
                    System.out.println("this all data for this geography :");
                    System.out.println(  "1.name : " + Name +
                                       "\n2.Type : " + Type +
                                       "\n3.country : " + Country +
                                       "\n4.Area : " + Area);
                    System.out.println("Please enter a data and new data you want to edited :");
                    System.out.print("Type :");
                    String NewType = KeyBoard.nextLine();
                    System.out.print("country :");
                    String NewCountry = KeyBoard.nextLine();
                    System.out.print("Area :");
                    String NewArea = KeyBoard.nextLine();
                    file.seek(file.getFilePointer() - 6 * 2);
                    file.writeUTF(Name);
                    file.writeUTF(NewType);
                    file.writeUTF(NewCountry);
                    file.writeUTF(NewArea);
                    System.out.println("your new data was saved thanks.....");
                    break;
                }
            }
        } catch (IOException ex) {
            System.err.println("Error editing file: " + ex.getMessage());
        }
    }

    void SaveInFile(String Name,String Type,String Country,String Area){
        try (DataOutputStream output = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("Geography.bin", true)))) {
            output.writeUTF(Name);
            output.writeUTF(Type);
            output.writeUTF(Country);
            output.writeUTF(Area);
        } catch (IOException ex) {
            System.err.println("Error writing to file: " + ex.getMessage());
        }
    }
}
