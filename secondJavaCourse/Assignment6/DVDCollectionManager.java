package secondJavaCourse.Assignment6;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class DVDCollectionManager {
    ArrayList<DVD> listOfDVDs;

    public DVDCollectionManager() {
        listOfDVDs = new ArrayList<>();
    }

    //gets info from file and makes dvds from file;
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

    //displays info from dvd collection
    public void displayInfo() {
        for (DVD dvd : listOfDVDs) {
            System.out.println(dvd);
        }
    }

    //adds to dvd collection
    public void addDvdToCollection(String title, String category, int time, String year, float price) {
        listOfDVDs.add(new DVD(title, category, time, year, price));
    }

    //removes from dvd collection
    public DVD removeFromDVDCollection(String title) {
        DVD dvd = getDVDByTitle(title);
        if (dvd != null) {
            listOfDVDs.remove(dvd);
        }
        return dvd;
    }

    //gets dvd from dvd collections and returns the dvd
    public DVD getDVDByTitle(String title) {
        for (DVD dvd : listOfDVDs) {
            if (title.equals(dvd.getTitle())) {
                return dvd;
            }
        }
        return null;
    }

    //saves data to file
    public void saveDataToFile(String fileName) {
        PrintWriter printWriter;
        try {
            printWriter = new PrintWriter(new FileWriter(fileName));
        } catch (IOException e) {
            System.out.println("File not found");
            return;
        }
        for (DVD dvd : listOfDVDs) {
            printWriter.printf("""
                    %s
                    %s
                    %s
                    %s
                    %s
                    """.formatted(dvd.getTitle(), dvd.getCategory(), dvd.getTime(), dvd.getYear(), dvd.getPrice()));
        }
        printWriter.close();
    }
}
