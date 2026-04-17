public class LabAssistant  extends StaffMember {
    private double basicSalary;
    private int overtimeHours;
    private static double overtimeRate = 800.00;
    
    public LabAssistant(String fullName, String staffId, String department, double basicSalary, int overtimeHours) {
        super(fullName, staffId, department);
        this.basicSalary = basicSalary;
        this.overtimeHours = overtimeHours;
    }
    
    @Override
    public double calculateMonthlyPayment() {
        return basicSalary + (overtimeHours * overtimeRate);
    }
}
