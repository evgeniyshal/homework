package lesson7;

public class Principal extends SchoolPerson {

    public Principal(String name, int age) {
        super(name, age);
    }

    Principal principal = new Principal("Директор", 65);

    public void startLesson () {
        System.out.println("Звонок. Начало занятий");
    }
    public void endLesson () {
        System.out.println("Звонок. Конец занятий");
    }


}
/* Класс Директор
        создается со следующими харатеристиками:
        имя (тип String)
        возраст (тип int)
        и методами:
        объявить начало занятий()
        объявить окончание занятий занятий()*/