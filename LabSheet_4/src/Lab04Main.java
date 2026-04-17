public class Lab04Main {
    public static void main(String[] args) {
      
        Lecturer lec = new Lecturer("Dr. Sunimal", "L100", "Computing", 75000, 12);
        
        LabAssistant lab = new LabAssistant("Mr. Perera", "A200", "IT", 45000, 10);
        
        System.out.println("--- Lecturer Details ---");
        lec.displayStaffDetails();

        System.out.println("\n--- Lab Assistant Details ---");
        lab.displayLabAssistantDetails();
    
    }
    
}
