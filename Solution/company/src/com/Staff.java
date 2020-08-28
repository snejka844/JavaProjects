package com;

public class Staff extends Employee {
    private String workAt;

    public Staff(String name, double salary, String workAt) {
        super(name, salary);
        setWorkAt(workAt);
    }

    public Staff(Staff rhs) {
        this(rhs.getName(), rhs.getSalary(), rhs.workAt);
    }

    public final String getWorkAt() {
        return workAt;
    }

    public final void setWorkAt(String workAt) {
        this.workAt = workAt == null ? "Candidate" : workAt;
    }

    @Override
    public String toString() {
        return String.format("%s %s", super.toString(), workAt);
    }
}
