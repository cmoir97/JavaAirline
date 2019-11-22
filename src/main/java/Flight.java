import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> passengers;
    private PlaneType plane;
    private int flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(PlaneType plane, int flightNumber, String destination,
                 String departureAirport, String departureTime){
        this.passengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public int passengerCount() {
        return this.passengers.size();
    }

    public PlaneType getPlaneType() {
        return this.plane;
    }

    public int getFlightNumber() {
        return this.flightNumber;
    }

    public String getDestination() {
        return this.destination;
    }

    public String getDepartureAirport() {
        return this.departureAirport;
    }

    public String getDepartureTime() {
        return this.departureTime;
    }

    public int numberOfAvailableSeats(){
        int capacity = this.plane.getCapacity();
        int passengers = this.passengers.size();
        return capacity - passengers;
    }

    public void addPassenger(Passenger passenger) {
        if (numberOfAvailableSeats() > 0) {
            this.passengers.add(passenger);
        }
    }
}
