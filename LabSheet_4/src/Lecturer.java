public class Lecturer extends StaffMember {
    private double basicSalary;
    private int extraHours;
    private static double hourlyRate = 1500.00;
    
    public Lecturer(String fullName, String staffId, String department, double basicSalary, int extraHours) {
        super(fullName, staffId, department);
        this.basicSalary = basicSalary;
        this.extraHours = extraHours;
    }
    
    @Override
    public double calculateMonthlyPayment() {
        return basicSalary + (extraHours * hourlyRate);
    }
    
}
