package ua.goit.java;

/**
 * Created by 7 on 23.06.2016.
 */
public class Person {

    private String sex;
    private String name;
    private int age;

    public Person(String sex, String name, int age) {
        this.sex = sex;
        this.name = name;
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
