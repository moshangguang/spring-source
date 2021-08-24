package org.example.config;

import org.example.annotations.HelloScan;
import org.example.filter.HelloScanFilter;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        value = "org.example.service",
        includeFilters = {
                @ComponentScan.Filter(
                        type = FilterType.ANNOTATION,
                        classes = {HelloScan.class}
                ),
        },
        useDefaultFilters = false
)
public class MyConfig14 {
}
