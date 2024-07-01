package finalexam.task3;

public class FactoryTester {

    public static void main(String[] args) {
        PaperFactory factory = new PaperFactory();

        Person person1 = new Person("Dato", "Davitashvili", "1234567890");
        Person person2 = new Person("Mari", "kurua", "0987654321");

        factory.addPerson(person1);
        factory.addPerson(person2);

        System.out.println("Added persons: " + factory.getStaff().size()); // Output: 2

        factory.saveStaffToFile("staff.txt");

        factory.deletePerson(person1);

        System.out.println("Persons after deletion: " + factory.getStaff().size()); // Output: 1

        factory.loadStaffFromFile("staff.txt");

        System.out.println("Persons after loading from file: " + factory.getStaff().size()); // Output: 2
    }
}
