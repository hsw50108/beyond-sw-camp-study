package com.encore.IODemo;

import com.encore.stream.EncoreException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IODemo {
   /* public String inputStr() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input Message : ");
        String data = reader.readLine();
        return data;
    }*/

    public int inputInt()  {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input Message : ");
        int data = 0;
        try {
            data = Integer.parseInt(reader.readLine());
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return data;
    }

    public void first(int flag) throws EncoreException {
        System.out.println("first start");
        second(flag);
        System.out.println("first end");
    }

    public void second(int flag) throws EncoreException {
        System.out.println("second start");
        third(flag);
        System.out.println("second end");

    }

    public void third(int flag) throws EncoreException {
        System.out.println("third start");
        if (flag == 0) {
            throw new EncoreException("사용자 정의 예외 발생");
        }
        System.out.println("third end");

    }


}
