package second;

public class Main {
    public static void main(String[] args){
        CannibalGame first = new FirstCannibal();
        first.go();

        CannibalGame second = new SecondCannibal(Week.holiday);
        second.go();
    }
}
