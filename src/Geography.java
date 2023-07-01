import java.io.*;

public class Geography extends Obeject {
    String Type;
    String Area;
    
    
    void Insert() throws IOException{
        try (DataOutputStream output = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("Geography.bin", true)))) {
            output.writeUTF(Name);
            output.writeUTF(Type);
            output.writeUTF(Country);
            output.writeUTF(Area);
        } catch (IOException ex) {
            System.err.println("Error writing to file: " + ex.getMessage());
        }
        SecondMenu secondMenu = new SecondMenu();
        secondMenu.secondmenu();
    }

    void Edit() throws IOException{
        try (RandomAccessFile file = new RandomAccessFile("Geography.bin", "rw")) {
            while (file.getFilePointer() < file.length()) {
                Name = file.readUTF();
                Long seek_pointer = file.getFilePointer();
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
                    file.seek(seek_pointer);
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
        System.out.println("@@@@ press enter to continue @@@@");
        KeyBoard.nextLine();
        SecondMenu secondMenu = new SecondMenu();
        secondMenu.secondmenu();
    }

    void GeographyCountryReports() throws IOException{
        System.out.printf("this all data for %s :\n" , SearchCountry);
        try (RandomAccessFile file = new RandomAccessFile("Geography.bin", "r")) {
            while (file.getFilePointer() < file.length()) {
                Name = file.readUTF();
                Type = file.readUTF();
                Country = file.readUTF();
                Area = file.readUTF();
                if (Country.equals(SearchCountry)) {
                    count++;
                    System.out.println(count + "-");
                    System.out.println(  "name : " + Name +
                                       "\nType : " + Type +
                                       "\ncountry : " + Country +
                                       "\nArea : " + Area);
                    System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
                }
            }
        } catch (IOException ex) {
            System.err.println("Error editing file: " + ex.getMessage());
        }
        System.out.printf("we have %dth geography from %s.....\n" , count , SearchCountry);
        System.out.println("@@@@ press enter to continue @@@@");
        KeyBoard.nextLine();
        SecondMenu secondMenu = new SecondMenu();
        secondMenu.secondmenu();
    }
}
