import java.io.IOException;
import java.util.Scanner;

public class EditDataMenu {
    void editdatamenu()throws IOException {
        System.out.flush();
        System.out.println("====>Welcome to New Resource main menu<====");
        System.out.println("\t1.Edit Human Data\n\t2.Edit Animal Data\n\t3.Edit Plant Data\n\t4.Edit Geographic Data\n\t5.Exit\n==>Please enter the number of your choice : ");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        switch (choice) {
            case "1":
                EditHumanData edithumandata = new EditHumanData();
                edithumandata.edithumandata();
                break;
            // case "2":
            //     EditAnimalData editanimaldata = new EditAnimalData();
            //     editanimaldata.editanimaldata();
            //     break;
            // case "3":
            //     EditPlantData editplantdata = new EditPlantData();
            //     editplantdata.editplantdata();
            //     break;
            // case "4":
            //     EditGeographicData editgeographicdata = new EditGeographicData();
            //     editgeographicdata.editgeographicdata();
            //     break;
            case "5":
                break;
        }
        scanner.close();
    }
}
