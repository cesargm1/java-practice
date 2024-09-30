/*
 * public class TapeDeck {
 * public boolean cantRecord; // duda
 * boolean canRecord = false;
 * 
 * void playTape() {
 * System.out.println("tape playing");
 * }
 * 
 * void recordTape() {
 * System.out.println("tape recording");
 * }
 * 
 * public static void main(String[] args) {
 * 
 * TapeDeck t = new TapeDeck();
 * 
 * t.cantRecord = true;
 * t.playTape();
 * 
 * if (t.cantRecord == true) {
 * t.recordTape();
 * }
 * }
 * 
 * }
 * 
 */

// public class DVDPlayer {
// public boolean cantRecord; // duda
// boolean canRecord = false;

// void recordDVD() {
// System.out.println("DVD recording");
// }

// void recordTape() {
// System.out.println("tape recording");
// }
// Class DVDPlayerTestDrive {}

// public static void main(String[] args) {

// TapeDeck t = new TapeDeck();

// t.cantRecord = true;
// t.playTape();

// if (t.cantRecord == true) {
// t.recordTape();
// }
// }
// }

/**
 * TapeDeck
 */

class DVDPlayer {

    boolean canRecord = false;
    boolean playDVD = true;

    void recordDVD() {
        System.out.println("DVD recordimg");
    }

    void playDVD() {
        System.out.println("DVD playing");
    } // FALTA el metodo playDVD
}

class DVDPlayerTestDrive {
    public static void main(String[] args) {

        DVDPlayer d = new DVDPlayer();
        d.canRecord = true;

        d.playDVD();

        if (d.canRecord == true) {
            d.recordDVD();
        }
        {

        }
    }
}