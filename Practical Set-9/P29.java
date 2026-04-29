import java.util.*;

public class PR29 {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(85);
        marks.add(78);
        marks.add(90);
        marks.add(66);
        marks.add(88);

        System.out.println("Marks: " + marks);
        System.out.println("Highest: " + Collections.max(marks));
        System.out.println("Lowest: " + Collections.min(marks));
    }
}