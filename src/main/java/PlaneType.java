public enum PlaneType {
    BOEING757(10, 100);

    private final int capacity;
    private final int maxWeight;

    PlaneType(int capacity, int maxWeight) {
        this.capacity = capacity;
        this.maxWeight = maxWeight;
    }
}

