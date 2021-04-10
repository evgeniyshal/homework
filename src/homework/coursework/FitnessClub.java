package homework.coursework;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class FitnessClub {

    private Gym gym = new Gym();
    private Pool pool = new Pool();
    private GroupLessons groupLessons = new GroupLessons();

    public void membershipCheck(Membership membership, String zone) {
        //TODO Реализовать проверку - не находится ли данный абонемент в одной из зон
        if (membership.getExpireDate().isBefore(LocalDateTime.now())) {
            System.out.println("Ваш абонемент просрочен");
            return;
        }

        switch (membership.getMembershipType()) {
            case ONE_TIME:
                if ("pool".equals(zone)) {
                   add(membership, pool);
                } else if ("gym".equals(zone)) {
                    add(membership, gym);
                } else {
                    System.out.println("Ваш тип абонемента не позволяет посещать эту зону");
                }
                break;
            case DAY_TIME:
                if ("gym".equals(zone)) {
                    add(membership, gym);
                } else if ("group".equals(zone)) {
                    add(membership, groupLessons);
                } else {
                    System.out.println("Ваш тип абонемента не позволяет посещать эту зону");
                }
                break;
            case FULL_TIME:
                if ("gym".equals(zone)) {
                    add(membership, gym);
                } else if ("group".equals(zone)) {
                    add(membership, groupLessons);
                } else if ("pool".equals(zone)) {
                    add(membership, pool);
                }
                break;
        }
    }

    private void add(Membership membership, Fitness fitness) {
        if (membership.getMembershipType().getTimeRange().inRange(LocalTime.now())) {
            fitness.addMembership(membership);
        } else {
            System.out.println("Сейчас " + LocalTime.now() +
                    ", вы не можете посещать эту зону в это время");
        }
    }
}
