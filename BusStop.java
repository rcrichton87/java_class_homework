public class BusStop{

  private Person[] queue;

  public BusStop(){
    this.queue = new Person[15];
  }

  public int queueCount(){
    int count = 0;
    for (Person person : queue){
      if (person != null) {
        count++;
      }
    }
    return count;
  }

  public void joinQueue(Person person){
    int index = queueCount();
    queue[index] = person;
  }

}