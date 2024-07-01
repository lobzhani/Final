package finalexam.task3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PaperFactory {
    private List<Person> staff = new ArrayList<>();

    public void addPerson(Person p) {
        staff.add(p);
    }

    public boolean deletePerson(Person p) {
        return staff.remove(p);
    }

    public List<Person> getStaff() {
        return new ArrayList<>(staff); // Return a copy to prevent modification
    }

    public void saveStaffToFile(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Person person : staff) {
                writer.write(person.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadStaffFromFile(String filename) {
        staff.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(", ");
                if (parts.length == 3) {
                    String name = parts[0].split("=")[1];
                    String surname = parts[1].split("=")[1];
                    String personalNumber = parts[2].split("=")[1].replace("]", "");
                    staff.add(new Person(name, surname, personalNumber));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
