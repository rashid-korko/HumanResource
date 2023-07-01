import java.io.IOException;

public class EditDataMenu {
    void editdatamenu()throws IOException {
        System.out.flush();
        System.out.println("====>Welcome to Edit Resource main menu<====");
        System.out.println("\t1.Edit Human Data\n"+
                           "\t2.Edit Animal Data\n"+
                           "\t3.Edit Plant Data\n"+
                           "\t4.Edit Geographic Data\n"+
                           "\t5.Exit\n"+
                           "==>Please enter the number of your choice : ");
        String choice = KeyBoard.nextLine();
        switch (choice) {
            case "1":
                KeyBoard.cleanScreen();
                Human human = new Human();
                System.out.print("enter the name you want to edit his data : ");
                human.SearchName = KeyBoard.nextLine();
                human.Edit();
                break;
            case "2":
                KeyBoard.cleanScreen();
                Animal animal = new Animal();
                System.out.print("enter the name you want to edit his data : ");
                animal.SearchName = KeyBoard.nextLine();
                animal.Edit();
                break;
            case "3":
                KeyBoard.cleanScreen();
                Plant plant = new Plant();
                System.out.print("enter the name you want to edit his data : ");
                plant.SearchName = KeyBoard.nextLine();
                plant.Edit();
                break;
            case "4":
                KeyBoard.cleanScreen();
                Geography geography = new Geography();
                System.out.print("enter the name you want to edit his data : ");
                geography.SearchName = KeyBoard.nextLine();
                geography.Edit();
                break;
            case "5":
                SecondMenu secondMenu = new SecondMenu();
                secondMenu.secondmenu();
                break;
        }
    }
}
