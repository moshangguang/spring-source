package org.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

@ComponentScan(value = "org.example.dao", includeFilters = {@ComponentScan.Filter(classes = {a.class})})
public class MyConfig10 {
    public MyConfig10() {
        System.out.println("构造MyConfig10...");
    }


}

class a implements TypeFilter {

    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        return false;
    }
}