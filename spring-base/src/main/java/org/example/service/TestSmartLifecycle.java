package org.example.service;

import org.springframework.context.SmartLifecycle;
import org.springframework.stereotype.Component;

@Component
public class TestSmartLifecycle implements SmartLifecycle {
    private boolean isRun = false;

    @Override
    public void start() {
        System.out.println("TestSmartLifecycle start...");
        isRun = true;
    }

    @Override
    public boolean isAutoStartup() {
        return true;
    }

    @Override
    public void stop(Runnable callback) {
        System.out.println("TestSmartLifecycle stop callback...");
        callback.run();//这行代码可以让容器回调的时候立即关闭，否则容器会等待30s在关闭
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
