package RoutineReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RoutineReaderMainClass {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        XSSFSheet sheet0 = getSheet(0);

        Iterator DynamicRowIterator = sheet0.rowIterator();
        XSSFRow DynamicRow;
        Iterator DynamicCellIterator;

        Iterator RowIteratorA = sheet0.rowIterator();
        XSSFRow RowA;
        Iterator CellIteratoA;
        XSSFCell CellA;

        int[] DayNamePositionTaker = new int[7];
        String[] timeArray = {"8:30-10:00", "10:00-11:30", "11:30-1:00", "1:00-2:30", "2:30-4:00", "4:00-5:30"};
        String[] dayNameString = {"Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday"};
        
        int arrayIndex = 0;
        int numberOfRows = 0;
        //Taking Position Of All Days In An Array
        while (RowIteratorA.hasNext()) {
            RowA = (XSSFRow) RowIteratorA.next();
            CellIteratoA = RowA.cellIterator();

            while (CellIteratoA.hasNext()) {
                CellA = (XSSFCell) CellIteratoA.next();
                if (CellA.toString().equalsIgnoreCase("Saturday") || CellA.toString().equalsIgnoreCase("Sunday") || CellA.toString().equalsIgnoreCase("Monday") || CellA.toString().equalsIgnoreCase("Tuesday")
                        || CellA.toString().equalsIgnoreCase("Wednesday") || CellA.toString().equalsIgnoreCase("Thursday ")) {
                    DayNamePositionTaker[arrayIndex] = CellA.getRowIndex();
                    arrayIndex++;
                }
            }
            numberOfRows++;
        }
        System.out.println(numberOfRows);
        DayNamePositionTaker[0]=DayNamePositionTaker[0]+2;
        DayNamePositionTaker[6] = numberOfRows-5;
       

        int dayNameIndex = 0;
        String RoomNumber="";
        String Course="";
        String TeacherInitial="";
        String DayName="";
        String Time="";
                     
                    
        for (int day = 0; day < DayNamePositionTaker.length-1; ++day) {
            int TimeIndex = 0;
            

            for (int i = DayNamePositionTaker[day] + 1; i <= DayNamePositionTaker[day+1] - 1; i++) {
                DynamicRow = sheet0.getRow(i);
                DynamicCellIterator = DynamicRow.cellIterator();

                while (DynamicCellIterator.hasNext())
                {
                    XSSFCell cell = (XSSFCell) DynamicCellIterator.next();
                                
                    if((cell.getColumnIndex()+3)%3==0)
                    {
                        RoomNumber=cell.toString();
                        
                    }
                    if((cell.getColumnIndex()+2)%3==0)
                    {
                        if(cell.toString().isEmpty())
                        {
                            Course="Null";
                        }
                        else
                        {
                            Course=cell.toString();
                        }
                        
                    }
                    if((cell.getColumnIndex()+1)%3==0)
                    {
                        if(cell.toString().isEmpty())
                        {
                            TeacherInitial="Null";
                        }
                        else
                        {
                            TeacherInitial=cell.toString();
                        }
                        DayName = dayNameString[dayNameIndex];
                        Time    = timeArray[TimeIndex];
                        ++TimeIndex;
                        
                        System.out.print(RoomNumber+" "+Course+" "+TeacherInitial+" "+DayName+" "+Time+"\n");
                    }
                           
                }
                TimeIndex = 0;
                System.out.println("---------------");
            }
            System.out.println("\n");
            dayNameIndex++;
        }

    }

    
    
    private static XSSFSheet getSheet(int SheetNumber) throws FileNotFoundException, IOException {
        try {
            File file = new File("RoutineV4.xlsx");
            FileInputStream fis = new FileInputStream(file);
            XSSFWorkbook wb = new XSSFWorkbook(fis);
            XSSFSheet sheet = wb.getSheetAt(SheetNumber);
            return sheet;
        } catch (FileNotFoundException e) {
            return null;
        }
    }
}
