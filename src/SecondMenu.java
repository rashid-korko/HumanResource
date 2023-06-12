import java.io.IOException;
import java.util.Scanner;

public class SecondMenu {
    void Secondmenu()throws IOException {
        Scanner scanner_01 = new Scanner(System.in);
        System.out.println("====>Welcome to Human & Natural Resource main menu<====");
        System.out.println("\t1.New resource menu\n"+
                            "\t2.Edit data menu\n"+
                            "\t3.Reports menu\n"+
                            "\t4.Exit\n==>Please enter the number of your choice : ");
        String choice = "4";
        try{
            choice = scanner_01.nextLine();
        }catch(Exception exception){
            System.out.println(exception.getMessage());
        }
        switch (choice) {
            case "1":
                NewResourceMenu newresourcemenu = new NewResourceMenu();
                newresourcemenu.newresourcemenu();
                break;
            case "2":
                EditDataMenu editdatamenu = new EditDataMenu();
                editdatamenu.editdatamenu();
                break;
            // case 3:
            //     ReportsMenu reportsmenu = new ReportsMenu();
            //     reportsmenu.reportsmenu();
            //     break;
            // case 4:
            //     break;
        }
        scanner_01.close();
    }
}
