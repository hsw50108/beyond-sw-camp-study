package com.encore.IODemo;

import com.encore.hms.domain.StudentDto;
import com.encore.hms.domain.sup.Person;
import com.encore.stream.EncoreException;

import java.io.*;
import java.util.Scanner;

public class IODemo {
   /* public String inputStr() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input Message : ");
        String data = reader.readLine();
        return data;
    }*/

    public int inputInt() {
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

    // 파일 출력 기능
    public boolean outputFile() {
        boolean flag = false;

        Scanner scan = new Scanner(System.in);
        System.out.print("Input : ");
        String msg = scan.nextLine();

        // 콘솔에서 입력한 데이터를 파일로 저장
        File file = new File("C://file//testWriter.txt");
        FileWriter writer = null;
        BufferedWriter bw = null;
        try {
            writer = new FileWriter(file);
            bw = new BufferedWriter(writer);
            bw.write(msg);
            flag = true;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return flag;
    }

    public boolean outputObjFile() {
        boolean flag = false;

        Person[] perAry = new Person[10];
        int idx = 0;

        perAry[idx++] = new StudentDto("dongwook", 20, "fkfk", "20114");
        perAry[idx++] = new StudentDto("dongwook", 20, "fkfk", "20114");
        perAry[idx++] = new StudentDto("dongwook", 20, "fkfk", "20114");

        // 객체가 가지고 있는 정보를 파일로 저장
        File file = new File("C://file//testWriter.txt");
        FileWriter writer = null;
        BufferedWriter bw = null;
        try {
            writer = new FileWriter(file);
            bw = new BufferedWriter(writer);
            for (int i = 0; i < perAry.length; i++) {
                if (perAry[i] != null) {
                    bw.write(perAry[i].getName() + " : " + perAry[i].getAge() + " : " + perAry[i].getAddress());
                    bw.newLine();
                }
            }
            flag = true;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return flag;
    }

    public void outputSerializable() {
//        String msg = "난 직력화된 객체여서 바이너리 형태로 저장이 가능함";
//        StudentDto stu = new StudentDto("dongwook", 20, "fion", "121");
        Person[] perAry = new Person[10];

        int idx = 0;

        perAry[idx++] = new StudentDto("dongwook", 20, "fkfk", "20114");
        perAry[idx++] = new StudentDto("dongwook", 20, "fkfk", "20114");
        perAry[idx++] = new StudentDto("dongwook", 20, "fkfk", "20114");

        FileOutputStream fis = null;
        ObjectOutputStream oos = null;
        try {
            fis = new FileOutputStream("c:/file/serial.txt");
            oos = new ObjectOutputStream(fis);
            oos.writeObject(perAry);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void inputSerializable() {
        String msg = null;
        FileInputStream fis = null;
        ObjectInputStream oos = null;

        try {
            fis = new FileInputStream("c:/file/serial.txt");
            oos = new ObjectInputStream(fis);
//            msg = (String) oos.readObject();
//            System.out.println(msg);
            Person[] perAry = (Person[]) oos.readObject();
            for (int i = 0; i < perAry.length; i++) {
                if (perAry[i] != null) {
                    System.out.println(perAry[i].printInfo());
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }





}
