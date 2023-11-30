package org.example.hw2;

public class Main {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        s1.setName("s1");
        System.out.println(s1.getName());
        Singleton s2 = Singleton.getInstance();
        System.out.println(s2.getName());
        s2.setName("s2");
        System.out.println(s1.getName());
    }
}
