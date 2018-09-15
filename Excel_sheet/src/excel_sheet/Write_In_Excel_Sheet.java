package excel_sheet;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_In_Excel_Sheet {
    public static void main(String[] args) {
        
        try 
        {
            File file = new File("Routine.xlsx");
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.getSheetAt(0);
            
            Map <String, Object[]> data = new HashMap<String, Object[]>();
            data.put("7", new Object[]{7d, "Sonya", "785", "Sales"});
            data.put("8", new Object[]{8d, "Laia", "75", "Sales"});
            data.put("9", new Object[]{9d, "Sabika", "85", "Sales"});
            
            Set<String> newRow = data.keySet();
            
            int rownum= sheet.getLastRowNum();
           
            for(String key: newRow)
            {
                Row row = sheet.createRow(rownum++);
                Object[] objarr = data.get(key);
                int cellnum = 0;
                
                for(Object obj: objarr)
                {
                    Cell cell = row.createCell(cellnum++);
                    if(obj instanceof String)
                    {
                        cell.setCellValue((String) obj);
                    }
                    else if(obj instanceof Date)
                    {
                        cell.setCellValue((Date) obj);
                    }
                    else if(obj instanceof Double)
                    {
                        cell.setCellValue((Double) obj);
                    }
                }
            }
            
            
            FileOutputStream fos = new FileOutputStream(file);
            workbook.write(fos);
            
            System.out.println("File writing finished");
        } catch (Exception e) {
            
            System.out.println(e.toString());
        }
    }
    
}
