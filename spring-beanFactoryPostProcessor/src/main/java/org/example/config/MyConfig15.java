package org.example.config;

import org.example.annotations.HelloScan;
import org.example.service.ITestService;
import org.example.service.Test5Service;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@ComponentScan(
        value = "org.example.service",
        includeFilters = {
                @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {ITestService.class, Test5Service.class})
        },
        useDefaultFilters = false
)
public class MyConfig15 {
}
