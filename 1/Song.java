public class Song extends MusicTrack {

    private String genre;
    private String album;
    private String feat;

    public Song(String title, String artist, double duration, String genre, String album, String feat) {
        super(title, artist, duration);
        this.genre = genre;
        this.album = album;
        this.feat = feat;
    }

    public void printSongData() {
        System.out.println("Song name: " + getTitle() + ", From album: " + album
                + ", Genre: " + genre + (!feat.equals("none") ? ", Feat. " + feat : ""));
    }

    public void updateGenre(String newGenre) {
        this.genre = newGenre;
        System.out.println("Genre has been updated! New genre: " + genre);
    }

    public void hasFeat() {
        if (!feat.equals("none")) {
            System.out.println("Feat. " + feat);
        } else System.out.println("No Feats!");
    }

    public String getAlbum() {
        return this.album;
    }

    public String getGenre() {
        return this.genre;
    }

    public String getFeat() {
        return this.feat;
    }
}
