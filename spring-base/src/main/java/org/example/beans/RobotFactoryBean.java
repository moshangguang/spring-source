package org.example.beans;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class RobotFactoryBean implements FactoryBean<Robot> {
    @Override
    public Robot getObject() throws Exception {
        return new Robot();
    }

    @Override
    public Class<?> getObjectType() {
        return Robot.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
