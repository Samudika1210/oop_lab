/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_05;

/**
 *
 * @author ASUS
 */
public class bike extends vehicle {
    private int numberOfHours;
    private double hourlyRate;

    public bike(String vehicleNumber, String brand, int numberOfHours, double hourlyRate) {
        super(vehicleNumber, brand);
        this.numberOfHours = numberOfHours;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateRentalCost() {
        super.calculateRentalCost(); // Call parent method
        return numberOfHours * hourlyRate;
    }
    
}
