package fanshetest;
@Table("tb_student")//定义表名
//一个完整的注解 需要三步 1、定义注解本身 2、类里面使用这个注解
// 3、需要一个解析程序 把注解读取出来
public class Student {
    @TestField(columnName = "id",type = "int",length = 10)//表里面字段的属性
    private int id;
    @TestField(columnName = "sname",type = "varchar",length = 10)
    private  String studentName;
    @TestField(columnName = "age",type = "int",length = 3)
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
