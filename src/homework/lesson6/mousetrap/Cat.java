package homework.lesson6.mousetrap;

public class Cat {
    private int speed = (int)(Math.random() * 24) + 1;
    private int weight = (int)(Math.random() * 9) + 1;
    private String name;
    private String color;
    private Mouse[] miceMass;

    public Mouse[] getMiceMass() {
        return miceMass;
    }

    public int getWeight() {
        return weight;
    }

    public void catchMouse (Mouse mouse) {
        if ( speed < mouse.getSpeed()) {
            System.out.println("Мышь убежала");

        } else {
            for (int i = 0; i < miceMass.length; i++) {
                if( miceMass[i] == null) {
                    miceMass[i] = mouse;
                    return;
                }
            }
            System.out.println("Массив мышей переполнен"); // эксепшн кидать не стал.
        }
    }
    public void catFight(Cat anotherCat) {
        if (this.weight > anotherCat.getWeight()) {
            for (int i = 0; i < getMiceMass().length; i++) {
                if(anotherCat.getMiceMass()[i] != null ) {
                    catchMouse(anotherCat.getMiceMass()[i]);
                }
            }
        }
    }
}
