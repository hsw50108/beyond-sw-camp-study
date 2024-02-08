package workshop.workshop6.grade.domain;

import lombok.Getter;

@Getter
public class Student extends Employee  {
    private int oracle;
    private int java;
    private int servlet;
    public Student() {
        super();
    }
    public Student(String name, String employeeNo, int age, int oracle, int java, int servlet) {
        super(name, employeeNo, age);
        this.oracle = oracle;
        this.java = java;
        this.servlet = servlet;
    }

    public int getTotal() {
        return java + oracle + servlet;
    }

    public double getAverage() {
        return (double) (java + oracle + servlet) / 3;
    }

    @Override
    public String empInfo() {
        return super.empInfo() +  "oracle=" + oracle + ", java=" + java + ", servlet= " + servlet;
    }


}
