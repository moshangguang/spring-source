package org.example.config;

import org.example.annotations.HelloScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@ComponentScan(
        value = "org.example.service",
        includeFilters = {
                //@ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {HelloScan.class}),//<1>
                @ComponentScan.Filter(HelloScan.class),//<2>
        },
        useDefaultFilters = false
)
public class MyConfig14 {
}
