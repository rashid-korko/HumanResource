import java.io.IOException;
import java.util.Scanner;

public class NewResourceMenu {
    void newresourcemenu()throws IOException {
        System.out.flush();
        System.out.println("====>Welcome to New Resource main menu<====");
        System.out.println("\t1.New Human\n\t2.New Animal\n\t3.New Plant\n\t4.New Geographic\n\t5.Exit\n==>Please enter the number of your choice : ");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        switch (choice) {
            case "1":
                NewHuman newhuman = new NewHuman();
                newhuman.newhuman();
                break;
            case "2":
                NewAnimal newanimal = new NewAnimal();
                newanimal.newanimal();
                break;
            case "3":
                NewPlant newplant = new NewPlant();
                newplant.newplant();
                break;
            case "4":
                NewGeographic newgeographic = new NewGeographic();
                newgeographic.newgeographic();
                break;
            case "5":
                break;
        }
        scanner.close();
    }
}
