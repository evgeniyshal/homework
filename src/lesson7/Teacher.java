package lesson7;


 public class Teacher implements Teachable {
    String subject;
    public Teacher(String name, int age) {
        super(name,age);
    }


    @Override
    public void toTeach(Student student) {
        student.toStudy();
    }
}

 /*Класс Учитель
        создается со следующими харатеристиками:
        имя (тип String)
        возраст (тип int)
        один преподаваемый предмет (тип String)
        и методом:
        учить(обучаемый) - тип данных обучаемого определить самостоятельно
         Методы учить() и учиться() необходимо описать в разных интерфейсах
        Общие свойства необходимо вынести в родительские классы (какие определить самостоятельно)*/
