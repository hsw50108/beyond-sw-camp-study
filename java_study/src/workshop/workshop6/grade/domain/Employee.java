package workshop.workshop6.grade.domain;

import lombok.Getter;
import lombok.ToString;

@Getter
public class Employee {
    private String name;
    private String employeeNo;
    private int age;

    public Employee() {
    }

    public Employee(String name, String employeeNo, int age) {
        this.name = name;
        this.employeeNo = employeeNo;
        this.age = age;
    }

    public String empInfo() {
        return "name=" + name + ", employeeNo=" + employeeNo + ", age= " + age;
    }

}
