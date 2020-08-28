package com;

import java.security.InvalidParameterException;
import java.util.ArrayList;

public class HRdepartment {
    private Manager manager;
    private ArrayList<Staff> staff;

    public HRdepartment(Manager manager) {
        setManager(manager);
        staff = new ArrayList<>();
    }

    public final Manager getManager() {
        return manager;
    }

    public final void setManager(Manager manager) {
        if (manager == null) {
            throw new InvalidParameterException("manager was null");
        }
        this.manager = manager;
    }

    public StaffAppointHandler getAppointHandler() {
        return new OnAction(manager.getManageDeptName());
    }

    @Override
    public String toString() {
        return String.format("%s %s", manager, staff);
    }




    private class OnAction implements StaffAppointHandler {
        private String appointDepartment;

        public OnAction(String appointDepartment) {
            setAppointDepartment(appointDepartment);
        }

        public void setAppointDepartment(String appointDepartment) {
            if(appointDepartment == null) {
                throw new InvalidParameterException("appointDepartment was null");
            }
            this.appointDepartment = appointDepartment;
        }

        @Override
        public void addStaff(StaffAppointEventArgs agrs) {
            agrs.getNewMember().setWorkAt(appointDepartment);
            // Set new salary
            agrs.getNewMember().setSalary(agrs.getNewMemberSalary());
            staff.add(agrs.getNewMember());
        }

        @Override
        public String toString() {
            return String.format("%s %s", HRdepartment.this.toString(), appointDepartment);
        }
    }
}
