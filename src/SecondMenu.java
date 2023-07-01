import java.io.IOException;

public class SecondMenu {
    public void secondmenu() throws IOException{
        KeyBoard.cleanScreen();
        System.out.println("====>Welcome to Human & Natural Resource main menu<====");
        System.out.print("\t1.New resource menu\n"+
                         "\t2.Edit data menu\n"+
                         "\t3.Reports menu\n"+
                         "\t4.Exit\n"+
                         "==>Please enter the number of your choice : ");
        String choice = KeyBoard.nextLine();
        switch (choice) {
            case "1":
                KeyBoard.cleanScreen();
                NewResourceMenu newresourcemenu = new NewResourceMenu();
                newresourcemenu.newresourcemenu();
                break;
            case "2":
                KeyBoard.cleanScreen();
                EditDataMenu editdatamenu = new EditDataMenu();
                editdatamenu.editdatamenu();
                break;
            case "3":
                KeyBoard.cleanScreen();
                ReportsMenu reportsmenu = new ReportsMenu();
                reportsmenu.reportsmenu();
                break;
            case "4":
                break;
        }

    }
}
