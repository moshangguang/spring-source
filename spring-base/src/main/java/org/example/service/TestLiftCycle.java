package org.example.service;

import org.springframework.context.Lifecycle;
import org.springframework.stereotype.Component;

@Component
public class TestLiftCycle implements Lifecycle {
    private boolean isRun = false;

    @Override
    public void start() {
        isRun = true;
        System.out.println("TestLiftCycle start...");
    }

    @Override
    public void stop() {
        System.out.println("TestLiftCycle stop...");
    }

    @Override
    public boolean isRunning() {
        return true;
    }
}
