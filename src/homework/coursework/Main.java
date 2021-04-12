package homework.coursework;

import java.time.LocalDateTime;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        MemberInfo memberInfo1 = new MemberInfo("Антон", "Алексеев", 19);
        Membership membership1 = new Membership(MembershipType.ONE_TIME,
                LocalDateTime.of(2020, Month.OCTOBER, 15, 11, 22), memberInfo1);


        MemberInfo memberInfo2 = new MemberInfo("Алексей", "Иванов",25);
        Membership membership2 = new Membership(MembershipType.DAY_TIME,
                LocalDateTime.of(2020, Month.JULY, 30, 14, 22), memberInfo2);

        MemberInfo memberInfo3 = new MemberInfo("Андрей", "Петров",30);
        Membership membership3 = new Membership(MembershipType.FULL_TIME,
                LocalDateTime.of(2020, Month.JANUARY, 16, 18, 31), memberInfo3);

        FitnessClub fitnessClub = new FitnessClub();

        fitnessClub.membershipCheck(membership1, "gym");
        fitnessClub.membershipCheck(membership2, "pool");
        fitnessClub.membershipCheck(membership3, "group");

    }
}
/*Задача «Фитнес»
        В фитнес клубе есть три типа абонементов:
        Разовый. По разовому абонементу клиенты могут посещать бассейн и тренажерный зал с 8 до 22 часов.
        Дневной. По данному абонементу клиенты могут посещать тренажерный зал и групповые занятия (но не бассейн) с 8 до 16 часов.
        Полный. По данному абонементу клиенты могут посещать тренажерный зал, бассейн и групповые занятия с 8 до 22 часов.

        Каждый абонемент хранит дату регистрации (текущая дата) и дату окончания регистрации.
        Каждый абонемент хранит информацию о владельце. Данные о владельце: имя, фамилия, год рождения.

        Фитнес содержит информацию об абонементах:
        которые зарегистрированы в данный момент в тренажерном зале;
        абонементах, которые зарегистрированы в бассейне;
        абонементах, которые зарегистрированы на групповых занятиях.

        В каждой зоне (бассейн, тренажерный зал, групповые занятия) одновременно может быть зарегистрировано 20 абонементов.

        Когда фитнес клуб закрывается, клиенты покидают его.

        Когда клиент приходит в фитнес клуб, он сообщает желаемую зону и показывает абонемент.
        Необходимо проверить может ли данный посетитель пройти в желаемую зону и пропустить его,
        если возможность существует; если посетитель не может пройти, необходимо сообщить ему причину.

        Посетитель не может пройти, если абонемент просрочен,
        если он пытается пройти в зону, которая не разрешена по его абонементу,
        если в зоне нет свободных мест.

        Абонемент не может быть зарегистрирован одновременно в нескольких зонах.

        Реализовать возможность вывода информации о посетителях:
        сначала посетителях тренажерного зала, потом бассейна, потом групповых занятий.

        Реализовать возможность выводить информацию в консоль каждый раз, когда клиент посещает фитнес клуб.
        Информация для вывода:
        Фамилия
        Имя
        Посещаемаю зона (бассейн/тренажерный зал/групповые занятия)
        Дата и время посещения*/
