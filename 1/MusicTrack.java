public class MusicTrack {

    private String title;
    private String artist;
    private double duration;

    public MusicTrack(String title, String artist, double duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    public void printTrackData() {
        System.out.println("Title: " + title + ", Artist: " + artist + ", Duration: " + duration);
    }

    public void play() {
        System.out.println("Now playing: " + title);
    }

    public void stop() {
        System.out.println("Stopped: " + title);
    }

    public void pause() {
        System.out.println("Paused: " + title);
    }

    public void skip() {
        System.out.println("Skipped: " + title);
    }

    public String getTitle() {
        return this.title;
    }
}

