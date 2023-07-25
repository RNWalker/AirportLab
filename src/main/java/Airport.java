import java.util.ArrayList;

public class Airport {

    private ArrayList<Flight> flights;
    private String name;

    public Airport(String name){
        this.name = name;
        this.flights = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Flight> getFlights() {
        return this.flights;
    }

    public void cancelFlight(Flight cancelledFlight){
        this.flights.remove(cancelledFlight);
    }

    public void addFlight(Flight addedFlight){
        this.flights.add(addedFlight);
    }

    public ArrayList<Flight> displayAllFlights(){
        for (Flight flight: flights){
            System.out.println(flight);
        }
        return this.flights;
    }

    public int countFlights(){
        return this.flights.size();
    }
}
