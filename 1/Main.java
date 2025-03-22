
public class Main {
    public static void main(String[] args) {

        RockSong newSong = new RockSong("Black Dog", "Led Zeppelin", 5.0, "Rock", "Led Zeppelin IV",
                "none", "Hard Rock", true, 7);

        newSong.printRockSongData();
        newSong.isHeavy();

        newSong.play();
        newSong.guitarSoloPlay();

        newSong.updateHeavyMeter(9);
        newSong.updateSubGenre("Progressive Rock");
        newSong.isHeavy();

        newSong.printRockSongData();

        newSong.skip();

        System.out.println();
        System.out.println();

        Song newSongTwo = new Song("Starlight", "Superman Lovers", 3.0, "Pop", "Starlight", "none");
        newSongTwo.printSongData();

        newSongTwo.hasFeat();
        newSongTwo.updateGenre("EDM");
    }
}