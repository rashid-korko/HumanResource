import java.io.IOException;
import java.util.Scanner;

public class SecondMenu {
    void Secondmenu()throws IOException {
        System.out.println("====>Welcome to Human & Natural Resource main menu<====");
        System.out.println("\t1.New resource menu\n\t2.Edit data menu\n\t3.Reports menu\n\t4.Exit\n==>Please enter the number of your choice : ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                NewResourceMenu newresourcemenu = new NewResourceMenu();
                newresourcemenu.newresourcemenu();
                scanner.close();
                break;
            // case 2:
            //     EditDataMenu editdatamenu = new EditDataMenu();
            //     editdatamenu.editdatamenu();
            //     scanner.close();
            //     break;
            // case 3:
            //     ReportsMenu reportsmenu = new ReportsMenu();
            //     reportsmenu.reportsmenu();
            //     scanner.close();
            //     break;
            // case 4:
            //     scanner.close();
            //     break;
        }
    }
}
