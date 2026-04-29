import java.io.*;

public class PR26 {
    public static void main(String[] args) {
        // Use provided filename argument, or default to a sample text
        if (args.length == 0) {
            // Demo mode: count from a hardcoded sample string
            String sample = "Hello World\nThis is Java\nFile reading demo";
            int chars = 0, words = 0, lines = 0;
            for (String line : sample.split("\n")) {
                lines++;
                chars += line.length();
                String[] w = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) words += w.length;
            }
            System.out.println("--- Demo mode (no file provided) ---");
            System.out.println("Lines: " + lines);
            System.out.println("Words: " + words);
            System.out.println("Characters: " + chars);
            return;
        }

        // File mode
        int chars = 0, words = 0, lines = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader(args[0]));
            String line;
            while ((line = br.readLine()) != null) {
                lines++;
                chars += line.length();
                String[] w = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) words += w.length;
            }
            br.close();
            System.out.println("File: " + args[0]);
            System.out.println("Lines: " + lines);
            System.out.println("Words: " + words);
            System.out.println("Characters: " + chars);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}