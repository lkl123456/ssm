package cn.tycoding.test;

public class Zsingleton {
    private static Zsingleton ourInstance = new Zsingleton();

    public static Zsingleton getInstance() {
        return ourInstance;
    }

    private Zsingleton() {
    }
}
