package com.library.lab02;

public class Member {
    private String memberId;
    private String memberName;
    private int borrowTime;

    public Member(String memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
        this.borrowTime = 0;
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
}



