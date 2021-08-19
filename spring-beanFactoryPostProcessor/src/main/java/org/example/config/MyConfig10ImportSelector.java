package org.example.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyConfig10ImportSelector implements ImportSelector {
    public MyConfig10ImportSelector() {
        System.out.println("构造MyConfig10ImportSelector...");
    }

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{MyConfig10.class.getName()};
    }
}
