package lesson7;

public class Student extends SchoolPerson, implements Educable {

    private String subjectMath;
    int knowledgeLevelCount = 0;

    public Student(String name, int age) {
        super(name, age);
    }

    public int getKnowledgeLevelCount() {
        return knowledgeLevelCount;
    }
}
/*Класс Ученик
        создается со следующими характеристиками:
        имя (тип String)
        возраст (тип int)
        один изучаемый предмет (тип String)
        уровень знаний (тип int)
        и методом:
        учиться() - уровень знаний ученика повышается
          Методы учить() и учиться() необходимо описать в разных интерфейсах
        Общие свойства необходимо вынести в родительские классы (какие определить самостоятельно)
*/