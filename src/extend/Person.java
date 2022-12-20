package extend;

public class Person {
    private String name;
    private int age;
    private String sex;

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setSex(String sex){
        this.sex = sex;
    }

    public String getName(){
        return this.name;
    }

    public String getSex(){
        return this.sex;
    }

    public int getAge(){
        return this.age;
    }
}
