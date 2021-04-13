package homework.coursework;

import java.time.LocalDateTime;

public class FitnessClub {


    Membership[] gym = new Membership[20];
    Membership[] pool = new Membership[20];
    Membership[] groupLessons = new Membership[20];

    public void membershipCheck(Membership membership, String zone) {
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
