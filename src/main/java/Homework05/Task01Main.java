package Homework05;

public class Task01Main {
    public static void main(String[] args) {
        Person[] people = new Person[10];
        people[0] = new Employee("John", 25, true, 70);
        people[1] = new Employee("Josh", 30, true,80);
        people[2] = new Employee("Alice", 20, false, 100);
        people[3] = new Employee("Alex", 33, false, 150);
        people[4] = new Employee("George", 22, true, 90);
        people[5] = new Student("Sarah", 15, false, 6.0);
        people[6] = new Student("Anna", 16, false, 5.8);
        people[7] = new Student("Anthony", 13, true, 5.5);
        people[8] = new Person("Bob", 14, true);
        people[9] = new Person("Kevin", 12, true);
    }
    for (Person person : Person people) {
        if (person instanceof Student) {
             ((Student) person).showStudentInfo();
        } else if (person instanceof Employee){
            ((Employee) person).showEmployeeInfo();
        } else {
            person.showPersonInfo();
        }
    }

        if (Person person1  instanceof Employee) {
            Employee employee = (Employee) person1;
            double overtimeSum = employee.calculateOvertime(2);
            System.out.println(Employee.name + " overtime sum for 2 hours");
        }

}
