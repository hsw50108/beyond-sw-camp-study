package namecard.view;

import java.util.Scanner;

public class NameCardView {

    public void display() {
        System.out.println("<명함관리 초기화면>");
        System.out.println("[현재, 입력된 내용이 없습니다!]");
        System.out.println("명함관리 [P(revious), N(ext), I(nsert), U(pdate), D(elete)]?");

        System.out.print("원하시는 서비스를 입력해주세요 : ");
        Scanner scanner = new Scanner(System.in);
        String option = scanner.nextLine();
        
        switch (option) {
            case "P" :
                previousPage();
                break;
            case "N":
                nextPage();
                break;
            case "I":
                insertPage();
                break;
            case "U":
                updatePage();
                break;
            case "D":
                deletePage();
                break;
        }
    }

    private void deletePage() {
    }

    private void updatePage() {
        
    }

    private void insertPage() {
        
    }

    private void nextPage() {
        
    }

    private void previousPage() {
        
    }
}
