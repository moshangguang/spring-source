package org.example.filter;

import org.example.annotations.HelloScan;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.AnnotationTypeFilter;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;
import java.lang.reflect.AnnotatedType;

public class HelloScanFilter implements TypeFilter {
    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        if (!metadataReader.getClassMetadata().getClassName().contains("Test2")) {
            return false;
        }
        try {
            Class<?> aClass = Class.forName(metadataReader.getClassMetadata().getClassName());
            return aClass.getAnnotation(HelloScan.class) != null;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return false;
    }
}
