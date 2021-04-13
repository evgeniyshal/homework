package homework.coursework;

import java.time.LocalTime;

public enum MembershipType {
    ONE_TIME(new TimeRange("08:00", "22:00")) {
        @Override
        public boolean membershipCheck(String zone) {
            if(!getTimeRange().inRange(LocalTime.now())) {
                System.out.println("Сейчас " + LocalTime.now() + ", вы не можете посещать эту зону в это время");
                return false;
            } else {
                if ("pool".equals(zone) || "gym".equals(zone)) { // способ избежать NullPointerException если в переменной zone пришел null
                    return true;
                } else {
                    System.out.println("Ваш тип абонемента не позволяет посещать эту зону");
                    return false;
                }
            }
        }
    },

    DAY_TIME(new TimeRange("08:00", "16:00")) {
        @Override
        public boolean membershipCheck(String zone) {
            if(!getTimeRange().inRange(LocalTime.now())) {
                System.out.println("Сейчас " + LocalTime.now() + ", вы не можете посещать эту зону в это время");
                return false;
            } else {
                if ("gym".equals(zone) || "group".equals(zone)) {
                    return true;
                } else {
                    System.out.println("Ваш тип абонемента не позволяет посещать эту зону");
                    return false;
                }
            }
        }
    },

    FULL_TIME(new TimeRange("08:00", "22:00")) {
        @Override
        public boolean membershipCheck(String zone) {
            if (!getTimeRange().inRange(LocalTime.now())) {
                System.out.println("Сейчас " + LocalTime.now() + ", вы не можете посещать эту зону в это время");
                return false;
            } else {
                if ("gym".equals(zone) || "group".equals(zone) || "pool".equals(zone)) {
                    return true;
                } else {
                    System.out.println("Ваш тип абонемента не позволяет посещать эту зону");
                    return false;
                }
            }
        }
    };

    private TimeRange timeRange;

    MembershipType(TimeRange timeRange) {
        this.timeRange = timeRange;
    }

    public boolean membershipCheck(String zone) {
        return false;
    }

    public TimeRange getTimeRange() {
        return timeRange;
    }
}
//        Разовый. По разовому абонементу клиенты могут посещать бассейн и тренажерный зал с 8 до 22 часов.
//        Дневной. По данному абонементу клиенты могут посещать тренажерный зал и групповые занятия (но не бассейн) с 8 до 16 часов.
//        Полный. По данному абонементу клиенты могут посещать тренажерный зал, бассейн и групповые занятия с 8 до 22 часов.