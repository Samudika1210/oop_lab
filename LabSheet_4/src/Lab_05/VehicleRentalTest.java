/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_05;

/**
 *
 * @author ASUS
 */
public class VehicleRentalTest {
    public static void main(String[] args) {
        
        vehicle vehicle1 = new car("CAR-1234", "Toyota", 5, 2500.0);
        vehicle vehicle2 = new bike("BIKE-5678", "Yamaha", 10, 150.0);

        vehicle1.displayVehicleInfo();
        System.out.println("Total Rental Cost: " + vehicle1.calculateRentalCost());
        System.out.println();

        vehicle2.displayVehicleInfo();
        System.out.println("Total Rental Cost: " + vehicle2.calculateRentalCost());

    }
    
}
