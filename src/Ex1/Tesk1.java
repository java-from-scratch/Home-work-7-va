package Ex1;

import java.io.*;

public class Tesk1 {
    public static void main(String[] args) throws IOException {
        File file = new File("~/home/andy/Документы/text.txt");
        file.createNewFile();

        FileOutputStream outputStream = new FileOutputStream(file);
        outputStream.write("Hello, dear student!\nHow are you?".getBytes());
        outputStream.close();

        System.out.println(getAllTextFromFile(file));

        file.delete();
    }

    public static String getAllTextFromFile(File f){
        String s = "";
        try(FileReader reader = new FileReader("~/home/andy/Документы/text.txt"))
        {
            int j;

            while((j=reader.read())!=-1){

                s+=(char)j;

            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

        return s;
    }
}
