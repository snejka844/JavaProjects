package com;

public class StaffAppointEventArgs {
    private Staff newMember;
    private double newMemberSalary;

    public StaffAppointEventArgs(Staff newMember, double newMemberSalary) {
        setNewMember(newMember);
        setNewMemberSalary(newMemberSalary);
    }

    public final Staff getNewMember() {
        return newMember;
    }

    public final void setNewMember(Staff newMember) {
        this.newMember = newMember == null ? new Staff(null, -1, null) : new Staff(newMember);
    }

    public final double getNewMemberSalary() {
        return newMemberSalary;
    }

    public final void setNewMemberSalary(double newMemberSalary) {
        this.newMemberSalary = newMemberSalary < 0 ? 1000 : newMemberSalary;
    }
}
