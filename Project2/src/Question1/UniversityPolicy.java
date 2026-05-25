public final class UniversityPolicy {
    public static final String UNIVERSITY_NAME = "Global University of Technology";
    public static final double BONUS_RATE = 0.05;
    
    public static void showPolicyHeader() {
        System.out.println("====================================");
        System.out.println("   UNIVERSITY PAYMENT POLICY   ");
        System.out.println("====================================");
    }
    
    public static double calculateBonus(double monthlyPayment) {
        return monthlyPayment * BONUS_RATE;
    }
    
    
}
