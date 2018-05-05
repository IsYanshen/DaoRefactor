package testReflect;

import java.lang.reflect.Field;

public class Demo {
    public static void main(String[] args) {
        String path="testReflect.User";
        try {
            Class clazz=Class.forName(path);

            System.out.println( clazz.getDeclaredField("sname"));//getField 只能获取公开的属性；
            System.out.println( clazz.getName());
            System.out.println( clazz.getSimpleName());
            Field[] fields=clazz.getDeclaredFields();
            for (Field m:fields
                 ) {
                System.out.println(m);

            }


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }


    }
}
