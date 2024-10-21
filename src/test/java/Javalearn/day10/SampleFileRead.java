package Javalearn.day10;
import java.io.FileReader;
public class SampleFileRead {
    public static void main(String[] args) {

        char[] data = new char[50];

        try {
            FileReader fr = new FileReader("D:/new/Sample.txt");
            fr.read(data);
            System.out.println(data);
            fr.close();
        }
        catch( Exception e)
        {
            System.out.println("Error");
        }

    }
}
