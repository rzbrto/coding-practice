package secondJavaCourse.Assignment6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DVDCollectionManager {
    ArrayList<DVD> listOfDVDs;

    public DVDCollectionManager() {
        listOfDVDs = new ArrayList<>();
    }

    public void loadData(String fileName) {
        Scanner reader;
        try {
            reader = new Scanner(new File("DVDCollection.txt"));
        } catch (FileNotFoundException e) {
            return;
        }
        while (reader.hasNextLine()) {
            DVD dvd = new DVD(reader.nextLine(), reader.nextLine(), Integer.parseInt(reader.nextLine()), reader.nextLine(), Float.parseFloat(reader.nextLine()));
            listOfDVDs.add(dvd);
        }
        reader.close();
    }

    public void displayInfo() {
        for (DVD dvd : listOfDVDs) {
            System.out.println(dvd);
        }
    }

    public void addDvdToCollection(String title, String category, int time, String year, float price) {
        listOfDVDs.add(new DVD(title, category, time, year, price));
    }

    public void removeFromDVDCollection() {

    }

    public DVD getDVDByTitle(String title) {
        for (DVD dvd : listOfDVDs) {
            if (title.equals(dvd.getTitle())) {
               return dvd;
            }
        }
        return null;
    }
}
