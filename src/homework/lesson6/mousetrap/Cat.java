package homework.lesson6.mousetrap;

import java.util.Arrays;

public class Cat {

    private static final String[] catNames =
            new String[] {"Тема", "Тиша", "Ася", "Барсик", "Вонючка", "Хлебушек", "Сырок"};

    private final int speed = (int)(Math.random() * 24) + 1;
    private final int weight = (int)(Math.random() * 9) + 1;
    private String name;
    private String color;
    private final Mouse[] miceMass = new Mouse[100];
    private int count;

    public Cat() {
        name = catNames[(int) (Math.random() * catNames.length)];
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Mouse[] getMiceMass() {
        return miceMass;
    }

    public int getWeight() {
        return weight;
    }
    public void resetMice() {
        Arrays.fill(miceMass, null);
        count = 0;
    }

    public void catchMouse (Mouse mouse) {
        if ( speed < mouse.getSpeed()) {
            System.out.println("Мышь убежала");

        } else if (count == 100) {
            System.out.println("Массив мышей переполнен"); // эксепшн кидать не стал.

        } else {
            for (int i = 0; i < miceMass.length; i++) {
                if( miceMass[i] == null) {
                    miceMass[i] = mouse;
                    count++;
                    break;
                }
            }
        }
    }

    public void catFight(Cat anotherCat) {
        if (this.weight > anotherCat.getWeight() && anotherCat.getCount() > 0) {
            for (int i = 0; i < getMiceMass().length; i++) {
                if(anotherCat.getMiceMass()[i] != null ) {
                    catchMouse(anotherCat.getMiceMass()[i]);
                }
            }
           anotherCat.resetMice();
        }
    }
}
