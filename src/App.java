public class App {
    public static void main(String[] args) throws Exception {
        FirstMenu firstmenu = new FirstMenu();
        boolean auth_user = firstmenu.firstmenu();
        if (auth_user == true)
        {
            System.out.println("====>Welcome to Human & Natural Resource main menu<====");
            System.out.print("\t1.New resource menu\n"+
                             "\t2.Edit data menu\n"+
                             "\t3.Reports menu\n"+
                             "\t4.Exit\n"+
                             "==>Please enter the number of your choice : ");
            String choice = KeyBoard.nextLine();
            switch (choice) {
                case "1":
                    NewResourceMenu newresourcemenu = new NewResourceMenu();
                    newresourcemenu.newresourcemenu();
                    break;
                case "2":
                    EditDataMenu editdatamenu = new EditDataMenu();
                    editdatamenu.editdatamenu();
                    break;
                case "3":
                    ReportsMenu reportsmenu = new ReportsMenu();
                    reportsmenu.reportsmenu();
                    break;
                case "4":
                    break;
            }
        }
        else
        {
            System.out.println("You are not loged in to this program ..........");
        }
    }
}
