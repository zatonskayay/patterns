package shuttle_taxi;

public class City {
    public int count;

    public City(){
        count = 0;
    }

    public void add() {
        ++count;
    }

    public void subtract(){
        --count;
    }

    public boolean doesntSleep(){
        return count > 0;
    }
}
