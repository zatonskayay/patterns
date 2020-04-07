package third;

public class QuieterCommand implements Command {
    private final MusicCenter music;

    public QuieterCommand(MusicCenter music){
        this.music = music;
    }

    @Override
    public void execute() {
        music.quieter();
    }

    @Override
    public void undo() {
        int musicVolume = music.getVolume();
        if (musicVolume < 100) {
            music.setVolume(++musicVolume);
        }
        System.out.println("Отмена убавления громкости. Громкость: " + musicVolume);
    }
}

