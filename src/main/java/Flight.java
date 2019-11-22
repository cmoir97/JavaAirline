import java.util.ArrayList;
import java.util.Date;

public class Flight {

    private ArrayList<Passenger> passengers;
    private PlaneType plane;
    private int flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;
    private ArrayList<Integer> allocatedSeatNumbers;

    public Flight(PlaneType plane, int flightNumber, String destination,
                  String departureAirport, String departureTime){
        this.passengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        this.allocatedSeatNumbers = new ArrayList<Integer>();
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

    public int getMaxWeight(){
        return this.plane.getMaxWeight();
    }
    public int totalNumberOfBags(){
        int totalBags = 0;
        for (Passenger passenger : this.passengers){
            totalBags += passenger.getNumberOfBags();
        }
        return totalBags;
     }

     public ArrayList<Integer> getAllocatedSeatNumbers(){
        return this.allocatedSeatNumbers;
     }

    public void OnlyAssignUniqueSeats(Passenger passenger, int seatNumber){
            if (!this.allocatedSeatNumbers.contains(seatNumber)){
                this.allocatedSeatNumbers.add(seatNumber);
            }
        }

    public int AllocatedSeatNumbersLength() {
        return this.allocatedSeatNumbers.size();
    }
}
