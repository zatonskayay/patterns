package fourth;

import java.util.LinkedList;
import java.util.List;

public class Orcs implements Army {

    List<Object> orcs;
    public Orcs() {
        orcs = new LinkedList<>();
    }
    public void put(Object obj) {
        orcs.add(obj);
    }
    public List<Object> loading() {
        return orcs;
    }

    @Override
    public Commander beCommander() {
        return new OrcIsCommander();
    }

    @Override
    public General beGeneral() {
        return new OrcIsGeneral();
    }

    @Override
    public Soldier beSoldier() {
        return new OrcIsSoldier();
    }

}
