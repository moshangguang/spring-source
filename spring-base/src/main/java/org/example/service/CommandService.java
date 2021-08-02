package org.example.service;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class CommandService {
    private int i = 1;

    public void add() {
        i++;
    }
}
