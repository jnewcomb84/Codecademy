package ArrayLists;

import java.util.ArrayList;

class ToDos7 {
    public static void main(String[] args) {

        // Sherlock
        ArrayList<String> sherlocksToDos = new ArrayList<String>();

        sherlocksToDos.add("visit the crime scene");
        sherlocksToDos.add("play violin");
        sherlocksToDos.add("interview suspects");
        sherlocksToDos.add("listen to Dr. Watson for amusement");
        sherlocksToDos.add("solve the case");
        sherlocksToDos.add("apprehend the criminal");

        sherlocksToDos.remove("visit the crime scene");

        // Calculate to-dos until case is solved:
        int todosLeft = sherlocksToDos.indexOf("solve the case");

        // Change the value printed:
        System.out.println("PRINT THE ANSWER HERE");
        System.out.println(todosLeft);
    }
}