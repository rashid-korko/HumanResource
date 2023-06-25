import java.io.IOException;

public class NewResourceMenu {
    void newresourcemenu()throws IOException {
        System.out.flush();
        System.out.println("====>Welcome to New Resource main menu<====");
        System.out.print("\t1.New Human\n"+
                         "\t2.New Animal\n"+
                         "\t3.New Plant\n"+
                         "\t4.New Geographic\n"+
                         "\t5.Exit\n"+
                         "==>Please enter the number of your choice : ");
        String choice = KeyBoard.nextLine();
        switch (choice) {
            case "1":
                Human human = new Human();
                System.out.print("name: ");
                human.Name = KeyBoard.nextLine();
                System.out.print("sex :");
                human.Sex = KeyBoard.nextLine();
                System.out.print("Birthday (dd/mm/yyyy) :");
                human.Birthdate = KeyBoard.nextLine();
                System.out.print("country :");
                human.Country = KeyBoard.nextLine();
                System.out.print("ethnicities :");
                human.Ethnicities = KeyBoard.nextLine();
                human.Insert();
                break;
            case "2":
                Animal animal = new Animal();
                System.out.print("name: ");
                animal.Name = KeyBoard.nextLine();
                System.out.print("type :");
                animal.Type = KeyBoard.nextLine();
                System.out.print("sex :");
                animal.Sex = KeyBoard.nextLine();
                System.out.print("country :");
                animal.Country = KeyBoard.nextLine();
                System.out.print("number :");
                animal.Number = KeyBoard.nextLine();
                animal.Insert();
                break;
            case "3":
                Plant plant = new Plant();
                System.out.print("name: ");
                plant.Name = KeyBoard.nextLine();
                System.out.print("country :");
                plant.Country = KeyBoard.nextLine();
                System.out.print("type :");
                plant.Type = KeyBoard.nextLine();
                System.out.print("Species :");
                plant.Species = KeyBoard.nextLine();
                plant.Insert();
                break;
            case "4":
                Geography geography = new Geography();
                System.out.print("name: ");
                geography.Name = KeyBoard.nextLine();
                System.out.print("type :");
                geography.Type = KeyBoard.nextLine();
                System.out.print("country :");
                geography.Country = KeyBoard.nextLine();
                System.out.print("area :");
                geography.Area = KeyBoard.nextLine();
                geography.Insert();
                break;
            case "5":
                break;
        }
    }
}
