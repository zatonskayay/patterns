package fourth;

public class Main {

    private static void game(Army elves, Army orcs) {
        elves.ready();
        orcs.ready();
    }

    public static void main(String[] args) {

        Elves elves = new Elves("Визи", 5, 10);
        Orcs orcs = new Orcs("Данглар", 3, 12);

        game(elves, orcs);
    }
}