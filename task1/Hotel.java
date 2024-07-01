package finalexam.task1;

public class Hotel {
    private String name;
    private String location;
    private int numberOfRooms;
    private double rating;

    public Hotel(String name, String location, int numberOfRooms, double rating) {
        this.name = name;
        this.location = location;
        this.numberOfRooms = numberOfRooms;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Hotel [name=" + name + ", location=" + location + ", numberOfRooms=" + numberOfRooms + ", rating=" + rating + "]";
    }
}
