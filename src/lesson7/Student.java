package lesson7;

public class Student extends HeadTeacher implements Educable {
    private String subject;

    int knowledgeLevelCount = 0;

    public int getKnowledgeLevelCount() {
        return knowledgeLevelCount;
    }

    public void setKnowledgeLevelCount(int knowledgeLevelCount) {
        this.knowledgeLevelCount = knowledgeLevelCount;
    }

    @Override
    public void toStudy() {

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