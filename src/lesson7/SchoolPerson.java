package lesson7;

public class SchoolPerson {
    private String name;
    private int age;

    public SchoolPerson(String name, int age) {
        setName(name);
        setAge(age);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        //TODO Написать валидацию данных
        this.name = name;
    }

    public void setAge(int age) {
        //TODO Написать валидацию данных
        this.age = age;
    }
}
