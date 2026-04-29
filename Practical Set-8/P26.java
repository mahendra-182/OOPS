import java.io.*;

public class PR26 {
    public static void main(String[] args) {
        int chars = 0, words = 0, lines = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader(args[0]));
            String line;

            while ((line = br.readLine()) != null) {
                lines++;
                chars += line.length();
                String[] w = line.trim().split("\\s+");
                if (!line.trim().isEmpty())
                    words += w.length;
            }

            br.close();

            System.out.println("Lines: " + lines);
            System.out.println("Words: " + words);
            System.out.println("Characters: " + chars);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}