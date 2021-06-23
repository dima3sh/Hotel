package org.azati.cources.entity;

public class Payroll {
    private Integer payroll_id;
    private Integer salary;
    private String bankAccount;

    public Payroll(Integer salary, String bankAccount, Integer payroll_id) {
        this.salary = salary;
        this.bankAccount = bankAccount;
        this.payroll_id = payroll_id;
    }

    public Integer getPayroll_id() {
        return payroll_id;
    }

    public Integer getSalary() {
        return salary;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    @Override
    public String toString() {
        return "Payroll{" +
                "payroll_id=" + payroll_id +
                "salary=" + salary +
                ", bankAccount='" + bankAccount + '\'' +
                '}';
    }
}
