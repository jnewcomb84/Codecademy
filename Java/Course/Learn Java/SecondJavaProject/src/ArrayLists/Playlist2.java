package ArrayLists;

/*
    ARRAY AND ARRAYLIST MANIPULATION
*/

import java.util.ArrayList;
import java.util.Arrays;

public class Playlist2 {
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

        desertIslandPlaylist.add("2Pac - Changes");
        desertIslandPlaylist.add("Rise Against - Methadone");
        desertIslandPlaylist.add("The Smashing Pumpkins - Disarm");
        desertIslandPlaylist.add("Linkin Park - Leave out all the Rest");
        desertIslandPlaylist.add("Dr. Dre - Fuck Wit Dre Day");

        desertIslandPlaylist.addAll(Arrays.asList(favoriteSongs));
        System.out.println(desertIslandPlaylist);
        System.out.println("desertIslandPlaylist has " + desertIslandPlaylist.size() + " songs in it.");
    }
}
