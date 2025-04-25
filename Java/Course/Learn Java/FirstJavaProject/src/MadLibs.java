/*
    This program generates a mad libbed story.
    Author: Jeremy
    Date: 02/03/2025
*/

public class MadLibs {

    public static void main(String[] args) {
        String adjective1 = "obedient", adjective2 = "massive", adjective3 = "skinny";
        String name1 = "Jeremy", name2 = "Kristina";
        String noun1 = "pot", noun2 = "cat", noun3 = "White Russian", noun4 = "weed", noun5 = "hedgehog", noun6 = "waifu";
        String place1 = "Los Angeles";
        String verb1 = "grab";

        int number = 713;

        //The template for the story
        String story = "This morning " + name1 + " woke up feeling " + adjective1 + ". 'It is going to be a "
                     + adjective2 + " day!' Outside, a bunch of " + noun1 + "s were protesting to keep " + noun2
                     + " in stores. They began to " + verb1 + " to the rhythm of the " + noun3 + ", which made all the "
                     + noun4 + "s very " + adjective3 + ". Concerned, " + name1 + " texted " + name2 + ", who flew "
                     + name1 + " to " + place1 + " and dropped " + name1 + " in a puddle of frozen " + noun5 + ". "
                     + name1 + " woke up in the year " + number + ", in a world where " + noun6 + "s ruled the world.";

        System.out.println(story);
    }
}