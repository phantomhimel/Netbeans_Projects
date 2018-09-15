/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excel_sheet;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author User
 */
public class Excel_sheet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            
            
            File myFile = new File("Routine.xlsx"); 
            
            FileInputStream fis = new FileInputStream(myFile); 
// Finds the workbook instance for XLSX file
            XSSFWorkbook myWorkBook = new XSSFWorkbook (fis); 
// Return first sheet from the XLSX workbook 
            XSSFSheet mySheet = myWorkBook.getSheetAt(0); 
// Get iterator to all the rows in current sheet 
            Iterator<Row> rowIterator = mySheet.iterator(); 
// Traversing over each row of XLSX file
            while (rowIterator.hasNext()) 
            { 
                Row row = rowIterator.next();
                Iterator<Cell> cellIterator = row.cellIterator(); 
                while (cellIterator.hasNext()) 
                { 
                    Cell cell = cellIterator.next();
                    switch (cell.getCellType()) 
                    {
                        case Cell.CELL_TYPE_STRING: 
                            System.out.print(cell.getStringCellValue() + "\t\t");
                            break; 
                        case Cell.CELL_TYPE_NUMERIC: 
                            System.out.print(cell.getNumericCellValue() + "\t\t"); 
                            break; 
                        case Cell.CELL_TYPE_BOOLEAN: 
                            System.out.print(cell.getBooleanCellValue() + "\t\t");
                            break; 
                        default : 
                    }
             } 
             System.out.println(""); 
           }

        } catch (Exception e) 
        {
            System.out.println(e.toString());
        }
    }
    
}
