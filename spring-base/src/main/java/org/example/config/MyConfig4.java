package org.example.config;

import org.example.beans.MyImportBeanDefinitionRegistrar;
import org.springframework.context.annotation.Import;

@Import(MyImportBeanDefinitionRegistrar.class)
public class MyConfig4 {
}
