package third;

public class CenterOff implements Command {
    private final MusicCenter music;

    public CenterOff(MusicCenter music){
        this.music = music;
    }

    @Override
    public void execute() {
        music.off();
    }

    @Override
    public void undo() {
        music.on();
    }
}

