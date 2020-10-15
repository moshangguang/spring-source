package org.example.beans;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
@DependsOn({"c"})
public class B {
    public B() {
        System.out.println("B construct...");
    }
}
