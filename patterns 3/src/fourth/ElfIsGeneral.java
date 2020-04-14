package fourth;

public class ElfIsGeneral implements General {
    int index;

    public ElfIsGeneral(int index) {
        this.index = index;
    }

    @Override
    public void ready() {
        System.out.println("Эльф " + this.index + " получает звание: командир");
    }
}
