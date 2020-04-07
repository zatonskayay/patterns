package third;

public class LouderCommand implements Command {
    private final MusicCenter music;

    public LouderCommand(MusicCenter music){
        this.music = music;
    }

    @Override
    public void execute() {
        music.louder();
    }

    @Override
    public void undo() {
        int musicVolume = music.getVolume();
        if (musicVolume > 0) {
            music.setVolume(--musicVolume);
        }
        System.out.println("Отмена прибавления громкости. Громкость: " + musicVolume);
    }
}
