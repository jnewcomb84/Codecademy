package StringMethods;

/*
    This program does stuff and things
    Notes:
        1. Proteins:
           a. Start with 'ATG'
           b. Ends with 'TGA'
           c. Characters in between must be divisible by 3

 */
public class DNA {
    public static void main(String[] args) {

        //  -. .-.   .-. .-.   .
        //    \   \ /   \   \ /
        //   / \   \   / \   \
        //  ~   `-~ `-`   `-~ `-

        String dna1 = "ATGCGATACGCTTGA";
        String dna2 = "ATGCGATACGTGA";
        String dna3 = "ATTAATATGTACTGA";

        String dna = dna2;
        String startCodon = "ATG";
        String endCodon = "TGA";

        int beginningIndex = dna.indexOf(startCodon);
        int endIndex = dna.indexOf(endCodon);
        int charsBetween = dna.substring(beginningIndex + startCodon.length(), endIndex).length();

        // System.out.println("Entire String Length (in chars): " + dna.length());
        // System.out.println("Index of \"" + startCodon + "\": " + dna.indexOf(startCodon));
        // System.out.println("Index of \"" + endCodon + "\": " + dna.indexOf(endCodon));
        // System.out.println(dna.substring(beginningIndex + 3, endIndex));    // "ATG"<--Count Everything Here-->"TGA"
        // System.out.println(charsBetween);
        // System.out.println(charsBetween % 3 == 0);

        if (dna.indexOf(startCodon) != -1 && dna.indexOf(endCodon) != -1) {
            String protein;
            protein = dna.substring(beginningIndex + 3, endIndex);
            System.out.println(protein + " protein found!");
        }
        else {
            System.out.println("No protein.");
        }
    }
}