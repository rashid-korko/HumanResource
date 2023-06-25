import java.io.*;

public class Animal extends Obeject {
    String Type;
    String Sex;
    String Number;

    void Insert(){
        SaveInFile(Name,Type,Sex,Country,Number);
    }

    void Edit(){
        try (RandomAccessFile file = new RandomAccessFile("Animal.bin", "rw")) {
            while (file.getFilePointer() < file.length()) {
                Name = file.readUTF();
                Type = file.readUTF();
                Sex = file.readUTF();
                Country = file.readUTF();
                Number = file.readUTF();
                if (Name.equals(SearchName)) {
                    System.out.println("this all data for this animal :");
                    System.out.println(  "1.name : " + Name +
                                       "\n2.Type : " + Type +
                                       "\n3.sex : " + Sex +
                                       "\n4.country : " + Country +
                                       "\n5.Number : " + Number);
                    System.out.println("Please enter a data and new data you want to edited :");
                    System.out.print("sex :");
                    String NewSex = KeyBoard.nextLine();
                    System.out.print("Type :");
                    String NewType = KeyBoard.nextLine();
                    System.out.print("country :");
                    String NewCountry = KeyBoard.nextLine();
                    System.out.print("Number :");
                    String NewNumber = KeyBoard.nextLine();
                    file.seek(file.getFilePointer() - 6 * 2);
                    file.writeUTF(Name);
                    file.writeUTF(NewType);
                    file.writeUTF(NewSex);
                    file.writeUTF(NewCountry);
                    file.writeUTF(NewNumber);
                    System.out.println("your new data was saved thanks.....");
                    break;
                }
            }
        } catch (IOException ex) {
            System.err.println("Error editing file: " + ex.getMessage());
        }
    }

    void SaveInFile(String Name,String Type,String Sex,String Country,String Number){
        try (DataOutputStream output = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("Animal.bin", true)))) {
            output.writeUTF(Name);
            output.writeUTF(Type);
            output.writeUTF(Sex);
            output.writeUTF(Country);
            output.writeUTF(Number);
        } catch (IOException ex) {
            System.err.println("Error writing to file: " + ex.getMessage());
        }
    }
}
