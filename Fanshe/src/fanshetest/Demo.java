package fanshetest;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/*
使用反射读取注解的信息 模拟处理注解信息的流程

 */
public class Demo {
    public static void main(String[] args) {

        try {
            Class clazz=Class.forName("fanshetest.Student");//返回一个class对象
            //clazz 包含了Student类的全部信息
            //获得类的说有有效注解

            Annotation[] anno=clazz.getAnnotations();//获取该类Student的所有注解
            for (Annotation a:anno
                 ) {
                System.out.println(a);
            }
            //获得类指定注解的值
          Table tb= (Table) clazz.getAnnotation(Table.class);
            System.out.println(tb.value());
            //获得类的属性的值
            Field f=clazz.getDeclaredField("studentName");
            // getDeclaredField(String name):
            // 获取类特定的方法，name参数指定了属性的名称
            TestField tf=f.getAnnotation(TestField.class);
            System.out.println(tf.columnName()+"--"+tf.length()+"--"+tf.type());
            //根据获得的 字段信息 拼出sql语句 然后使用jdbc执行 在数据库中生成相关的表
        }catch (ClassNotFoundException e){
            e.printStackTrace();

        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

    }
}
