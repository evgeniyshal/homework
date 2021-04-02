package lesson7;

public class Student extends SchoolPerson implements Educable {

    private String subject;
    int knowledgeLevelCount = 0;

    public Student(String name, int age) {
        super(name, age);
    }

    public String getSubject() {
        return subject;
    }

    private int getKnowledgeLevelCount() {
        return knowledgeLevelCount;
    }
}
