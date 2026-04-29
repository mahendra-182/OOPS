import java.util.*;

public class PR30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        HashMap<String, Integer> map = new HashMap<>();

        String[] words = input.split("\\s+");

        for (String w : words) {
            map.put(w, map.getOrDefault(w, 0) + 1);
        }

        for (String key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}