/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_7;

/**
 *
 * @author ASUS
 */
public class StudentMarkReport {
    private String[] marks;

    public StudentMarkReport(String[] marks) {
        this.marks = marks;
    }

    public int getMarkAt(int index) {
        String textMark = marks[index];

        return Integer.parseInt(textMark);
    }
}
