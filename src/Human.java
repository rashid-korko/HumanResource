import java.io.*;

public class Human extends Obeject {
    String Sex;
    String Birthdate;
    String Ethnicities;
    
    
    
    void Insert(){
        SaveInFile(Name,Sex,Birthdate,Country,Ethnicities);
    }

    void Edit(){
        try (RandomAccessFile file = new RandomAccessFile("Human.bin", "rw")) {
            while (file.getFilePointer() < file.length()) {
                Name = file.readUTF();
                Sex = file.readUTF();
                Birthdate = file.readUTF();
                Country = file.readUTF();
                Ethnicities = file.readUTF();
                if (Name.equals(SearchName)) {
                    System.out.println("this all data for this human :");
                    System.out.println(  "1.name : " + Name +
                                       "\n2.sex : " + Sex +
                                       "\n3.Birthday : " + Birthdate +
                                       "\n4.country : " + Country +
                                       "\n5.ethnicities : " + Ethnicities);
                    System.out.println("Please enter a data and new data you want to edited :");
                    System.out.print("sex :");
                    String NewSex = KeyBoard.nextLine();
                    System.out.print("Birthday (dd/mm/yyyy) :");
                    String NewBirthdate = KeyBoard.nextLine();
                    System.out.print("country :");
                    String NewCountry = KeyBoard.nextLine();
                    System.out.print("ethnicities :");
                    String NewEthnicities = KeyBoard.nextLine();
                    file.seek(file.getFilePointer() - 6 * 2);
                    file.writeUTF(Name);
                    file.writeUTF(NewSex);
                    file.writeUTF(NewBirthdate);
                    file.writeUTF(NewCountry);
                    file.writeUTF(NewEthnicities);
                    System.out.println("your new data was saved thanks.....");
                    break;
                }
            }
        } catch (IOException ex) {
            System.err.println("Error editing file: " + ex.getMessage());
        }
    }

    void SaveInFile(String Name,String Sex,String Birthdate,String Country,String Ethnicities){
        try (DataOutputStream output = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("Human.bin", true)))) {
            output.writeUTF(Name);
            output.writeUTF(Sex);
            output.writeUTF(Birthdate);
            output.writeUTF(Country);
            output.writeUTF(Ethnicities);
        } catch (IOException ex) {
            System.err.println("Error writing to file: " + ex.getMessage());
        }
    }
}
