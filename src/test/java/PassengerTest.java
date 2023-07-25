import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class PassengerTest {

    Passenger passenger;

    @BeforeEach
    public void setUp(){
        passenger = new Passenger ("Jannah", 0756563421, 123);
    }

    @Test
    public void canGetName(){
        assertThat(passenger.getName()).isEqualTo("Jannah");
    }


    @Test
    public void canGetPhoneNumber(){
        assertThat(passenger.getPhoneNumber()).isEqualTo(0756563421);
    }

    @Test
    public void canGetUniqueID(){
        assertThat(passenger.getUniqueID()).isEqualTo(123);
    }
}
