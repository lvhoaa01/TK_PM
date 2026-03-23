package adapter;

public class Main {
    public static void main(String[] args) {
        AudioPlayer player = new AudioPlayer();

        player.play("mp4", "music.mp4");
        player.play("mp3", "mtp.mp3");
        player.play("vlc", "ghe.vlc");
        player.play("mov", "music.mov");
    }
}
