package fourth;

import java.util.LinkedList;
import java.util.List;

public class Elves implements Army {

    List<Object> elves;
    public Elves() {
        elves = new LinkedList<>();
    }
    public void put(Object obj) {
        elves.add(obj);
    }
    public List<Object> loading() {
        return elves;
    }

    @Override
    public Commander beCommander() {
        return new ElfIsCommander();
    }

    @Override
    public General beGeneral() {
        return new ElfIsGeneral();
    }

    @Override
    public Soldier beSoldier() {
        return new ElfIsSoldier();
    }

}
