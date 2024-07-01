package finalexam.task4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class University implements LegalEntity {
    private String address;
    private String vatNumber;
    private List<Professor> professors = new ArrayList<>();

    public University(String address, String vatNumber) {
        this.address = address;
        this.vatNumber = vatNumber;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public String getVatNumber() {
        return vatNumber;
    }

    public void addProfessor(Professor p) {
        professors.add(p);
    }

    public boolean deleteProfessor(Professor p) {
        return professors.remove(p);
    }

    public List<Professor> getProfessors() {
        return new ArrayList<>(professors); // Return a copy to prevent modification
    }

    public void saveProfessorsToFile(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Professor professor : professors) {
                writer.write(professor.getName() + "," + professor.getDepartment() + "," + professor.getEmployeeNumber());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadProfessorsFromFile(String filename) {
        professors.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    String name = parts[0];
                    String department = parts[1];
                    String employeeNumber = parts[2];
                    professors.add(new Professor(name, department, employeeNumber));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
