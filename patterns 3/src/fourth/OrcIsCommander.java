package fourth;

public class OrcIsCommander implements Commander {
    String name;

    public OrcIsCommander(String name) {
        this.name = name;
    }

    @Override
    public void ready() {
        System.out.println("Орк " + this.name + " получает звание: командир");
    }
}
