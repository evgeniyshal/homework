package homework.lesson7;

public class Student extends SchoolPerson implements Educable {

    private String subject;
    int knowledgeLevelCount = 0;

    public Student(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    private int getKnowledgeLevelCount() {
        return knowledgeLevelCount;
    }

    public void setKnowledgeLevelCount(int knowledgeLevelCount){
        this.knowledgeLevelCount = knowledgeLevelCount;
    }

    @Override
    public void toStudy() {
        knowledgeLevelCount++;

    }

}
