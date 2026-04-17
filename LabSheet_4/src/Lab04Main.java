public class Lab04Main {
    public static void main(String[] args) {
        
        UniversityPolicy.showPolicyHeader();
        System.out.println("University: " + UniversityPolicy.UNIVERSITY_NAME);
        
        StaffMember.showSystemName();
      
        Lecturer lec1 = new Lecturer("Dr. Sunimal", "L100", "Computing", 75000, 12);
        Lecturer lec2 = new Lecturer("Ms. Nimal Silva", "L300", "Business", 55000, 5);
        LabAssistant lab = new LabAssistant("Mr. Perera", "A200", "IT", 45000, 10);
        
        System.out.println("\n--- Displaying All Staff Details ---");
        lec1.displayStaffDetails();
        lec2.displayStaffDetails();
        lab.displayLabAssistantDetails();
        
        System.out.println("\n");
        
        double lecSalary = lec1.calculateMonthlyPayment();
        double labSalary = lab.calculateMonthlyPayment();
        
        System.out.println("--- Lecturer Details ---");
        lec1.displayStaffDetails();

        System.out.println("\n--- Lab Assistant Details ---");
        lab.displayLabAssistantDetails();
        
        System.out.println("\n--- Bonus Estimation ---");
        System.out.println(lec1.getFullName() + " Bonus: " + UniversityPolicy.calculateBonus(lecSalary));
        System.out.println(lab.getFullName() + " Bonus: " + UniversityPolicy.calculateBonus(labSalary));
    
        System.out.println("Total Created Staff Objects: " + StaffMember.staffCount);

        System.out.println("\n--- Common Notices ---");
        lec1.showCommonNotice();
        lec2.showCommonNotice();
        lab.showCommonNotice();
    
    
    }
    
    
}
