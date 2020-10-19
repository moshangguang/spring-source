package org.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestAService {
    @Autowired
    private AService service;

    public AService getService() {
        return service;
    }
}
