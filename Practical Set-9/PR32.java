import java.util.*;

public class PR32 {

    public static <T> boolean searchElement(LinkedList<T> list, T element) {
        return list.contains(element);
    }

    public static void main(String[] args) {
        LinkedList<Integer> rollNos = new LinkedList<>();
        rollNos.add(1);
        rollNos.add(2);
        rollNos.add(3);

        LinkedList<String> names = new LinkedList<>();
        names.add("Darshil");
        names.add("Ravi");
        names.add("Amit");

        System.out.println(searchElement(rollNos, 2));
        System.out.println(searchElement(names, "Ravi"));
    }
}