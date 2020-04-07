package third;

public class NextTrackCommand implements Command {
    private final MusicCenter music;

    public NextTrackCommand(MusicCenter music) {
        this.music = music;
    }

    @Override
    public void execute() {
        music.nextTrack();
    }

    @Override
    public void undo() {
        int trackNumber = music.getTrack();
        if (trackNumber > 1) {
            music.setTrack(--trackNumber);
        }
        System.out.println("Отмена смены трека. Играет трек: " + trackNumber);
    }
}

