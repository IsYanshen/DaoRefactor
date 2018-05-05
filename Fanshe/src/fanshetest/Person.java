package fanshetest;


public class Person{
    private int id;
    Person(){

    }
    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }



    public static void main(String[] args) throws ClassNotFoundException {
        Person p = new Person();
        //根据一个类的实例获得
        Class pclazz = p.getClass();
        System.out.println(pclazz.getName());
        //根据一个Class类的forName()方法获得 参数时这个类的权限定名称，也就是要带上具体的包名
        Class pclazz1 = Class.forName("fanshetest.Person");
        System.out.println(pclazz.getName());
        //通过类名.class获得
        Class pclazz2 = Person.class;
        System.out.println(pclazz.getName());
    }
}