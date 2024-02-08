package workshop.workshop6.grade;

import workshop.workshop6.grade.view.GradeView;

public class GradeMain {
    public static void main(String[] args) {
        GradeView gradeView = new GradeView();
        gradeView.init();
        gradeView.totalGrade();
        gradeView.display();
    }
}
