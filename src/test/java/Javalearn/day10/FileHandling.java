package Javalearn.day10;
import java.io.File;
public class FileHandling {
    public static void main(String[] args) {
        File fnew = new File("D:/new/Sample.txt");
        try {
            boolean status = fnew.createNewFile();
            if (status)
            {
                System.out.println("The new file created");
            }
            else
            {
                System.out.println("File already exists");
            }
        } catch (Exception e) {
            System.out.println("Error Occurred");
        }
    }
}
