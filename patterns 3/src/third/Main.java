package third;

public class Main {
    public static void main(String[] args){

        MusicCenter sonyCenter = new MusicCenter();
        Command on = new CenterOn(sonyCenter);
        Command off = new CenterOff(sonyCenter);
        Command louder = new LouderCommand(sonyCenter);
        Command quieter = new QuieterCommand(sonyCenter);
        Command playTrack = new PlayCommand(sonyCenter);
        Command nextTrack = new NextTrackCommand(sonyCenter);

        Music music = new Music();
        music.register("on", on);
        music.register("playTrack", playTrack);
        music.register("louder", louder);
        music.register("nextTrack", nextTrack);
        music.register("quieter", quieter);
        music.register("off", off);

        music.execute("on");

        music.execute("playTrack");
        music.redo();

        music.execute("louder");
        music.redo();
        music.redo();
        music.undo();
        music.undo();

        music.execute("nextTrack");
        music.undo();

        music.execute("quieter");

        music.execute("off");
    }
}
