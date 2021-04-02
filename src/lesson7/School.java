package lesson7;

public class School {
    private final String name = "High School";

    private Teacher[] teachers = new Teacher[1];
    private Student[] students = new Student[3];


    public void dayPass(Principal principal,Teacher teacher) {
        principal.startLesson();
        teacher.toTeach();
        principal.endLesson();

    }


    /*  Класс Школа
    создается со следующими харатеристиками:
    название - задается при создании объекта и не может быть изменено в последствии
    директор - школа не может функционировать без директора
    учителя[] - массив
    ученики[] - массив
    и методом:
    день в школе() -
            1. директор объявляет начало занятий
        2. учителя учат учеников (предмет учителя и ученика должны совпадать)
        3. директор объявляет окончание занятий*/
}
