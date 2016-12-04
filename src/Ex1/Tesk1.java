package Ex1;

import java.io.*;

public class Tesk1 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:/test-java.txt");
        file.createNewFile();

        FileOutputStream outputStream = new FileOutputStream(file);
        outputStream.write("Hello, dear student!\nHow are you?".getBytes());
        outputStream.close();

        System.out.println(getAllTextFromFile(file));

        file.delete();
    }

    public static String getAllTextFromFile(File f) {
        String s = "";
        try (FileReader reader = new FileReader(f)) {
            char[] buffer = new char[1024];

            while (reader.read(buffer) != -1) {
                s += new String(buffer);
            }
        } catch (IOException ex) {
            throw new IllegalStateException();
        }

        return s;
    }
}
