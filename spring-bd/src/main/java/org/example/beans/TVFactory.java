package org.example.beans;

public class TVFactory {
    public TV createMi() {
        return new TV("小米");
    }

    public static TV createTCL() {
        return new TV("TCL");
    }
}

class TV {
    private final String name;

    public TV(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TV{" +
                "name='" + name + '\'' +
                '}';
    }
}
