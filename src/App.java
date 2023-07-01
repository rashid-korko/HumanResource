public class App {
    public static void main(String[] args) throws Exception {
        FirstMenu firstmenu = new FirstMenu();
        boolean auth_user = firstmenu.firstmenu();
        if (auth_user == true)
        {
            SecondMenu secondMenu = new SecondMenu();
            secondMenu.secondmenu();
        }
        else
        {
            System.out.println("You are not loged in to this program ..........");
        }
    }
}
