package org.example.service;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public class CommandManager2 {
    @Lookup
    public CommandService createCommandService() {
        return null;
    }
}
