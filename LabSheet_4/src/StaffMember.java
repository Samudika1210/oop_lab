public abstract class StaffMember {
    private String fullName;
    private final String staffId;
    protected String department;
    
    public static int staffCount = 0;
    
    public StaffMember(String fullName, String staffId, String department) {
        this.fullName = fullName;
        this.staffId = staffId;
        this.department = department;
        
        staffCount++;
    }
    
    public String getFullName() {
        return fullName;
    }

    public String getStaffId() {
        return staffId;
    }

    public String getDepartment() {
        return department;
    }
    
    public final void displayBasicDetails() {
        System.out.println("Staff ID: " + staffId);
        System.out.println("Full Name: " + fullName);
        System.out.println("Department: " + department);
    }
    public abstract double calculateMonthlyPayment();
}
