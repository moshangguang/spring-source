package org.example.service;

import org.example.annotation.Instance;

public class HelloService {
    @Instance
    private WorldService worldService;

    public WorldService getWorldService() {
        return worldService;
    }
}
