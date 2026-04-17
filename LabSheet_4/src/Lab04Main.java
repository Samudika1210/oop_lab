public class Lab04Main {
    public static void main(String[] args) {
        
        UniversityPolicy.showPolicyHeader();
        System.out.println("University: " + UniversityPolicy.UNIVERSITY_NAME);
      
        Lecturer lec = new Lecturer("Dr. Sunimal", "L100", "Computing", 75000, 12);
        LabAssistant lab = new LabAssistant("Mr. Perera", "A200", "IT", 45000, 10);
        
        double lecSalary = lec.calculateMonthlyPayment();
        double labSalary = lab.calculateMonthlyPayment();
        
        System.out.println("--- Lecturer Details ---");
        lec.displayStaffDetails();

        System.out.println("\n--- Lab Assistant Details ---");
        lab.displayLabAssistantDetails();
        
        System.out.println("\n--- Bonus Estimation ---");
        System.out.println(lec.getFullName() + " Bonus: " + UniversityPolicy.calculateBonus(lecSalary));
        System.out.println(lab.getFullName() + " Bonus: " + UniversityPolicy.calculateBonus(labSalary));
    }
    
    
}
