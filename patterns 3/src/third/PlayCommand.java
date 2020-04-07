package third;

public class PlayCommand implements Command {
    private final MusicCenter music;

    public PlayCommand(MusicCenter music){
        this.music = music;
    }

    @Override
    public void execute() {
        music.playTrack();
    }

    @Override
    public void undo() {
        System.out.println("Трек на паузе");
    }
}
