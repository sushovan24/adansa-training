package raj.apachepoi.project;

import java.io.FileNotFoundException;
import java.io.IOException;
import raj.apachepoi.project.exceloperations.ExcelOperations;

public class App {

    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        ExcelOperations xlsops = new ExcelOperations();
//        xlsops.ReadingExcelData();
//        xlsops.CreateExcelData();
//        xlsops.ReadDataFromFormulaFile();
//        xlsops.WriteFormulaCell();

//        xlsops.OpenProtectedFile();
//        xlsops.FormattingCellColor();
//        xlsops.Excelhm();
//        xlsops.ReadExcelhm();
        xlsops.DatabaseToExcel();
    }
}
