
public class Main {
    public static void main(String[] args) {
        RockSong a = new RockSong("debil", "hueta", 2.0, "pop", "niggas",
                "non", "HARD ROCK", true, 10);
        a.play();
        a.printRockSongData();
        a.isHeavy();
        a.guitarSoloPlay();
        a.updateHeavyMeter(7);
        a.updateSubGenre("ZALUPA");
        a.isHeavy();
        a.printRockSongData();
        a.skip();
    }
}