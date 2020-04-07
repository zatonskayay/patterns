package second;

public class SecondCannibal extends CannibalGame {
    Week day;

    public SecondCannibal(Week day){
        this.day = day;
    }
    @Override
    protected void cook() {
        if (this.day != Week.holiday) System.out.println("Пожарить");
        else System.out.println("Сварить");
    }

    public void chat(){
        System.out.println("Рассказать историю");
    }
}
