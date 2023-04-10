package newConcepts.OOP;

import java.util.*;


public class Person {
    private final String firstName;
    private final String lastName;
    private final ArrayList<UUID> listOfBanks = new ArrayList<>();
    private String hairType = null;
    private String hairColor = null;

    public Person(String first, String last, String hairC, String hairT) {
        firstName = first;
        lastName = last;
        hairType = hairT;
        hairColor = hairC;
    }

    public Person(String first, String last) {
        firstName = first;
        lastName = last;
    }

    public Person(String fullName) {
        String[] parts = fullName.split(" ");
        if (parts.length > 1){
            firstName = parts[0];
            lastName = parts[1];
        } else {
            firstName = fullName;
            lastName = null;
        }
    }

    @Override
    public String toString() {
        return """
                Person:
                    firstName: %s
                    lastName:  %s
                    hairType:  %s
                    hairColor: %s
                """
                .formatted(
                        firstName,
                        lastName == null ? "N/A" : lastName,
                        hairType == null ? "N/A" : hairType,
                        hairColor == null ? "N/A" : hairColor);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getHairType() {
        return hairType;
    }

    public void setHairType(String hairType) {
        this.hairType = hairType;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public ArrayList<UUID> getListOfBanks() {
        return listOfBanks;
    }

    public void addToListOfBanks(UUID ba) {
        this.listOfBanks.add(ba);
    }
}
