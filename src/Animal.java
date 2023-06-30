import java.io.*;

public class Animal extends Obeject {
    String Type;
    String Sex;
    String Number;
    String SearchSex;
    String SearchType;
    

    void Insert(){
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

    void Edit(){
        try (RandomAccessFile file = new RandomAccessFile("Animal.bin", "rw")) {
            while (file.getFilePointer() < file.length()) {
                Name = file.readUTF();
                Long seek_pointer = file.getFilePointer();
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
                    file.seek(seek_pointer);
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

    void AnimalSexReports(){
        System.out.printf("this all data for %s :\n" , SearchSex);
        try (RandomAccessFile file = new RandomAccessFile("Animal.bin", "r")) {
            while (file.getFilePointer() < file.length()) {
                Name = file.readUTF();
                Type = file.readUTF();
                Sex = file.readUTF();
                Country = file.readUTF();
                Number = file.readUTF();
                if (Sex.equals(SearchSex)) {
                    count++;
                    System.out.println(count + "-");
                    System.out.println(  "name : " + Name +
                                       "\nType : " + Type +
                                       "\nsex : " + Sex +
                                       "\ncountry : " + Country +
                                       "\nNumber : " + Number);
                    System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
                }
            }
        } catch (IOException ex) {
            System.err.println("Error editing file: " + ex.getMessage());
        }
        System.out.printf("we have %dth animal of %s.....\n" , count , SearchSex);
    }

    void AnimalCountryReports(){
        System.out.printf("this all data for %s :\n" , SearchCountry);
        try (RandomAccessFile file = new RandomAccessFile("Animal.bin", "r")) {
            while (file.getFilePointer() < file.length()) {
                Name = file.readUTF();
                Type = file.readUTF();
                Sex = file.readUTF();
                Country = file.readUTF();
                Number = file.readUTF();
                if (Country.equals(SearchCountry)) {
                    count++;
                    System.out.println(count + "-");
                    System.out.println(  "name : " + Name +
                                       "\nType : " + Type +
                                       "\nsex : " + Sex +
                                       "\ncountry : " + Country +
                                       "\nNumber : " + Number);
                    System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
                }
            }
        } catch (IOException ex) {
            System.err.println("Error editing file: " + ex.getMessage());
        }
        System.out.printf("we have %dth animal from %s.....\n" , count , SearchCountry);
    }

    void AnimalTypeReports(){
        System.out.printf("this all data for %s :\n" , SearchType);
        try (RandomAccessFile file = new RandomAccessFile("Animal.bin", "r")) {
            while (file.getFilePointer() < file.length()) {
                Name = file.readUTF();
                Type = file.readUTF();
                Sex = file.readUTF();
                Country = file.readUTF();
                Number = file.readUTF();
                if (Type.equals(SearchType)) {
                    count++;
                    System.out.println(count + "-");
                    System.out.println(  "name : " + Name +
                                       "\nType : " + Type +
                                       "\nsex : " + Sex +
                                       "\ncountry : " + Country +
                                       "\nNumber : " + Number);
                    System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
                }
            }
        } catch (IOException ex) {
            System.err.println("Error editing file: " + ex.getMessage());
        }
        System.out.printf("we have %dth animal of this %s.....\n" , count , SearchType);
    }
}
