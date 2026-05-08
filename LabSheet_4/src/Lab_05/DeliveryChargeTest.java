/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_05;

/**
 *
 * @author ASUS
 */
public class DeliveryChargeTest {
    public static void main(String[] args) {
        DeliveryChargeCalculator calculator = new DeliveryChargeCalculator();

        // Testing different scenarios
        System.out.println("Base Charge Only: " + calculator.calculateCharge(500.0));
        System.out.println("Charge with Distance (5km): " + calculator.calculateCharge(500.0, 5.0));
        System.out.println("Charge with Distance (5km) and Weight (2kg): " + calculator.calculateCharge(500.0, 5.0, 2.0));
        System.out.println("Express Delivery Charge: " + calculator.calculateCharge(500.0, true));
    }
}
