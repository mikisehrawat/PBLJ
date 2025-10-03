import java.util.*;

class estuexce extends Exception {
    public estuexce(String msg) {
        super(msg);
    }
}

class StudentList {
    private ArrayList<String> names = new ArrayList<>();

    void addName(String name) {
        names.add(name);
    }

    void removeName(String name) {
        names.remove(name);
    }

    void displayNames() throws estuexce {
        if (names.isEmpty())
            throw new estuexce("Student list is empty!");
        ArrayList<String> sorted = new ArrayList<>(names);
        Collections.sort(sorted);
        System.out.println("Sorted names: " + sorted);
    }
}

public class StudentListDemo {
    public static void main(String[] args) {
        StudentList sl = new StudentList();
        sl.addName("Alice");
        sl.addName("Bob");
        sl.addName("Charlie");
        try {
            sl.displayNames();
            System.out.println("Removing Bob...");
            sl.removeName("Bob");
            sl.displayNames();
            System.out.println("Attempting to display empty list...");
            sl.removeName("Alice");
            sl.removeName("Charlie");
            sl.displayNames();
        } catch (estuexce e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}