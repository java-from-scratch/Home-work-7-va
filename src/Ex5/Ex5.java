package Ex5;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) throws IOException {
        File file = new File("~/home/andy/Документы/Ex5.txt");
        file.createNewFile();
        int index = 0;
        String name,surname;
        int age;
        Scanner scanner = new Scanner(System.in);

        FileOutputStream output = new FileOutputStream(file);
        while(index!=2){
            System.out.println("1) Add new human");
            System.out.println("2) Exit");
            System.out.print("Select option: ");
            index = scanner.nextInt();
            if (index == 1) {
                System.out.print("Enter name: ");
                name = scanner.nextLine();
                output.write((name + " | ").getBytes());
                System.out.print("Enter surname: ");
                surname = scanner.nextLine();
                output.write((surname + " | ").getBytes());
                System.out.print("Enter age: ");
                age = scanner.nextInt();
                output.write((age + "\n").getBytes());
            }
        }

        output.close();
    }
}
