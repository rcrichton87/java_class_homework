import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BusTest{

Bus bus;

@Before
public void before(){
  bus = new Bus();
}

@Test
public void passengersStartsEmpty(){
  assertEquals(0, bus.passengerCount() );
}

}