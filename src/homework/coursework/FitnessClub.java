package homework.coursework;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class FitnessClub {

    //TODO добавить метод add (абонмент и желаемую зону)
    //TODO реализовать добавление масиив
    //TODO дописать проверку по времени
    Membership[] gym = new Membership[20];
    Membership[] pool = new Membership[20];
    Membership[] groupLessons = new Membership[20];

    public void membershipCheck(Membership membership, String zone) { // Проверка
        if (!membership.getMembershipType().membershipCheck(zone)) {
            System.out.println("Ваш абонемент не может попасть в желаемую зону");
            return;
        }
        if (membership.getExpireDate().isBefore(LocalDateTime.now())) {
            System.out.println("Ваш абонемент просрочен");
            return;
        }
        if(!membership.getMembershipType().getTimeRange().inRange(LocalTime.now())) {
            System.out.println("Вы пришли не в свое время");

        }
    }
    public void addMembership(Membership membership, String zone){ // добавление абонимента
        for (int i = 0; i < gym.length; i++) {
            gym[i] = membership;
        }
    }
}

