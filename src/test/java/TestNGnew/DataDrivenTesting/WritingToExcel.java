package TestNGnew.DataDrivenTesting;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WritingToExcel {
    public static void main(String[] args) throws IOException {


        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number of rows: ");
        int tRows = sc.nextInt();

        System.out.println("Enter number of Cells");
        int tCol = sc.nextInt();


        for (int r = 0; r <=tRows ; r++) {
            XSSFRow currentRow = sheet.createRow(r);
            System.out.println("Enter the values");
            for (int c = 0; c <tCol ; c++) {
                XSSFCell currentCell = currentRow.createCell(c);
                currentCell.setCellValue(sc.next());

            }
        }
        String filePath = "src\\test\\java\\TestNGnew\\testData\\myFile2.xlsx";
        FileOutputStream file = new FileOutputStream(filePath);
        workbook.write(file);
        workbook.close();
        file.close();
        System.out.println("File Created");
    }
}
