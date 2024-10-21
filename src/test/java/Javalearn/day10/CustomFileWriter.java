package Javalearn.day10;

import java.io.FileWriter;
public class CustomFileWriter {
    public static void main(String[] args) {
        String message = "Hello this is ASP";
        try {
            FileWriter fw = new FileWriter("D:/new/Sample.txt");
            fw.write(message);
            System.out.println("Message written to File");
            fw.close();
        } catch (Exception e) {
            System.out.println("An error occured");
        }
    }
}
