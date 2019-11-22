public class FlightManager {

    Flight flight;
    Passenger passenger;

    public FlightManager(Flight flight, Passenger passenger){
        this.flight = flight;
        this.passenger = passenger;
    }

    public int baggageWeightPerPassenger(){
        return this.flight.getMaxWeight() / this.flight.passengerCount();
    }
}
