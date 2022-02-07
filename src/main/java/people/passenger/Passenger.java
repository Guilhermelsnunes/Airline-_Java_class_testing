package people.passenger;

public class Passenger {

    private int numberOfBags;
    private String name;


    public Passenger(int numberOfBags, String name) {
        this.numberOfBags = numberOfBags;
        this.name = name;
    }

    public int getNumberOfBags() {
        return numberOfBags;
    }

    public void setNumberOfBags(int numberOfBags) {
        this.numberOfBags = numberOfBags;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
