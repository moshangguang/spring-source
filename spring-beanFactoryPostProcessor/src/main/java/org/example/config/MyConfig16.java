package org.example.config;

import org.example.filter.TestFilter;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@ComponentScan(
        value = "org.example.service",
        includeFilters = {
                @ComponentScan.Filter(type = FilterType.CUSTOM, classes = TestFilter.class)
        },
        useDefaultFilters = false
)
public class MyConfig16 {
}
