package homework.coursework;

public enum Visit {
    ONE_TIME(14),ONE_DAY(8),FULL_TIME(14);
    private int hours;

    Visit(int hours) {
        this.hours = hours;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
}
