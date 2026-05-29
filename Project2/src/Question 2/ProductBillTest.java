/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_7;

/**
 *
 * @author ASUS
 */
public class ProductBillTest {
    public static void main(String[] args) {
        ProductBill bill = new ProductBill("1500.00", "two");

        try {
            double total = bill.calculateTotal();
            System.out.println("Total Bill: " + total);
        } 
        catch (NumberFormatException e) {
            // Comment: 
            // A NumberFormatException occurs because the String "two" contains non-numeric 
            // characters and cannot be successfully parsed into an integer value by Integer.parseInt().
            System.out.println("Error: Price and quantity must be valid numbers.");
        } 
        finally {
            System.out.println("Product bill calculation completed.");
        }

        System.out.println("Program continues...");
    }
}
