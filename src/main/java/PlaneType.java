public enum PlaneType {
    LOCKHEEDL12A(10, 100);

    private final int capacity;
    private final int maxWeight;

    PlaneType(int capacity, int maxWeight) {
        this.capacity = capacity;
        this.maxWeight = maxWeight;
    }
    public int getCapacity(){
        return capacity;
    }

    public int getMaxWeight(){
        return maxWeight;
    }
}

