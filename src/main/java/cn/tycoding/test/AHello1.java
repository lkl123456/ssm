package cn.tycoding.test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface AHello1 {
    String value();
    String value3();
    String value2();
    String name1();
    String name2();
    String value4();
    
    String  name3() default  "124";
    
}
