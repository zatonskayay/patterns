package fourth;

public class ElfIsSoldier implements Soldier {
    private int index;

    public ElfIsSoldier(int index) {
        this.index = index;
    }

    @Override
    public void ready() {
        System.out.println("Эльф " + this.index + " получает звание: солдат");
    }
}