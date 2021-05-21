package homework.coursework.fitness;

import java.time.LocalTime;

public class TimeRange {

    private LocalTime begin;
    private LocalTime end;

    public TimeRange(String begin, String end) {
        this.begin = LocalTime.parse(begin);
        this.end = LocalTime.parse(end);
    }

    public boolean inRange(LocalTime currentTime) {
        return currentTime.isAfter(begin) && currentTime.isBefore(end);
    }
}
