package field;
import java.lang.reflect.Field;
public class ReflectDemoTest {


    // 这里说的Field都是 类 身上的，不是实例上的
    public static void main(String[] args) throws Exception {
        FieldDemoBean pt1 = new FieldDemoBean(3, 5, "ba", "ab");
        // 得到一个字段
        Field fieldB = pt1.getClass().getField("b"); // b 是变量名
        // fieldB和pt1根本没有什么关系，你看，是pt1.getClass()，是 字节码 啊
        // 不是pt1对象身上的变量，而是类上的，要用它取某个对象上对应的值


        System.out.println(fieldB.get(pt1)); // 这才是5


        Field fieldA = pt1.getClass().getDeclaredField("a"); // 这个管你公的私的，都拿来
        fieldA.setAccessible(true);// 添加访问权限，才能访问私有属性， 不然会报错
        System.out.println(fieldA.get(pt1));


        swapString(pt1);
    }


    // 　　做一个实例将把一个类里所有String类型的字段里的值 b 变 a
    private static void swapString(FieldDemoBean pt1)
            throws IllegalArgumentException, IllegalAccessException {
        // get all fields
        Field[] fields = pt1.getClass().getFields();
        for (Field field : fields) {
            // 我说的是String 类型的字段，当然要选择一下
            // if(field.getType().equals(String.class)) {
            // 字节码都是一份的，干什么用equals啊
            if (field.getType() == String.class) {
                String oldValue = (String) field.get(pt1);
                String newValue = oldValue.replace('b', 'a');
                // 改 对象的字段
                field.set(pt1, newValue);


            }
        }


        System.out.println(pt1.c);
        System.out.println(pt1.d);
    }
}