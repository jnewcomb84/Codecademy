package ArrayLists;

import java.util.ArrayList;

class ToDos2 {
    public static void main(String[] args) {

        ArrayList<String> toDoList = new ArrayList<String>();
        String toDo1 = "Water plants";

        // Add more to-dos here:
        String toDo2 = "Cook Dinner";
        String toDo3 = "Hookers and Blow";

        // Add to-dos to toDoList
        toDoList.add(toDo1);
        toDoList.add(toDo2);
        toDoList.add(toDo3);

        System.out.println(toDoList);
    }
}