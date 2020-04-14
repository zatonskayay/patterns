package fourth;

public class ElfIsCommander implements Commander {
    String name;

    public ElfIsCommander(String name) {
        this.name = name;
    }

    @Override
    public void ready() {
        System.out.println("Эльф " + this.name + " получает звание: командир");
    }

}
