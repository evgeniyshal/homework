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

        if (membership.getMembershipType().membershipCheck(zone) && "gym".equals(zone)) {
            gym.addMembership(membership);
        } else if (membership.getMembershipType().membershipCheck(zone) && "pool".equals(zone)) {
            pool.addMembership(membership);
        } else if (membership.getMembershipType().membershipCheck(zone) && "group".equals(zone)) {
            groupLessons.addMembership(membership);
        }
    }
}
