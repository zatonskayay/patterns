package fourth;

public class OrcIsSoldier implements Soldier {

    private int index;

    public OrcIsSoldier(int index) {
        this.index = index;
    }

    @Override
    public void ready() {
        System.out.println("Орк " + this.index + " получает звание: солдат");
    }
}