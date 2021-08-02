package org.example.service;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.net.InetSocketAddress;

public class SyntheticTest {
    public void test() {
        Inner inner = new Inner();
        System.out.println(inner.i);
    }

    class Inner {
        private Inner() {
        }

        private int i;
    }

    public static void main(String[] args) {
        for (Constructor<?> declaredConstructor : Inner.class.getDeclaredConstructors()) {
            System.out.println(declaredConstructor.getName());
            for (Parameter parameter : declaredConstructor.getParameters()) {
                System.out.println("parameter type：" + parameter.getType());
            }
            System.out.println("-----------");
        }
        for (Constructor<?> declaredConstructor : Inner.class.getDeclaredConstructors()) {
            System.out.println(declaredConstructor.getName());
        }
    }
}
