package lesson7;

public class School {
    private Teacher[] teachers = new Teacher[1];
    private Student[] students = new Student[3];
    Principal principal;
    Teacher teacher;
    Student student;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public School(String name) {
        setName(name);
    }

    public void dayPass() {
        principal.startLesson();
        for (int i = 0; i < teachers.length; i++) {
            if (teachers[i] != null) {
                for (int j = 0; j < students.length; j++) {
                    if (students[j] != null) {
                        if (teachers[i].getSubject().equals(students[j].getSubject())) {
                            teachers[i].toTeach(students[i]);
                        }
                    }
                }
            }
        }
        principal.endLesson();
    }
}

          /* }principal.endLesson();

       principal.startLesson();
        for (Teacher teacher : teachers) {
            if (teacher != null) {
                for (Student student : students) {
                    if (student != null && teacher.getSubject().equals(student.getSubject())) {
                            teacher.toTeach(student);



