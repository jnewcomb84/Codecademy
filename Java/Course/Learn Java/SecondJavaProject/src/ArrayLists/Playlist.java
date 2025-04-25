package ArrayLists;

/*
    SWAP SONGS
*/

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Random;

public class Playlist {
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
        Random rand = new Random();
        int randInt = rand.nextInt(10);

        desertIslandPlaylist.add("2Pac - Changes");
        desertIslandPlaylist.add("Rise Against - Methadone");
        desertIslandPlaylist.add("The Smashing Pumpkins - Disarm");
        desertIslandPlaylist.add("Linkin Park - Leave out all the Rest");
        desertIslandPlaylist.add("Dr. Dre - Fuck Wit Dre Day");

        desertIslandPlaylist.addAll(Arrays.asList(favoriteSongs));
        System.out.println("desertIslandPlaylist has " + desertIslandPlaylist.size() + " songs in it.");
        System.out.println(desertIslandPlaylist + "\n");

        desertIslandPlaylist.remove(5);
        desertIslandPlaylist.remove("Baby Metal - Ratatata");
        desertIslandPlaylist.remove(8);
        // desertIslandPlaylist.remove(randInt);
        desertIslandPlaylist.remove(10);
        desertIslandPlaylist.removeLast();

        System.out.println("desertIslandPlaylist has " + desertIslandPlaylist.size() + " songs in it.");
        System.out.println(desertIslandPlaylist);

        int songA = desertIslandPlaylist.indexOf("We Came as Romans - Blur");
        int songB = desertIslandPlaylist.indexOf("Silverstein - Confession");
        String tempA = desertIslandPlaylist.get(songA);
        desertIslandPlaylist.set(songA, desertIslandPlaylist.get(songB));
        desertIslandPlaylist.set(songB, tempA);

        System.out.println(desertIslandPlaylist);
    }
}
