import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AirportTest {

Airport airport;
Flight flight1;
Flight flight2;

@BeforeEach
public void setUp(){
    airport = new Airport("Heathrow");
    flight1 = new Flight("Bali", "KA29");
    flight2 = new Flight("Darkest Peru", "PAD70");
    airport.addFlight(flight1);
    airport.addFlight(flight2);
}

@Test
public String canGetName(){

    return airport.getName();
}

@Test
public ArrayList<Flight> canGetFlights(){

    return airport.getFlights();
}

@Test
public void canCancelFlight(){
    airport.cancelFlight(flight1);
    assertThat(airport.countFlights()).isEqualTo(1);
}

@Test
public void canAddFlight(){
    Flight flight = new Flight("Spain", "1234");
    airport.addFlight(flight);
    assertThat(airport.countFlights()).isEqualTo(3);
}

@Test
    public void canDisplayAllFlights(){
    airport.displayAllFlights();
}

}
