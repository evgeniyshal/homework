package homework.lesson7;


 public class Teacher extends SchoolPerson implements Teachable {
     String subject;

     public Teacher(String name, int age) {
        super(name,age);
     }

    public String getSubject() {
         return subject;
     }

    @Override
    public void toTeach(Student student) {
        student.toStudy();
    }
}


