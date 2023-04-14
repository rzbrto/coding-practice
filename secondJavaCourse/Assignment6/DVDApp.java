package secondJavaCourse.Assignment6;

import java.util.Scanner;

public class DVDApp {
    private static DVDCollectionManager dvdCollectionManager;
    private static boolean modified = false;

    public static void printMenu() {
        System.out.println(MENU_OPTIONS);
    }

    public static void main(String[] args) {
        dvdCollectionManager = new DVDCollectionManager();
        dvdCollectionManager.loadData("DVDCollection.txt");
        Scanner kbd = new Scanner(System.in);
        int input = 1;
        dvdCollectionManager.displayInfo();

        while (input != 0) {
            printMenu();
            input = Integer.parseInt(kbd.nextLine());
            switch (input) {
                case 1 -> addDVDEntry();
                case 2 -> changeDVDEntry();
                case 3 -> lookUpDVDEntry();
                case 4 -> displayDVDByCategory();
                case 5 -> removeDVDEntry();
                case 6 -> saveData();
                case 0 -> exitDVDApp();
            }
            dvdCollectionManager.displayInfo();
        }
    }

    //exits DVDApp
    private static void exitDVDApp() {
        saveData();
        System.out.println("Logged Off");
        System.exit(0);
    }

    //Saves DVDData
    private static void saveData() {
        if (modified) {
            dvdCollectionManager.saveDataToFile("DVDCollection.txt");
            modified = false;
        }
    }

    //Removes DVD entry
    private static void removeDVDEntry() {
        Scanner kbd = new Scanner(System.in);
        System.out.println("Enter tile of DVD to remove: ");
        String input = kbd.nextLine();
        DVD dvd = dvdCollectionManager.removeFromDVDCollection(input);
        System.out.println(dvd == null
                ? "movie not found"
                : "The following movie has been removed:\n" + dvd);
        modified = true;
    }

    //prints dvds by category
    private static void displayDVDByCategory() {
        Scanner kbd = new Scanner(System.in);
        System.out.print("Enter the category to look up: ");
        String input = kbd.nextLine();
        boolean found = false;

        for (DVD dvd : dvdCollectionManager.listOfDVDs) {
            if (dvd.getCategory().equalsIgnoreCase(input)) {
                System.out.println(dvd);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No DVDs in that category\n");
        }

    }

    //looks for DVDs
    private static void lookUpDVDEntry() {
        Scanner kbd = new Scanner(System.in);
        System.out.print("Title to look up: ");
        DVD dvd = dvdCollectionManager.getDVDByTitle(kbd.nextLine());
        System.out.println(dvd == null ? "not found" : dvd);
    }

    //changes entry on dvd
    private static void changeDVDEntry() {
        Scanner kbd = new Scanner(System.in);
        System.out.print("Enter DVD title to modify: ");
        DVD dvd = dvdCollectionManager.getDVDByTitle(kbd.nextLine());
        System.out.printf(MODIFY_MENU.formatted(dvd.getTitle(), dvd.getTitle(), dvd.getCategory(), dvd.getTime(), dvd.getYear(), dvd.getPrice()));
        int fieldToModify = kbd.nextInt();
        kbd.nextLine();

        switch (fieldToModify) {
            case 1 -> System.out.println("Cannot Modify title");
            case 2 -> {
                System.out.println("Enter new Category: ");
                dvd.setCategory(kbd.nextLine());
            }
            case 3 -> {
                System.out.println("Enter new Running Time: ");
                dvd.setTime(Integer.parseInt(kbd.nextLine()));
            }
            case 4 -> {
                System.out.println("Enter new Year: ");
                dvd.setYear(kbd.nextLine());
            }
            case 5 -> {
                System.out.println("Enter new Price: ");
                dvd.setPrice(Float.parseFloat(kbd.nextLine()));
            }
            case 0 -> {
                return;
            }
            default -> System.out.println("invalid option");
        }
        modified = true;
    }

    //adds dvd to entry
    private static void addDVDEntry() {
        Scanner kbd = new Scanner(System.in);
        System.out.print("Enter DVD data:\nTitle: ");
        String title = kbd.nextLine();
        System.out.print("Category: ");
        String category = kbd.nextLine();
        System.out.print("Running Time (in minutes): ");
        int time = Integer.parseInt(kbd.nextLine());
        System.out.print("Year: ");
        String year = kbd.nextLine();
        System.out.print("Price: ");
        float price = kbd.nextFloat();
        kbd.nextLine();

        dvdCollectionManager.addDvdToCollection(title, category, time, year, price);
        modified = true;
    }

    //prints Modify Menu
    private static final String MODIFY_MENU = """
            Information of      %s
            (1)Title:           %s
            (2)Category:        %s
            (3)Running Time:    %s minutes
            (4)Year:            %s
            (5)Price:           %.2f
            (0)Return to Main Menu
            (Enter a option 1 through 5 to modify. Title can not be changed.)
            """;

    //prints Menu Options
    private static final String MENU_OPTIONS = """
            Menu:
            (Choose either 1 through 7)
            (1)Add new DVD Entry
            (2)Change existing DVD entry
            (3)Look Up DVD Entry
            (4)Display DVDs By Category
            (5)Remove DVD Entry
            (6)Save Data
            (0)Exit
            """;
}
