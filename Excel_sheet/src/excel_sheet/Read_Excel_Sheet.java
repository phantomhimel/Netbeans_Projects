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
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author User
 */
public class Read_Excel_Sheet {
    
    public static void main(String[] args) {
        
        try 
        {
            File myfile = new File("Routine.xlsx");
            FileInputStream fis = new FileInputStream(myfile);
            
            // Find the workbook instance for xlsx file
            XSSFWorkbook workbook = new XSSFWorkbook(fis);
            
            // Return first sheet from the xlsx workbook
            XSSFSheet mysheet = workbook.getSheetAt(0);
            
            // Get iterator to all rows in the current sheet
            Iterator <Row> rowIterator = mysheet.iterator();
            
            while(rowIterator.hasNext())
            {
                Row row = rowIterator.next();
                Iterator <Cell> cellIterator = row.cellIterator();
                while(cellIterator.hasNext())
                {
                    Cell cell = cellIterator.next();
                    
                    switch(cell.getCellType())
                    {
                        case Cell.CELL_TYPE_STRING:
                            System.out.println(cell.getStringCellValue());
                            break;
                            
                        case Cell.CELL_TYPE_NUMERIC:
                            System.out.println(cell.getNumericCellValue());
                            break;
                       
                        default:
                    }
                }
                System.out.println("");
            }
        } catch (Exception e) {
        }
    }
}
