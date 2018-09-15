package codePackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Showrov
 */
public class ReaderClass {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        XSSFSheet sheet0 = getSheet(0);
        Iterator RowIteratorA = sheet0.rowIterator();
        XSSFRow RowA;
        Iterator CellIteratoA;
        XSSFCell CellA;

        int[] SemesterNameRowPositionTaker = new int[12];

        int arrayIndex = 0;
        int numberOfRows = 0;
        //Taking Position Of Course Offer
        while (RowIteratorA.hasNext()) {
            RowA = (XSSFRow) RowIteratorA.next();
            CellIteratoA = RowA.cellIterator();
            while (CellIteratoA.hasNext()) {
                CellA = (XSSFCell) CellIteratoA.next();
                if (CellA.toString().equals("1_1") || CellA.toString().equals("1_2") || CellA.toString().equals("1_3")
                        || CellA.toString().equals("2_1") || CellA.toString().equals("2_2") || CellA.toString().equals("2_3")
                        || CellA.toString().equals("3_1") || CellA.toString().equals("3_2") || CellA.toString().equals("3_3")
                        || CellA.toString().equals("4_1") || CellA.toString().equals("4_2")) {
                    SemesterNameRowPositionTaker[arrayIndex] = CellA.getRowIndex();
                    arrayIndex++;
                }
            }
            numberOfRows++;
        }
        SemesterNameRowPositionTaker[11] = numberOfRows - 1;

        //Reading Subjects
        int start = SemesterNameRowPositionTaker[0];
        int end = SemesterNameRowPositionTaker[1];
        int SemesterNumber = 1;

        int currentSemester = 0;
        String CourseString = "";
        String Credit = "";
        String CurrentSection = "";
        String sem = "Semester ";
        String[] CurrentTeacher = new String[6];

        RowIteratorA = sheet0.rowIterator();
        while (RowIteratorA.hasNext()) {
            RowA = (XSSFRow) RowIteratorA.next();
            CellIteratoA = RowA.cellIterator();
            while (CellIteratoA.hasNext()) {
                CellA = (XSSFCell) CellIteratoA.next();
                if (CellA.getRowIndex() > 0 && start <= end) {
                    //Section A
                    if (CellA.getColumnIndex() == 6) {
                        CurrentTeacher[0] = CellA.toString();
                        CurrentSection = "A";
                        if ("".equals(CurrentTeacher[0])) {

                        } else {
                            System.out.println(sem + "  Course :" + CourseString + "  Credit :" + Credit + "  Teacher :" + CurrentTeacher[0] + "  Section :" + CurrentSection);
                        }
                    }

                    //Section B
                    if (CellA.getColumnIndex() == 7) {
                        CurrentTeacher[1] = CellA.toString();
                        CurrentSection = "B";
                        if ("".equals(CurrentTeacher[1])) {

                        } else {
                            System.out.println(sem + "  Course :" + CourseString + "  Credit :" + Credit + "  Teacher :" + CurrentTeacher[1] + "  Section :" + CurrentSection);
                        }

                    }

                    //Section C
                    if (CellA.getColumnIndex() == 8) {
                        CurrentTeacher[2] = CellA.toString();
                        CurrentSection = "C";
                        if ("".equals(CurrentTeacher[2])) {

                        } else {
                            System.out.println(sem + "  Course :" + CourseString + "  Credit :" + Credit + "  Teacher :" + CurrentTeacher[2] + "  Section :" + CurrentSection);
                        }

                    }

                    //Section D
                    if (CellA.getColumnIndex() == 9) {
                        CurrentTeacher[3] = CellA.toString();
                        CurrentSection = "D";
                        if ("".equals(CurrentTeacher[3])) {

                        } else {
                            System.out.println(sem + "  Course :" + CourseString + "  Credit :" + Credit + "  Teacher :" + CurrentTeacher[3] + "  Section :" + CurrentSection);
                        }

                    }

                    //Section E
                    if (CellA.getColumnIndex() == 10) {
                        CurrentTeacher[4] = CellA.toString();
                        CurrentSection = "E";
                        if ("".equals(CurrentTeacher[4])) {

                        } else {
                            System.out.println(sem+ "  Course :" + CourseString + "  Credit :" + Credit + "  Teacher :" + CurrentTeacher[4] + "  Section :" + CurrentSection);
                        }

                    }

                    //Section F
                    if (CellA.getColumnIndex() == 11) {
                        CurrentTeacher[5] = CellA.toString();
                        CurrentSection = "F";
                        if ("".equals(CurrentTeacher[5])) {

                        } else {
                            System.out.println(sem+ "  Course :" + CourseString + "  Credit :" + Credit + "  Teacher :" + CurrentTeacher[5] + "  Section :" + CurrentSection);
                        }
                        start++;
                    }

                    //Reading Course & Semester
                    if (CellA.getColumnIndex() == 4) {
                        CourseString = CellA.toString();
                        currentSemester = SemesterNumber;
                        sem = "Semester ";
                        sem+= currentSemester;
                        
                    }

                    //Reading Credit of The Course
                    if (CellA.getColumnIndex() == 3) {
                        Credit = CellA.toString();
                    }

                    //increasing Semester Number
                    if (start == end && ((SemesterNumber + 1) < SemesterNameRowPositionTaker.length)) {
                        end = SemesterNameRowPositionTaker[SemesterNumber + 1];
                        SemesterNumber++;
                        
                    }
                }
            }
        }
    }

    private static XSSFSheet getSheet(int SheetNumber) throws FileNotFoundException, IOException {
        try {
            File file = new File("Course-Offer-Summer-2018-May-9.xlsx");
            FileInputStream fis = new FileInputStream(file);
            XSSFWorkbook wb = new XSSFWorkbook(fis);
            XSSFSheet sheet = wb.getSheetAt(SheetNumber);
            return sheet;
        } catch (FileNotFoundException e) {
            return null;
        }
    }

}
