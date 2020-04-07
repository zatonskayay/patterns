package shuttle_taxi;

import java.util.LinkedList;
import java.util.List;

public class BusStop {

    private String name;
    private List<Passenger> queue;
    private List<Passenger> reverseQueue;
    private City city;

    public BusStop(String name, City city){
        queue = new LinkedList<>();
        this.name = name;
        this.city = city;
        reverseQueue = new LinkedList<>();
    }

    public boolean hasPassengers(){
        return !queue.isEmpty();
    }

    public void addPassenger(Passenger passenger){
        queue.add(passenger);
        city.add();
    }

    public Passenger getPassenger(){
        return queue.get(0);
    }

    public void isLeftBy(Passenger passenger){
        System.out.println(queue.get(0) + " уехала с остановки " + this.toString());
        queue.remove(passenger);
    }

    public void toReverseQueue(Passenger passenger){
        queue.remove(passenger);
        reverseQueue.add(passenger);
    }

    public void swapQueues(){
        if (reverseQueue.size() > 0) {
            queue = new LinkedList<>(reverseQueue);
            reverseQueue.clear();
        }
    }

    public String toString(){
        return name;
    }
}
