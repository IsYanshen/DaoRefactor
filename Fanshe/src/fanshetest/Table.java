package fanshetest;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
//修饰Student 类 表示类和表之间的转化
//类和哪个表对应 和表名对应
//一般情况 只有一个参数的时候起名 Value
@Target(value={ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Table {
    String value();

}
