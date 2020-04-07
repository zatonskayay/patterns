package shuttle_taxi;

import java.util.LinkedList;
import java.util.List;

public class Taxi {
    private int capacity;
    private List<Passenger> passengers;
    private List<BusStop> route;
    private List<BusStop> reverse_route;
    private City city;

    public Taxi(int capacity, City city){
        this.capacity = capacity;
        passengers = new LinkedList<>();
        route = new LinkedList<>();
        reverse_route = new LinkedList<>();
        this.city = city;
    }

    private void getOff(BusStop stop){
        Passenger passenger;
        route.remove(stop);
        ((LinkedList<BusStop>)(reverse_route)).addFirst(stop);
        for (int i = passengers.size() - 1; i >= 0; --i) {
            passenger = passengers.get(i);
            if (passenger.getTarget() == stop) {
                passenger.leaveTaxi();
                passengers.remove(i);
                city.subtract();
            }
        }
    }

    private boolean isFree(){
        return passengers.size() < capacity;
    }

    private boolean directionIsOk(BusStop station){
        return route.contains(station);
    }

    private void getOn(BusStop stop){
        Passenger passenger;
        while (stop.hasPassengers() && this.isFree()) {
            passenger = stop.getPassenger();
            if (directionIsOk(passenger.getTarget())){
                stop.isLeftBy(passenger);
                passengers.add(passenger);
            } else {
                stop.toReverseQueue(passenger);
            }
        }
        stop.swapQueues();
    }

    public void createRoute(BusStop busStop){
        route.add(busStop);
    }

    public void go(){
        BusStop currentStop;
        while (!route.isEmpty()){
            currentStop = route.get(0);
            getOff(currentStop);
            getOn(currentStop);
        }
        route = new LinkedList<>(reverse_route);
        reverse_route.clear();
    }
}
