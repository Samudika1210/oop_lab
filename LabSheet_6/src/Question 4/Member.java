/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Member {
    private String memberName;
    private String membershipType;
    private boolean newsletterSelected;
    private int numberOfMonths;

    public Member(String memberName, String membershipType, boolean newsletterSelected, int numberOfMonths) {
        this.memberName = memberName;
        this.membershipType = membershipType;
        this.newsletterSelected = newsletterSelected;
        this.numberOfMonths = numberOfMonths;
    }

    public String getMemberName() { return memberName; }
    public String getMembershipType() { return membershipType; }
    public int getNumberOfMonths() { return numberOfMonths; }

    public double getMonthlyFee() {
        if (membershipType.equals("Premium")) {
            return 2500;
        } else {
            return 1000;
        }
    }

    public String getNewsletterText() {
        return newsletterSelected ? "Yes" : "No";
    }

    public double getMembershipFee() {
        double total = getMonthlyFee() * numberOfMonths;
        if (newsletterSelected) {
            total += 200;
        }
        return total;
    }
}
