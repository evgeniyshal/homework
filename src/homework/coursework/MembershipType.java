package homework.coursework;

public enum MembershipType {
    ONE_TIME(new TimeRange("08:00", "22:00")),
    DAY_TIME(new TimeRange("08:00", "16:00")),
    FULL_TIME(new TimeRange("08:00", "22:00"));

    private TimeRange timeRange;

    MembershipType(TimeRange timeRange) {
        this.timeRange = timeRange;
    }

    public TimeRange getTimeRange() {
        return timeRange;
    }
}
//        Разовый. По разовому абонементу клиенты могут посещать бассейн и тренажерный зал с 8 до 22 часов.
//        Дневной. По данному абонементу клиенты могут посещать тренажерный зал и групповые занятия (но не бассейн) с 8 до 16 часов.
//        Полный. По данному абонементу клиенты могут посещать тренажерный зал, бассейн и групповые занятия с 8 до 22 часов.