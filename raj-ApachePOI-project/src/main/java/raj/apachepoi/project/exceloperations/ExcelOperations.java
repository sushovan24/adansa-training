package raj.apachepoi.project.exceloperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.FontFamily;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFCreationHelper;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import raj.apachepoi.project.helper.DatabaseHelper;

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

    public void FormattingCellColor() throws FileNotFoundException, IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Sheet1");
        XSSFRow row = sheet.createRow(1);

        XSSFCellStyle cs = workbook.createCellStyle();
        cs.setFillBackgroundColor(IndexedColors.BRIGHT_GREEN.getIndex());
        cs.setFillPattern(FillPatternType.BIG_SPOTS);

        XSSFCell cell = row.createCell(1);
        cell.setCellValue("Welcome");
        cell.setCellStyle(cs);

        cs = workbook.createCellStyle();
        cs.setFillForegroundColor(IndexedColors.BROWN.getIndex());
        cs.setFillPattern(FillPatternType.ALT_BARS);

        cell = row.createCell(2);
        cell.setCellValue("raj");
        cell.setCellStyle(cs);
        FileOutputStream fos = new FileOutputStream(".\\datafiles\\color.xlsx");
        workbook.write(fos);
        workbook.close();
        fos.close();
        System.out.println("done");

    }

    public void Excelhm() throws FileNotFoundException, IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("sheet1");

        Map<String, String> map = new HashMap<>();
        map.put("896532", "mohan");
        map.put("896533", "Sohan");
        map.put("896534", "Rohan");
        map.put("896535", "Aditya");
        map.put("896536", "Roshan");
        map.put("896537", "Ponga");

        int rownum = 0;
        for (Map.Entry entry : map.entrySet()) {
            XSSFRow row = sheet.createRow(rownum++);
            row.createCell(0).setCellValue((String) entry.getKey());
            row.createCell(1).setCellValue((String) entry.getValue());
        }

        FileOutputStream fos = new FileOutputStream(".\\datafiles\\studentinfo.xlsx");
        workbook.write(fos);
        workbook.close();
        fos.close();
        System.out.println("done");
    }

    public void ReadExcelhm() throws FileNotFoundException, IOException {
        FileInputStream fis = new FileInputStream(".\\datafiles\\Book1.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheetAt = workbook.getSheetAt(0);
        int rows = sheetAt.getLastRowNum();

        Map<Integer, String> map = new HashMap<>();

        int r;
        for (r = 0; r <= rows; r++) {
            int key = (int) sheetAt.getRow(r).getCell(0).getNumericCellValue();
            String value = sheetAt.getRow(r).getCell(1).getStringCellValue();
            map.put(key, value);
        }

        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + "     " + entry.getValue());
        }

        workbook.close();
        fis.close();
    }

//    private Connection con;
    public void DatabaseToExcel() throws FileNotFoundException, IOException, ClassNotFoundException {
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:12753/training", "training", "training@123");

            PreparedStatement ps = con.prepareStatement("select * from students");
            ResultSet rs = ps.executeQuery();

            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("studentdata");
            XSSFRow row = sheet.createRow(0);

            XSSFFont font = workbook.createFont();
            font.setBold(true);
            font.setFontHeight(14);

            XSSFCellStyle style1 = workbook.createCellStyle();
            style1.setBorderRight(BorderStyle.THIN);
            style1.setBorderLeft(BorderStyle.THIN);
            style1.setBorderTop(BorderStyle.THIN);
            style1.setBorderBottom(BorderStyle.THIN);
            style1.setFont(font);
            style1.setAlignment(HorizontalAlignment.CENTER);
            style1.setVerticalAlignment(VerticalAlignment.CENTER);

            XSSFCell idcell = row.createCell(0);
            idcell.setCellValue("id");
            idcell.setCellStyle(style1);

            XSSFCell namecell = row.createCell(1);
            namecell.setCellValue("name");
            namecell.setCellStyle(style1);

            XSSFCell passcell = row.createCell(2);
            passcell.setCellValue("password");
            passcell.setCellStyle(style1);

            XSSFCellStyle style = workbook.createCellStyle();
            style.setAlignment(HorizontalAlignment.CENTER_SELECTION);
            style.setVerticalAlignment(VerticalAlignment.CENTER);

            XSSFCellStyle style2 = workbook.createCellStyle();
            style2.setBorderRight(BorderStyle.THIN);

            int r = 1;

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("student_name");
                String pass = rs.getString("password");

                row = sheet.createRow(r++);

                XSSFCell cell = row.createCell(0);
                cell.setCellValue(id);
                cell.setCellStyle(style);

                row.createCell(1).setCellValue(name);

                XSSFCell lastcell = row.createCell(2);
                lastcell.setCellValue(pass);
                lastcell.setCellStyle(style2);

            }
            XSSFFont font1 = workbook.createFont();
            font1.setBold(true);
            font1.setFontHeight(10);
            font1.setFamily(FontFamily.ROMAN);
            CellStyle style4 = workbook.createCellStyle();
            style4.setAlignment(HorizontalAlignment.CENTER);
            style4.setVerticalAlignment(VerticalAlignment.CENTER);
            style4.setFont(font1);
            style4.setBorderBottom(BorderStyle.THIN);
            style4.setBorderLeft(BorderStyle.THIN);
            style4.setBorderRight(BorderStyle.THIN);
            style4.setBorderTop(BorderStyle.THIN);

            row = sheet.createRow(r++);
            XSSFCell countcell = row.createCell(0);
            countcell.setCellValue("TOTAL:-" + " " + (r - 1));
            countcell.setCellStyle(style4);
            row.createCell(1).setCellStyle(style4);
            row.createCell(2).setCellStyle(style4);
            CellRangeAddress merge = new CellRangeAddress(r - 1, r - 1, 0, 2);
            sheet.addMergedRegion(merge);

            row = sheet.createRow(r++);
//            XSSFCreationHelper creationhelper = workbook.getCreationHelper();
//            XSSFCellStyle style3 = workbook.createCellStyle();
//            style3.setDataFormat(creationhelper.createDataFormat().getFormat("dd-MM-yyyy HH:mm aa"));
            DateFormat df = new SimpleDateFormat("dd-MM-yyy hh:mm aa");
            String date = df.format(new Date());
            System.out.println(date);
            XSSFCellStyle style5 = workbook.createCellStyle();
            style5.setAlignment(HorizontalAlignment.CENTER);
            style5.setVerticalAlignment(VerticalAlignment.CENTER);
            style5.setBorderBottom(BorderStyle.THIN);
            style5.setBorderLeft(BorderStyle.THIN);
            style5.setBorderRight(BorderStyle.THIN);
            style5.setBorderTop(BorderStyle.THIN);
            style5.setFont(font1);

            XSSFCell datecell = row.createCell(0);
            datecell.setCellValue("date:- " + date);
            datecell.setCellStyle(style5);
            row.createCell(1).setCellStyle(style5);
            row.createCell(2).setCellStyle(style5);
            CellRangeAddress merge1 = new CellRangeAddress(r - 1, r - 1, 0, 2);
            sheet.addMergedRegion(merge1);

            FileOutputStream fos = new FileOutputStream(".\\datafiles\\stdata.xlsx");
            workbook.write(fos);
            workbook.close();
            fos.close();

        } catch (SQLException ex) {
            Logger.getLogger(ExcelOperations.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
