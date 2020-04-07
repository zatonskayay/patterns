package third;

public class CenterOn implements Command {
    private final MusicCenter music;

    public CenterOn(MusicCenter music){
        this.music = music;
    }

    @Override
    public void execute() {
        music.on();
    }

    @Override
    public void undo() {
        music.off();
    }
}

