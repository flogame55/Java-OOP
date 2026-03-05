package com.library.lab05;

public class Member {
    private String memberId;
    private String memberName;
    private int borrowTime;
    private MembershipStrategy membershipStrategy;

    public Member(String memberId, String memberName, MembershipStrategy membershipStrategy) {
        this.memberId = memberId;
        this.memberName = memberName;
        this.borrowTime = 0;
        this.membershipStrategy = membershipStrategy;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public int getBorrowTime() {return borrowTime;}

    public void setBorrowTime(int borrowTime) {this.borrowTime = borrowTime;}

    public MembershipStrategy getMembershipStrategy() {
        return membershipStrategy;
    }

    public void setMembershipStrategy(MembershipStrategy membershipStrategy) {
        this.membershipStrategy = membershipStrategy;
    }

    public void displayMemberInfo() {
        System.out.println("\n--- Member Information ---");
        System.out.println("ID: " + memberId);
        System.out.println("Name : " + memberName);
        System.out.println("Membership Type: " + membershipStrategy.getMembershipType());
        System.out.println("Membership Cost: " + membershipStrategy.getMembershipCost());
        System.out.println("Borrow Limit: " + (membershipStrategy.hasUnlimitedBorrowing() ? "Unlimited" : membershipStrategy.getBorrowLimit()));
        System.out.println("Currently Borrowed: " + borrowTime);
        System.out.println("Loan Period: " + membershipStrategy.getLoanPeriodDays() + " days");
    }

    public double calculateLateFee(double baseFee) {
        return  membershipStrategy.applyLateFeeDiscount(baseFee);
    }
}



