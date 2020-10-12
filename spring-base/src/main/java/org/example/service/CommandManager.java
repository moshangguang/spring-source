package org.example.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class CommandManager implements ApplicationContextAware {
    private ApplicationContext applicationContext;
    @Autowired
    private CommandService commandService;

    public CommandService getCommandService() {
        return commandService;
    }

    //方法注入
    public CommandService createCommandService() {
        return applicationContext.getBean(CommandService.class);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
