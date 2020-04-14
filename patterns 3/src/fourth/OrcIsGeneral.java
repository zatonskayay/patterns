package fourth;

public class OrcIsGeneral implements General {

    int index;

    public OrcIsGeneral(int index) {
        this.index = index;
    }

    @Override
    public void ready() {
        System.out.println("Орк " + this.index + " получает звание: генерал");
    }
}