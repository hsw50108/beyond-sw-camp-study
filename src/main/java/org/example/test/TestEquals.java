package org.example.test;

public class TestEquals {



    private String name;

    public TestEquals() {
    }

    public TestEquals(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        TestEquals testEquals = new TestEquals();
//        if (testEquals.getName().equals("test")) {
//            System.out.println("same");
//        } else {
//            System.out.println("불일치");
//        }

//        if ("test".equals(testEquals.getName())) {
//            System.out.println("same");
//        } else {
//            System.out.println(" 불일치");
//        }


    }



}
