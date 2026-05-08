/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_05;

/**
 *
 * @author ASUS
 */
public class car extends vehicle {
    private int numberOfDays;
    private double dailyRate;

    public car(String vehicleNumber, String brand, int numberOfDays, double dailyRate) {
        super(vehicleNumber, brand);
        this.numberOfDays = numberOfDays;
        this.dailyRate = dailyRate;
    }

    @Override
    public double calculateRentalCost() {
        super.calculateRentalCost();
        return numberOfDays * dailyRate;
    }
    
}
