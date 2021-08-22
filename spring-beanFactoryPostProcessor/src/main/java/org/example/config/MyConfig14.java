package org.example.config;

import org.example.filter.HelloScanFilter;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@ComponentScan(
        value = "org.example.service",
        useDefaultFilters = false,
        includeFilters = {
                @ComponentScan.Filter(
                        type = FilterType.CUSTOM,
                        classes = {HelloScanFilter.class}
                )
        })
public class MyConfig14 {
}
