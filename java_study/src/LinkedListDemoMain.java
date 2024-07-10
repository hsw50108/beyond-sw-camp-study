import com.encore.data.structor.list.EncoreNodeList;

import java.io.*;

public class LinkedListDemoMain {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("데이터를 입력하세요 : ");
        int data = Integer.parseInt(br.readLine());

        // LinkedList 의 헤더를 생성
        EncoreNodeList mgr = new EncoreNodeList(data);
        while (true) {
            System.out.println("메뉴를 선택하세요 ");
            System.out.println("1. 연결리스트 데이터 출력 ");
            System.out.println("2. 연결리스트 데이터 추가 ");
            System.out.println("3. 연결리스트 데이터 삭제 ");
            System.out.println("99. 프로그램 종료 ");
            System.out.print("원하시는 번호를 입력 : ");
            int number = Integer.parseInt(br.readLine());
            switch (number) {
                case 1:
                    System.out.println(">>> LinkedList 데이터 출력 <<<");
                    mgr.desc();
                    break;
                case 2:
                    System.out.println(">>> LinkedList 데이터 추가 <<<");
                    int add_data = Integer.parseInt(br.readLine());
                    mgr.add(add_data);
                    break;
                case 3:
                    System.out.println(">>> LinkedList 데이터 삭제 <<<");
                    // 삭제할 데이터 입력
                    int remove_data = Integer.parseInt(br.readLine());
                    mgr.remove(remove_data);
                    break;
                default:
                    System.exit(0);
            }
        }
    }

}


