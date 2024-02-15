package com.encore.data.structor.stack;

import java.util.EmptyStackException;

public class EncoreStack {
    private int[] stackAry;
    private int top;

    public EncoreStack() {
        stackAry = new int[6];
        top = -1;
    }

    public void push(int data) {
        stackAry[++top] = data;
    }

    public int pop() {
        if (top == -1) {
            throw new EmptyStackException();
        }
        return stackAry[top--];
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    // 마지막 인덱스 값을 리턴
    public int peek() {
        if (top == -1) {
            throw new EmptyStackException();
        }
        return stackAry[top];
    }

    // 스택 프린트
    public void prtStack() {
        for (int idx = top ; idx >= 0; --idx) {
            System.out.print(stackAry[idx] + " ");
        }
        System.out.println();
    }

}



