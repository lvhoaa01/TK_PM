package adapter;

public class MediaAdapter implements MediaPlayer{
    private mp4Player mp4player;
    private VlcPlayer vlcplayer;

    public MediaAdapter(String audiotype){
        if(audiotype.equalsIgnoreCase("vlc")){
            vlcplayer = new VlcPlayer();
        }else if(audiotype.equalsIgnoreCase("mp4")) {
            mp4player = new mp4Player();
        }
    }

    @Override
    public void play(String audiotype, String filename) {
        if(audiotype.equalsIgnoreCase("vlc") && vlcplayer != null){
            vlcplayer.playVlc(filename);
        }else if(audiotype.equalsIgnoreCase("mp4") && mp4player != null){
            mp4player.playMp4(filename);
        }
    }
}
