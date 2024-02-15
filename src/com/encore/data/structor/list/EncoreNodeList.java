package com.encore.data.structor.list;

public class EncoreNodeList {
    private EncoreNode head;

    public EncoreNodeList(int data) {
        this.head = new EncoreNode(data);
    }

    public void add(int data) {
        if (this.head == null) {
            // 연결 리스트의 헤더가 생성되지 않은 상태
            this.head = new EncoreNode(data);
        } else {
            // 연결되어지는 노드를 생성
            EncoreNode node = this.head;
            while (node.getNode() != null) {
                node = node.getNode();
            }
            node.setNode(new EncoreNode(data));
        }
    }

    public void remove(int remove_data) {
        // 헤더를 삭제
        if (this.head.getData() == remove_data) {
            EncoreNode temp = this.head;
            this.head = this.head.getNode();
            temp = null;
        } else {
            // 삭제할 데이터가 head가 아니라면?
            EncoreNode current = this.head;
            while (current.getNode() != null) {
                if (current.getNode().getData() == remove_data) {
                    // 현재 노드의 다음 노드가 삭제할 데이터를 가진 노드인 경우
                    EncoreNode temp = current.getNode();
                    current.setNode(temp.getNode()); // 현재 노드의 다음 노드를 다음 다음 노드로 설정
                    temp = null; // 삭제할 노드를 null로 만들어 참조를 끊음
                    return; // 삭제 완료 후 메서드 종료
                }
                // 다음 노드로 이동
                current = current.getNode();
            }
        }
    }

    public void desc() {
        EncoreNode node = this.head;
        while (node != null) {
            System.out.println("debug >>>> " + node.getData());
            node = node.getNode();
        }
    }
}
