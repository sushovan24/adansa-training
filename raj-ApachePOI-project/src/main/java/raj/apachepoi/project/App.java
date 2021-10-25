package raj.apachepoi.project;

import java.io.IOException;
import raj.apachepoi.project.exceloperations.ExcelOperations;

public class App {

    public static void main(String[] args) throws IOException {
        ExcelOperations xlsops = new ExcelOperations();
//        xlsops.ReadingExcelData();
//        xlsops.CreateExcelData();
//        xlsops.ReadDataFromFormulaFile();
//        xlsops.WriteFormulaCell();

        xlsops.OpenProtectedFile();
        
    }
}
