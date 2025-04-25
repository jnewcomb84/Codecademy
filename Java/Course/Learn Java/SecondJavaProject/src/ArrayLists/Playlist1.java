package ArrayLists;

/*
    PRINT ARRAY AND ARRAYLIST TO CONSOLE
*/

import java.util.ArrayList;

public class Playlist1 {
    public static void main(String[] args) {
        String[] favoriteSongs = {
                "Bayside - Blame it on Bad Luck",
                "Silverstein - Ides of March",
                "Metallica - No Leaf Clover",
                "We Came as Romans - Blur",
                "Bring Me the Horizon - Kingslayer",
                "Baby Metal - Ratatata",
                "Silverstein - Confession",
                "Alkaline Trio - Help Me",
                "Unwritten Law - Rest of My Life",
                "Amalee - Again"
        };
        ArrayList<String> desertIslandPlaylist = new ArrayList<>();

        System.out.println(favoriteSongs[0]);
        System.out.println(favoriteSongs[1]);
        System.out.println(favoriteSongs[2]);

        desertIslandPlaylist.add("2Pac - Changes");
        desertIslandPlaylist.add("Rise Against - Methadone");
        desertIslandPlaylist.add("The Smashing Pumpkins - Disarm");
        desertIslandPlaylist.add("Linkin Park - Leave out all the Rest");
        desertIslandPlaylist.add("Dr. Dre - Fuck Wit Dre Day");

        System.out.println(desertIslandPlaylist);
    }
}
