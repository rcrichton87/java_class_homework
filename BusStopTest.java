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

  @Test
  public void canJoinQueue(){
    busStop.joinQueue(person);
    assertEquals(1, busStop.queueCount() );
  }

  @Test
  public void isQueueFull(){
    for (int i = 0; i < 15; i++){
      busStop.joinQueue(person);
    }
    assertEquals(true, busStop.isFull() );
  }

  @Test
  public void cannotJoinWhenQueueFull(){
    for (int i = 0; i < 20; i++){
      busStop.joinQueue(person);
    }
    assertEquals(15, busStop.queueCount() );
  }

  @Test
  public void goFromQueueToBus(){
    for (int i = 0; i < 5; i++){
      busStop.joinQueue(person);
    }
    busStop.getOnBus(bus);
    assertEquals(0, busStop.queueCount() );
    assertEquals(5, bus.passengerCount() );
  }

  @Test
  public void goFromQueueToBusQueueLargerThanPassengers(){
    for (int i = 0; i < 20; i++){
      busStop.joinQueue(person);
    }
    busStop.getOnBus(bus);
    assertEquals(5, busStop.queueCount() );
    assertEquals(10, bus.passengerCount() );
  }

}