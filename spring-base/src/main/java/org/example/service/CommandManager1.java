package org.example.service;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public abstract class CommandManager1 {
    @Lookup
    public abstract CommandService createCommandService();
}
