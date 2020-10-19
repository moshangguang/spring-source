package org.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloService {
    @Autowired
    private WorldService worldService;
    private FooService fooService;

    public WorldService getWorldService() {
        return worldService;
    }

    public FooService getFooService() {
        return fooService;
    }

    public void setFooService(FooService fooService) {
        this.fooService = fooService;
    }
}
