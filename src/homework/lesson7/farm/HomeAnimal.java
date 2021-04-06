package lesson7.farm;

import java.util.Objects;

public class HomeAnimal {
    private String type;
    private int weight;
    private int speed;
    private int health;
    private String eatMark;
    private int healthCount;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getEatMark() {
        return eatMark;
    }

    public void setEatMark(String eatMark) {
        this.eatMark = eatMark;
    }

    public int getHealthCount() {
        return healthCount;
    }



    public void setHealthCount(int healthCount) {
        this.healthCount = healthCount;

    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HomeAnimal)) return false;
        HomeAnimal that = (HomeAnimal) o;
        return weight == that.weight && speed == that.speed && health == that.health && healthCount == that.healthCount && Objects.equals(type, that.type) && Objects.equals(eatMark, that.eatMark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, weight, speed, health, eatMark, healthCount);
    }
}
