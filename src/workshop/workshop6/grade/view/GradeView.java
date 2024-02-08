package workshop.workshop6.grade.view;

import workshop.workshop6.grade.domain.Employee;
import workshop.workshop6.grade.domain.Student;

public class GradeView {

    private final Employee[] empAry;
    private int idx;

    // 과목별 총점 담을 수 있는 변수
    private int totalOracleScore;
    private int totalJavaScore;
    private int totalServletScore;

    public GradeView() {
        empAry = new Employee[5];
    }

    public void init() {
        empAry[idx++] = new Student("kim", "10000", 22, 100, 100, 100);
        empAry[idx++] = new Student("lee", "10001", 23, 20, 20, 20);
        empAry[idx++] = new Student("park", "10002", 24, 30, 30, 30);
        empAry[idx++] = new Student("choi", "10003", 25, 40, 40, 40);
        empAry[idx++] = new Student("steve", "10004", 26, 50, 50, 50);
    }

    public void totalGrade() {
        for (int i = 0; i < empAry.length; i++) {
            Employee obj = empAry[i];
            totalOracleScore += ((Student) obj).getOracle();
            totalJavaScore += ((Student) obj).getJava();
            totalServletScore += ((Student) obj).getServlet();
        }

    }

    public void display() {
        System.out.println("번호\t이름\t오라클\t자바\t서블릿\t총점\t평균");
        System.out.println("=======================================");

        for (int i = 0; i < empAry.length; i++) {
            Employee obj = empAry[i];
            System.out.println((i + 1) + " " + empAry[i].getName() + " "
                    + ((Student) obj).getJava() + " "
                    + ((Student) obj).getServlet() + " "
                    + ((Student) obj).getOracle() + " "
                    + ((Student) obj).getTotal() + " "
                    + ((Student) obj).getAverage()
            );
        }

        System.out.println("=======================================");
        System.out.println("총점(오라클, 자바, 서블릿) : " + totalOracleScore + "\t" + totalServletScore + "\t" + totalJavaScore);
    }


}
