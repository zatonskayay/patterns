package shuttle_taxi;

public class BusDemo {
    public static void main(String[] args){
        City city = new City();
        Taxi taxi = new Taxi(13, city);

        BusStop fameMonument = new BusStop("Памятник Славы", city);
        BusStop clinic = new BusStop("Клиническая", city);
        BusStop busStation= new BusStop("Автовокзал", city);
        BusStop workAvenue = new BusStop("Рабочий проспект", city);

        taxi.createRoute(fameMonument);
        taxi.createRoute(clinic);
        taxi.createRoute(busStation);
        taxi.createRoute(workAvenue);

        fameMonument.addPassenger(new Passenger(workAvenue, "Полина"));
        clinic.addPassenger(new Passenger(workAvenue, "Юлия"));
        clinic.addPassenger(new Passenger(fameMonument, "Алина"));
        workAvenue.addPassenger(new Passenger(clinic, "Арина"));

        while (city.doesntSleep()) {
            taxi.go();
        }
    }
}
