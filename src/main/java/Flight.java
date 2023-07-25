import java.util.ArrayList;

public class Flight {
    private String destination;
    private String flightID;
    private ArrayList<Passenger> passengers;

    public Flight(String destination, String flightID) {
        this.destination = destination;
        this.flightID = flightID;
        this.passengers = new ArrayList<>();
    }

    public String getDestination(){
        return this.destination;
    }

    public String getFlightID(){
        return this.flightID;
    }
    public ArrayList<Passenger> getPassengers(){
        return this.passengers;
    }
    public void bookPassengerOntoFlight(Passenger newPassenger){
        this.passengers.add(newPassenger);
    }
    public int countPassengers(){
        return this.passengers.size();
    }
}
