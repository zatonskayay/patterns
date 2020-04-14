package fourth;

import java.util.ArrayList;

public class Orcs implements Army {

    Commander commander;
    ArrayList<General> generals = new ArrayList<>();
    ArrayList<Soldier> soldiers = new ArrayList<>();

    public Orcs(String commander, int generalsNum, int soldiersNum) {
        this.commander = this.beCommander(commander);

        for (int i = 0; i < generalsNum; i++) {
            generals.add(beGeneral(i + 1));
        }

        for (int j = generalsNum; j < (generalsNum + soldiersNum); j++) {
            soldiers.add(beSoldier( j + 1));
        }
    }

    @Override
    public Commander beCommander(String name) {
        return new OrcIsCommander(name);
    }

    @Override
    public General beGeneral(int index) {
        return new OrcIsGeneral(index);
    }

    @Override
    public Soldier beSoldier(int index) {
        return new OrcIsSoldier(index);
    }

    @Override
    public void ready() {
        this.commander.ready();

        for (General general : generals) {
            general.ready();
        }

        for (Soldier soldier : soldiers) {
            soldier.ready();
        }
    }
}
