package testReflect;

public class User {
    private int id;
    private int age;
    private String sname;

    public int getId() {
        return id;
    }

    public User(int id, int age, String sname) {
        this.id = id;
        this.age = age;
        this.sname = sname;
    }

    public void setId(int id) {

        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }
}
