package fanshetest;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
//用来说明属性的特性
@Target(value={ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)

public @interface TestField {
    String columnName(); //定义表里面的属性
    String type();
    int  length();
}
