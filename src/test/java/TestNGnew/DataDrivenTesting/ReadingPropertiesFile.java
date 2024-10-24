package TestNGnew.DataDrivenTesting;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Properties;

public class ReadingPropertiesFile {
    public static void main(String[] args) throws IOException {
       /* FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\TestNGnew\\testData\\config.properties");*/
        String filepath = "\\src\\test\\java\\TestNGnew\\testData\\config.properties";
        FileInputStream file = new FileInputStream(filepath);

        //Loading Properties File
        Properties propobj = new Properties();
        propobj.load(file);

        //Reading data from PropertiesFile
        String url = propobj.getProperty("appurl");
        String email = propobj.getProperty("email");

        System.out.println(url+ " " +email);

    }
}
