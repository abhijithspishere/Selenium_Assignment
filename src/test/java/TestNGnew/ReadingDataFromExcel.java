package TestNGnew;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

//ExcelFile --> WorkBook --> Sheets --> Rows --> Cells
public class ReadingDataFromExcel {
    public static void main(String[] args) throws IOException {
//        FileInputStream file = new FileInputStream("src\\test\\java\\TestNGnew\\testData\\data.xlsx");

//        String projectPath = System.getProperty("user.dir");
        String filePath = "src\\test\\java\\TestNGnew\\testData\\data.xlsx";

        FileInputStream file = new FileInputStream(filePath);

        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheet("Sheet1");

        int totalRows = sheet.getLastRowNum();//fetches total number of rows
        int totalCells = sheet.getRow(0).getLastCellNum(); //fetches total number of cells

        System.out.println("Number of Rows : "+totalRows); //5 Row number starts from 0
        System.out.println("Number of Cells : "+totalCells); //4 Cell or Column number starts from 1

        for (int r = 0; r <= totalRows; r++) {
            XSSFRow currentRow = sheet.getRow(r);
            for (int c = 0; c <totalCells ; c++) {//here column starts with 1 so no equal sign needed
                XSSFCell currentCell = currentRow.getCell(c);

                String currentValue = currentCell.toString();
                System.out.print(currentValue+"\t");
            }
            System.out.println();
            }

        workbook.close();
        file.close();
    }

}
