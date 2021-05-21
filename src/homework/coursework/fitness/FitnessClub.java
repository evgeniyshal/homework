package homework.coursework.fitness;

import java.time.LocalDateTime;

public class FitnessClub {

    Membership[] gym = new Membership[20];
    Membership[] pool = new Membership[20];
    Membership[] groupLessons = new Membership[20];

    public void membershipCheck(Membership membership, String zone) { // Проверка по времени вложена сюда
        if (membership.getExpireDate().isBefore(LocalDateTime.now())) {
            System.out.println("Ваш абонемент просрочен");
            return;
        }

        if (membership.getMembershipType().membershipCheck(zone)) {
            System.out.println("Проходите");
            if(!isInZoneCheck(gym, membership) && !isInZoneCheck(pool, membership)  && !isInZoneCheck(groupLessons,membership)) {
                addMembership(membership, zone);
            } else {
                System.out.println("Ваш абонимент зарегистрирован в другой зоне");
            }
        }
    }

    public void addMembership(Membership membership, String zone) { // добавление абонимента
        if ("gym".equals(zone)) {
            for (int i = 0; i < gym.length; i++) {
                if (gym[i] == null) {
                    gym[i] = membership;
                }
            }
        } else if ("pool".equals(zone)) {
            for (int i = 0; i < pool.length; i++) {
                if (pool[i] == null) {
                    pool[i] = membership;
                }
            }
        } else if ("groupLessons".equals((zone))) {
            for (int i = 0; i < groupLessons.length; i++) {
                if (groupLessons[i] == null) {
                    groupLessons[i] = membership;
                }
            }
        }
    }

    private boolean isInZoneCheck(Membership[] memberships, Membership membership) {
        for (int i = 0; i < memberships.length; i++) {
            if(membership.equals(memberships[i])) {

            }
        }
        return true;
    }
}



