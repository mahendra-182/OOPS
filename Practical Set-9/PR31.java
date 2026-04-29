import java.util.*;

public class PR31 {
    public static void main(String[] args) {
        LinkedList<String> playlist = new LinkedList<>();

        playlist.add("Song1");
        playlist.add("Song2");
        playlist.add("Song3");

        System.out.println("Playlist: " + playlist);

        System.out.println("Playing: " + playlist.removeFirst());
        System.out.println("After playing: " + playlist);

        System.out.println("Skipping: " + playlist.removeLast());
        System.out.println("After skipping: " + playlist);
    }
}