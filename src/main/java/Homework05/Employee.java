package Homework05;

public class Employee extends Person {
    double daySalary;
    Employee(String name, int age, boolean isMan, double daySalary){
        super(name, age, isMan);
        this. daySalary = daySalary;
    }
    double calculateOvertime(double hours) {
        if (age > 18) {
            return 0;
        } else {
            return (daySalary / 8) * 1.5 * hours;
        }
    }
    void showEmployeeInfo() {
        showPersonInfo();
        System.out.println("Employee's daily salary:" + daySalary);
    }
}
