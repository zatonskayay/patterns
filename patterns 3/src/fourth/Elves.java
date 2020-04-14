package fourth;

import java.util.ArrayList;

public class Elves implements Army {

    Commander commander;
    ArrayList<General> generals = new ArrayList<>();
    ArrayList<Soldier> soldiers = new ArrayList<>();

    public Elves(String commander, int generalsNum, int soldiersNum) {
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
        return new ElfIsCommander(name);
    }

    @Override
    public General beGeneral(int index) {
        return new ElfIsGeneral(index);
    }

    @Override
    public Soldier beSoldier(int index) {
        return new ElfIsSoldier(index);
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

