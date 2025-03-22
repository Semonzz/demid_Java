public class RockSong extends Song {

    private String subGenre;
    private boolean guitarSolo;
    private int heavyMeter;

    public RockSong(String title, String artist, double duration, String genre, String album, String feat,
                    String subGenre, boolean guitarSolo, int heavyMeter) {
        super(title, artist, duration, genre, album, feat);
        this.subGenre = subGenre;
        this.guitarSolo = guitarSolo;
        this.heavyMeter = heavyMeter;
    }

    public void printRockSongData() {
        System.out.println("Song name: " + getTitle() + ", From album: " + getAlbum()
                + ", Genre: " + getGenre() + (!getFeat().equals("none") ? ", Feat. " + getFeat() : ""));
        System.out.println("Rock subgenre: " + subGenre + ", HEAVYMETER: " + heavyMeter);
        if (guitarSolo) System.out.println("Guitar solo: YEAH!");
        else System.out.println("Guitar solo: NO!");
    }

    public void guitarSoloPlay() {
        if (guitarSolo) {
            System.out.println("PLAYING GUITAR SOLO WITH " + heavyMeter + " DISTORTION LEVEL");
        } else {
            System.out.println("No guitar solo in that song =(");
        }
    }

    public void isHeavy() {
        if (heavyMeter >= 8) System.out.println("VERY HEAVY");
        else System.out.println("Not heavy");
    }

    public void updateSubGenre(String newSubGenre) {
        this.subGenre = newSubGenre;
        System.out.println("Subgenre has been updated! New subgenre: " + subGenre);
    }

    public void updateHeavyMeter(int heavyMeter) {
        if (heavyMeter >= 1 && heavyMeter <= 10) {
            this.heavyMeter = heavyMeter;
            System.out.println("Heavy meter has been updated! New value: " + heavyMeter);
        } else {
            System.out.println("Value must be more than 0 and less then 10!");
        }
    }
}
