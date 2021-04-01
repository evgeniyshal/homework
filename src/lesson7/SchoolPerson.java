package lesson7;

public class SchoolPerson {
    private String name;
    private int age;
    private Teacher[] teachers;
    private String [] students;

    public SchoolPerson(String name, int age) {
        setName(name);
        setAge(age);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
       if (name == null) throw new IllegalArgumentException("Null не может быть именем");
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 7) throw new IllegalArgumentException("Возраст школьника не может быть < 7");
        this.age = age;
    }
}
