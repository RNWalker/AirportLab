import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FlightTest {

    Flight flight;
    Passenger passenger;

    @BeforeEach
    public void setUp(){
        flight = new Flight("Bali", "KA29");
        passenger = new Passenger ("Jannah", 0756563421, 123);
        Passenger passenger2 = new Passenger ("Rebecca", 5, 456);
        flight.bookPassengerOntoFlight(passenger);
        flight.bookPassengerOntoFlight(passenger2);
    }

    @Test
    public void canGetDestination(){
        assertThat(flight.getDestination()).isEqualTo("Bali");
    }

    @Test
    public void canGetFlightID(){
        assertThat(flight.getFlightID()).isEqualTo("KA29");
    }
    @Test
    public void canGetPassengers(){
        assertThat(flight.getPassengers().size()).isEqualTo(flight.countPassengers());
    }

    @Test
    public void canCountPassengers(){
        assertThat(flight.countPassengers()).isEqualTo(2);
    }

    @Test
    public void canBookPassengerOntoFlight(){
        Passenger passenger3 = new Passenger ("Colin",10, 789);
        flight.bookPassengerOntoFlight(passenger3);
        assertThat(flight.countPassengers()).isEqualTo(3);
    }
}
