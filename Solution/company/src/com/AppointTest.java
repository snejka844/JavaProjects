package com;

import java.util.Arrays;

public class AppointTest {
    public static void main(String[] args) {
        Manager boss = new Manager("boss1", 200_000, "Invoices");
        Staff[] candidates = {
                new Staff("n1", -1, null),
                new Staff("n2", 500, "Help desk")
        };

        System.out.println(boss);
        System.out.println(Arrays.toString(candidates));

        HRdepartment department = new HRdepartment(boss);
        StaffAppointHandler sah = department.getAppointHandler();
        boss.addStaffAppointHandler(sah);
        boss.onStaffAppoint(candidates[0], 1300);
        boss.onStaffAppoint(candidates[1], 1500);

        System.out.println(sah);
        System.out.println(Arrays.toString(candidates));
    }
}