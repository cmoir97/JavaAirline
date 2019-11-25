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

    public int bookedBaggageWeight() {
        return (this.flight.passengerCount() * this.flight.totalNumberOfBags()) * 5;
    }

    public int remainingBaggageWeight(){
        return this.flight.getMaxWeight() - bookedBaggageWeight();
    }

    public void bookPassengerOnFlight(Passenger newPassenger, Flight flight, int newSeatNumber){
        flight.addPassenger(passenger);
        passenger.assignFlight(flight);
        passenger.assignSeatNumber(newSeatNumber);
        flight.bookSeat(passenger, newSeatNumber);
    }
}
