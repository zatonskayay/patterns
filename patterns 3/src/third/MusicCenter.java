package third;

public class MusicCenter {

    public void on(){
        System.out.println("Музыкальный центр ВКЛ");
    }
    public void off(){
        System.out.println("Музыкальный центр ВЫКЛ");
    }

    private int musicVolume;
    private int trackNumber;

    public MusicCenter(){
        musicVolume = 50;
        trackNumber = 1;
    }

    public void setVolume(int musicVolume) {
        this.musicVolume = musicVolume;
    }
    public void setTrack(int trackNumber) {
        this.trackNumber = trackNumber;
    }
    public int getVolume() {
        return musicVolume;
    }
    public int getTrack() {
        return trackNumber;
    }

    public void louder(){
        if (musicVolume < 100) {
            musicVolume++;
        }
        System.out.println("Прибавить громкость: " + musicVolume);
    }

    public void quieter(){
        if (musicVolume > 0) {
            musicVolume--;
        }
        System.out.println("Убавить громкость: " + musicVolume);
    }

    public void playTrack(){
        System.out.println("Играет трек: " + trackNumber);;
    }

    public void nextTrack(){
        trackNumber++;
        System.out.println("Играет трек: " + trackNumber);
    }

}