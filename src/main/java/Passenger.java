public class Passenger {

    private String name;
    private int numberOfBags;
    private Flight flight;
    private int seatNumber;

    public Passenger(String name, int numberOfBags, Flight flight, int seatNumber){
        this.name = name;
        this.numberOfBags = numberOfBags;
        this.flight = null;
        this.seatNumber = 0;
    }

    public String getName(){
        return this.name;
    }

    public int getNumberOfBags() {
        return this.numberOfBags;
    }
    public void assignFlight(Flight flight2){
        this.flight = flight2;
    }

    public Flight getFlight() {
        return this.flight;
    }

    public int getSeatNumber(){
        return this.seatNumber;
    }
}
