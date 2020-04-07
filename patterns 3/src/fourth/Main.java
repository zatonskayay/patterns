package fourth;

public class Main {
    public static void main(String[] args){
        Army elvArmy = new Elves();
        elvArmy.put(elvArmy.beCommander());
        for (int i = 0; i < 3; ++i)
            elvArmy.put(elvArmy.beGeneral());
        for (int i = 0; i < 10; ++i){
            elvArmy.put(elvArmy.beSoldier());
        }

        Army orcArmy = new Orcs();
        orcArmy.put(orcArmy.beCommander());
        orcArmy.put(orcArmy.beGeneral());
        for (int i = 0; i < 10; ++i){
            orcArmy.put(orcArmy.beSoldier());
        }

        System.out.println("Создана армия Эльфов.");
        System.out.println( ((Elves) elvArmy).loading());

        System.out.println("Создана армия Орков.");
        System.out.println(((Orcs)orcArmy).loading());
    }
}
