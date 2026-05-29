/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_7;

/**
 *
 * @author ASUS
 */
public class StudentMarkReportTest {
    public static void main(String[] args) {
        String[] marksArray = {"78", "82", "absent", "90"};
        
        StudentMarkReport report = new StudentMarkReport(marksArray);

        try {
            int mark = report.getMarkAt(6);
            System.out.println("Mark: " + mark);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            // Comment:
            // getMarkAt(6) causes an exception because index 6 is beyond the range of 
            // the array, which only contains 4 elements (valid indices: 0 to 3).
            System.out.println("Error: Selected mark position does not exist."); //
        } 

        finally {
            System.out.println("Array access checking completed.");
        }

        try {
            int mark = report.getMarkAt(2);
            System.out.println("Mark: " + mark);
        } 

        catch (NumberFormatException e) {
            // Comment:
            // getMarkAt(2) causes an exception because index 2 stores the text "absent", 
            // which contains alphabetic characters and cannot be converted into an integer.
            System.out.println("Error: Selected mark is not a valid number."); //
        } 
        finally {
            System.out.println("Number conversion checking completed."); //
        }

        System.out.println("Report checking completed."); //
    }
}
