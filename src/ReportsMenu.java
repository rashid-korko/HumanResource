import java.io.IOException;

public class ReportsMenu {
    void reportsmenu() throws IOException{
        System.out.println("====>Welcome to Human & Natural Reports main menu<====");
        System.out.print("\t1.Human sex reports\n"+
                         "\t2.Human country reports\n"+
                         "\t3.Human ethnicities reports\n"+
                         "\t4.Animal sex reports\n"+
                         "\t5.Animal country reports\n"+
                         "\t6.Animal type reports\n"+
                         "\t7.Plant country reports\n"+
                         "\t8.Geography country reports\n"+
                         "\t9.Exit\n"+
                         "==>Please enter the number of your choice : ");
        String choice = KeyBoard.nextLine();
        switch (choice) {
            case "1":
                KeyBoard.cleanScreen();
                Human human_sex_reports = new Human();
                System.out.print("please enter the sex of human you want :");
                human_sex_reports.SearchSex = KeyBoard.nextLine();
                human_sex_reports.HumanSexReports();
                break;
            case "2":
                KeyBoard.cleanScreen();
                Human human_country_reports = new Human();
                System.out.print("please enter the country of human you want :");
                human_country_reports.SearchCountry = KeyBoard.nextLine();
                human_country_reports.HumanCountryReports();
                break;
            case "3":
                KeyBoard.cleanScreen();
                Human human_ethnicities_reports = new Human();
                System.out.print("please enter the ethnicities of human you want :");
                human_ethnicities_reports.SearchEthnicities = KeyBoard.nextLine();
                human_ethnicities_reports.HumanEthnicitiesReports();
                break;
            case "4":
                KeyBoard.cleanScreen();
                Animal animal_sex_reports = new Animal();
                System.out.print("please enter the sex of animal you want :");
                animal_sex_reports.SearchSex = KeyBoard.nextLine();
                animal_sex_reports.AnimalSexReports();
                break;
            case "5":
                KeyBoard.cleanScreen();
                Animal animal_country_reports = new Animal();
                System.out.print("please enter the country of animal you want :");
                animal_country_reports.SearchCountry = KeyBoard.nextLine();
                animal_country_reports.AnimalCountryReports();
                break;
            case "6":
                KeyBoard.cleanScreen();
                Animal animal_type_reports = new Animal();
                System.out.print("please enter the type of animal you want :");
                animal_type_reports.SearchType = KeyBoard.nextLine();
                animal_type_reports.AnimalTypeReports();
                break;
            case "7":
                KeyBoard.cleanScreen();
                Plant plant_country_reports = new Plant();
                System.out.print("please enter the country of plant you want :");
                plant_country_reports.SearchCountry = KeyBoard.nextLine();
                plant_country_reports.PlantCountryReports();
                break;
            case "8":
                KeyBoard.cleanScreen();
                Geography geography_country_reports = new Geography();
                System.out.print("please enter the country of geography you want :");
                geography_country_reports.SearchCountry = KeyBoard.nextLine();
                geography_country_reports.GeographyCountryReports();
                break;
            case "9":
                SecondMenu secondMenu = new SecondMenu();
                secondMenu.secondmenu();
                break;
        }
    }
}
