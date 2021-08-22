package org.example.filter;

import org.example.annotations.HelloScan;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

public class HelloScanFilter implements TypeFilter {
    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {

        boolean has = metadataReader.getAnnotationMetadata().hasAnnotation(HelloScan.class.getName());
        return has;
    }
}
