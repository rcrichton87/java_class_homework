import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BusStopTest{

  Bus bus;
  Person person;
  BusStop busStop;

  @Before
  public void before(){
    bus = new Bus();
    person = new Person();
    busStop = new BusStop();
  }

  @Test
  public void queueStartsEmpty(){
    assertEquals(0, busStop.queueCount() );
  }

}