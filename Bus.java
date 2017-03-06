public class Bus{
  
  private Person[] passengers;

  public Bus(){
    this.passengers = new Person[10];
  }

  public int passengerCount(){
    
    int count = 0;

    for (Person person : passengers){
      if (person != null){
        count++;
      }
    }
    return count;
  }

  public void pickUpPassenger(Person person){
    if ( isFull() ){
      return;
    }
    int index = passengerCount();
    passengers[index] = person;
  }

  public boolean isFull(){
    return passengerCount() == passengers.length;
  }

  public void dropOffPassengers(){
    for (int i = 0; i < passengers.length; i++){
      passengers[i] = null;
    }
  }

  public void dropOffPassenger(){
    int occupiedIndex = passengerCount() - 1;
    passengers[occupiedIndex] = null;
  }

}