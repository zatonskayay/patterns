package second;

public abstract class CannibalGame {

    final void go(){
        find();
        chat();
        cook();
        eat();
        sleep();
    }

    protected void find(){
        System.out.println("Найти");
    }

    protected void eat(){
        System.out.println("Съесть");
    }

    protected void sleep(){

        System.out.println("Спать");
        System.out.println(" ");
    }

    protected void chat(){}

    protected abstract void cook();
}
