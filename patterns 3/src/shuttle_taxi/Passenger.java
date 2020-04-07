package shuttle_taxi;

public class Passenger {
    private String name;
    private BusStop target;

    public Passenger(BusStop target, String name) {
        this.target = target;
        this.name = name;
    }

    public BusStop getTarget() {
        return target;
    }

    public String toString(){
        return name;
    }

    public void leaveTaxi(){
        System.out.println(this + " приехала на " + this.getTarget().toString());
    }
}
