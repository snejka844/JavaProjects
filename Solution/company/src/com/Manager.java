package com;

import java.security.InvalidParameterException;

public class Manager extends Employee {
    private String manageDeptName;
    private StaffAppointHandler staffAppoint;

    public Manager(String name, double salary, String manageDeptName) {
        super(name, salary);
        setManageDeptName(manageDeptName);
    }

    public final String getManageDeptName() {
        return manageDeptName;
    }

    public final void setManageDeptName(String manageDeptName) {
        if(manageDeptName == null) {
            throw new InvalidParameterException("manageDeptName was null");
        }
        this.manageDeptName = manageDeptName;
    }

    public void addStaffAppointHandler(StaffAppointHandler staffAppoint) {
        if(staffAppoint == null) {
            throw new InvalidParameterException("staffAppoint was null");
        }
        this.staffAppoint = staffAppoint;
    }

    public void onStaffAppoint(Staff member, double newStaffMemberSalary) {
        staffAppoint.addStaff(new StaffAppointEventArgs(member, newStaffMemberSalary));
    }

    @Override
    public String toString() {
        return String.format("%s %s", super.toString(), manageDeptName);
    }
}
