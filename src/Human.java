import java.io.*;

public class Human extends Obeject {
    String Sex;
    String Birthdate;
    String Ethnicities;
    String SearchSex;
    String SearchEthnicities;
    
    
    void Insert() throws IOException{
        try (DataOutputStream output = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("Human.bin", true)))) {
            output.writeUTF(Name);
            output.writeUTF(Sex);
            output.writeUTF(Birthdate);
            output.writeUTF(Country);
            output.writeUTF(Ethnicities);
        } catch (IOException ex) {
            System.err.println("Error writing to file: " + ex.getMessage());
        }
        SecondMenu secondMenu = new SecondMenu();
        secondMenu.secondmenu();
    }

    void Edit() throws IOException{
        try (RandomAccessFile file = new RandomAccessFile("Human.bin", "rw")) {
            while (file.getFilePointer() < file.length()) {
                Name = file.readUTF();
                Long seek_pointer = file.getFilePointer();
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
                    file.seek(seek_pointer);
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
        SecondMenu secondMenu = new SecondMenu();
        secondMenu.secondmenu();
    }

    void HumanSexReports() throws IOException{
        System.out.printf("this all data for %s :\n" , SearchSex);
        try (RandomAccessFile file = new RandomAccessFile("Human.bin", "r")) {
            while (file.getFilePointer() < file.length()) {
                Name = file.readUTF();
                Sex = file.readUTF();
                Birthdate = file.readUTF();
                Country = file.readUTF();
                Ethnicities = file.readUTF();
                if (Sex.equals(SearchSex)) {
                    count++;
                    System.out.println(count + "-");
                    System.out.println(  "name : " + Name +
                                       "\nsex : " + Sex +
                                       "\nBirthday : " + Birthdate +
                                       "\ncountry : " + Country +
                                       "\nethnicities : " + Ethnicities);
                    System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
                }
            }
        } catch (IOException ex) {
            System.err.println("Error editing file: " + ex.getMessage());
        }
        System.out.printf("we have %dth human of %s.....\n" , count , SearchSex);
        SecondMenu secondMenu = new SecondMenu();
        secondMenu.secondmenu();
    }

    void HumanCountryReports() throws IOException{
        System.out.printf("this all data for %s :\n" , SearchCountry);
        try (RandomAccessFile file = new RandomAccessFile("Human.bin", "r")) {
            while (file.getFilePointer() < file.length()) {
                Name = file.readUTF();
                Sex = file.readUTF();
                Birthdate = file.readUTF();
                Country = file.readUTF();
                Ethnicities = file.readUTF();
                if (Country.equals(SearchCountry)) {
                    count++;
                    System.out.println(count + "-");
                    System.out.println(  "name : " + Name +
                                       "\nsex : " + Sex +
                                       "\nBirthday : " + Birthdate +
                                       "\ncountry : " + Country +
                                       "\nethnicities : " + Ethnicities);
                    System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
                }
            }
        } catch (IOException ex) {
            System.err.println("Error editing file: " + ex.getMessage());
        }
        System.out.printf("we have %dth human from %s.....\n" , count , SearchCountry);
        SecondMenu secondMenu = new SecondMenu();
        secondMenu.secondmenu();
    }

    void HumanEthnicitiesReports() throws IOException{
        System.out.printf("this all data for %s :\n" , SearchEthnicities);
        try (RandomAccessFile file = new RandomAccessFile("Human.bin", "r")) {
            while (file.getFilePointer() < file.length()) {
                Name = file.readUTF();
                Sex = file.readUTF();
                Birthdate = file.readUTF();
                Country = file.readUTF();
                Ethnicities = file.readUTF();
                if (Ethnicities.equals(SearchEthnicities)) {
                    count++;
                    System.out.println(count + "-");
                    System.out.println(  "name : " + Name +
                                       "\nsex : " + Sex +
                                       "\nBirthday : " + Birthdate +
                                       "\ncountry : " + Country +
                                       "\nethnicities : " + Ethnicities);
                    System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
                }
            }
        } catch (IOException ex) {
            System.err.println("Error editing file: " + ex.getMessage());
        }
        System.out.printf("we have %dth human %s.....\n" , count , SearchEthnicities);
        SecondMenu secondMenu = new SecondMenu();
        secondMenu.secondmenu();
    }

}
