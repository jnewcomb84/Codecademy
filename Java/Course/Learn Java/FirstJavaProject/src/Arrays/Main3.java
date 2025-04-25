package Arrays;

public class Main3 {
    public static void main(String[] args) {
        String[] students = {"Sade", "Alexus", "Sam", "Koma"};
        int[] mathScores = new int[4];

        mathScores[0] = 64;
        mathScores[1] = 57;
        mathScores[2] = 76;
        mathScores[3] = 98;

        System.out.println(students[0].toString() + ": " + mathScores[0]);
        System.out.println(students[1].toString() + ": " + mathScores[1]);
        System.out.println(students[2].toString() + ": " + mathScores[2]);
        System.out.println(students[3].toString() + ": " + mathScores[3]);
    }
}