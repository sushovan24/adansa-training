package raj.apachepoi.project.exceloperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelOperations {

    public void ReadingExcelData() throws FileNotFoundException, IOException {
        String excelFilePath = ".\\datafiles\\countrydata.xlsx";
        FileInputStream inputs = new FileInputStream(excelFilePath);

        XSSFWorkbook workbook = new XSSFWorkbook(inputs);
        XSSFSheet sheet = workbook.getSheetAt(0);

        int rows = sheet.getLastRowNum();
        int cols = sheet.getRow(1).getLastCellNum();
        int r;
        int c;

//        for (r = 0; r <= rows; r++) {
//            XSSFRow row = sheet.getRow(r);
//            for (c = 0; c < cols; c++) {
//                XSSFCell cell = row.getCell(c);
//                switch (cell.getCellType()) {
//                    case STRING:
//                        System.out.print(cell.getStringCellValue()+"    ");
//                        break;
//                    case NUMERIC:
//                        System.out.print(cell.getNumericCellValue()+"   ");
//                        break;
//                    case BOOLEAN:
//                        System.out.print(cell.getBooleanCellValue()+"   ");
//                        break;
//                }
//            }
//            System.out.println("");
//        }
//read data from iterator from excel
        Iterator itr = sheet.iterator();
        while (itr.hasNext()) {
            XSSFRow row = (XSSFRow) itr.next();
            Iterator cellitr = row.cellIterator();
            while (cellitr.hasNext()) {
                XSSFCell cell = (XSSFCell) cellitr.next();
                switch (cell.getCellType()) {
                    case STRING:
                        System.out.print(cell.getStringCellValue() + "   ");
                        break;
                    case NUMERIC:
                        System.out.print(cell.getNumericCellValue() + "    ");
                        break;
                    case BOOLEAN:
                        System.out.print(cell.getBooleanCellValue() + "    ");
                        break;
                }
            }
            System.out.println(" ");
        }
    }

    public void CreateExcelData() throws FileNotFoundException, IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("student_info");
//        Object[][] empdata = {{"empid", "name", "field"}, {101, "raj", "java"}, {102, "rohan", "python"},
//        {103, "sohan", "content"}, {104, "sonu", "runing"}, {105, "monu", "reading"}, {106, "john", "cinema"}};

//        int rows = empdata.length;
//        int cols = empdata[0].length;
//
//        System.out.println(rows);
//        System.out.println(cols);
//
//        int r;
//        int c;
//        for (r = 0; r < rows; r++) {
//            XSSFRow row = sheet.createRow(r);
//            for (c = 0; c < cols; c++) {
//                XSSFCell cell = row.createCell(c);
//                Object data = empdata[r][c];
//                if (data instanceof String) {
//                    cell.setCellValue((String) data);
//                }
//                if (data instanceof Integer) {
//                    cell.setCellValue((Integer) data);
//                }
//                if (data instanceof Boolean) {
//                    cell.setCellValue((boolean) data);
//                }
//            }
//        }
///for exch lopp
        List<Object[]> empdata = new ArrayList<>();
        empdata.add(new Object[]{101, "raju", "java"});
        empdata.add(new Object[]{102, "rohan", "java"});
        empdata.add(new Object[]{103, "roshan", "java"});
        empdata.add(new Object[]{104, "manoj", "java"});
        empdata.add(new Object[]{105, "muskan", "java"});
        int rowCount = 0;

        for (Object[] std : empdata) {
            XSSFRow row = sheet.createRow(rowCount++);
            int columCount = 0;
            for (Object value : std) {
                XSSFCell cell = row.createCell(columCount++);
                if (value instanceof String) {
                    cell.setCellValue((String) value);
                }
                if (value instanceof Integer) {
                    cell.setCellValue((Integer) value);
                }
                if (value instanceof Boolean) {
                    cell.setCellValue((boolean) value);
                }
            }
        }

        String filepath = ".\\datafiles\\student.xlsx";
        FileOutputStream fos = new FileOutputStream(filepath);
        workbook.write(fos);
        fos.close();
        System.out.println("file created successfully");
    }

    public void ReadDataFromFormulaFile() throws FileNotFoundException, IOException {
        String filepath = ".\\datafiles\\employee.xlsx";
        FileInputStream fis = new FileInputStream(filepath);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheet("Sheet1");
        int rows = sheet.getLastRowNum();
        int cols = sheet.getRow(0).getLastCellNum();

        int r;
        int c;

        for (r = 0; r <= rows; r++) {
            XSSFRow row = sheet.getRow(r);
            for (c = 0; c < cols; c++) {
                XSSFCell cell = row.getCell(c);
                switch (cell.getCellType()) {
                    case STRING:
                        System.out.print(cell.getStringCellValue() + "    ");
                        break;
                    case NUMERIC:
                        System.out.print(cell.getNumericCellValue() + "   ");
                        break;
                    case BOOLEAN:
                        System.out.print(cell.getBooleanCellValue() + "   ");
                        break;
                    case FORMULA:
                        System.out.println(cell.getNumericCellValue());
                        break;

                }
            }

            System.out.println("");
        }

        fis.close();
    }

    public void WriteFormulaCell() throws FileNotFoundException, IOException {

        String filepath = ".\\datafiles\\employee.xlsx";
        FileInputStream fis = new FileInputStream(filepath);

        XSSFWorkbook workbook = new XSSFWorkbook(fis);

        XSSFSheet sheet = workbook.getSheetAt(0);

        sheet.getRow(10).getCell(2).setCellFormula("SUM(B2:B8)");

        fis.close();

//        XSSFSheet sheet = workbook.createSheet("numbers");
//        XSSFRow row = sheet.createRow(0);
//        row.createCell(0).setCellValue(100);
//        row.createCell(1).setCellValue(200);
//        row.createCell(2).setCellValue(300);
//
//        row.createCell(3).setCellFormula("A1+B1+C1");
        FileOutputStream fos = new FileOutputStream(".\\datafiles\\employee.xlsx");
        workbook.write(fos);
        workbook.close();
        fos.close();
    }

    public void OpenProtectedFile() throws FileNotFoundException, IOException {
        FileInputStream fis = new FileInputStream(".\\datafiles\\college.xlsx");
        String password = "Raj@123";
//        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFWorkbook workbook = (XSSFWorkbook) WorkbookFactory.create(fis, password);
        XSSFSheet sheet = (XSSFSheet) workbook.getSheetAt(0);

        int rows = sheet.getLastRowNum();
        int cols = sheet.getRow(0).getLastCellNum();

        System.out.println(rows + " " + cols);

        int r;
        int c;

        for (r = 0; r <= rows; r++) {
            XSSFRow row = sheet.getRow(r);
            for (c = 0; c < cols; c++) {
                XSSFCell cell = row.getCell(c);
                switch (cell.getCellType()) {
                    case STRING:
                        System.out.print(cell.getStringCellValue() + "  |  ");
                        break;
                    case NUMERIC:
                        System.out.print(cell.getNumericCellValue() + "    ");
                        break;
                    case BOOLEAN:
                        System.out.print(cell.getBooleanCellValue() + "    ");
                        break;
                    case FORMULA:
                        System.out.print(cell.getNumericCellValue() + "    ");
                        break;
                }

            }
            System.out.println("");
        }

        workbook.close();
        fis.close();
    }
}
