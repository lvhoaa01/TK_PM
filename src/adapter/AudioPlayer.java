package adapter;

public class AudioPlayer implements MediaPlayer{
    private MediaAdapter mediaAdapter;

    @Override
    public void play(String audiotype, String filename) {
        if(audiotype.equalsIgnoreCase("mp3")){
            System.out.println("Đang phát file Mp3 : " + filename);
        } else if (audiotype.equalsIgnoreCase("vlc") || audiotype.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter(audiotype);
            mediaAdapter.play(audiotype, filename);
        }else {
            System.out.println("Định dạng không hỗ trợ : " + audiotype);
        }
    }
}
