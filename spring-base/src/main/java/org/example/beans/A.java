package org.example.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class A implements InitializingBean, DisposableBean {
    @Override
    public void destroy() throws Exception {
        System.out.println("A destroy...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("A afterPropertiesSet...");
    }

    @PostConstruct
    public void aaa() {
        System.out.println("A aaa...");
    }

    @PreDestroy
    public void bbb() {
        System.out.println("A bbb...");
    }

    public void ccc() {
        System.out.println("A ccc...");
    }

    public void ddd() {
        System.out.println("A ddd...");
    }
}
