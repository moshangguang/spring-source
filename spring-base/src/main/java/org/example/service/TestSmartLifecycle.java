package org.example.service;

import org.springframework.context.SmartLifecycle;
import org.springframework.stereotype.Component;

@Component
public class TestSmartLifecycle implements SmartLifecycle {
    private boolean isRun = false;

    @Override
    public void start() {
        isRun = true;
        System.out.println("TestSmartLifecycle start...");
    }

    @Override
    public boolean isAutoStartup() {
        return true;
    }

    @Override
    public void stop(Runnable callback) {
        System.out.println("TestSmartLifecycle stop callback...");
        //执行callback.run()可以让容器立即关闭，否则容器会等待30s再关闭
    }

    @Override
    public int getPhase() {
        return 0;
    }


    @Override
    public void stop() {
    }

    @Override
    public boolean isRunning() {
        return isRun;
    }

}
