package fourth;

public interface Army {
    void ready();

    Commander beCommander(String name);
    General beGeneral(int index);
    Soldier beSoldier(int index);

}