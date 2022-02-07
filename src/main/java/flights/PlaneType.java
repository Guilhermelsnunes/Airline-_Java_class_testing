//ENUM
package flights;

public enum PlaneType {

    BOEING747(50, 100000);

    private final int capacity;
    private final int total_weight;

    PlaneType(int capacity, int total_weight) {
        this.capacity = capacity;
        this.total_weight = total_weight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getTotal_weight() {
        return total_weight;
    }
}