package homework.coursework;

public class Fitness {

    private Membership[] memberships;
    private int membershipCount = 0;

    public Fitness() {
        memberships = new Membership[20];
    }

    public void addMembership(Membership membership) {
        if (membershipCount == memberships.length) {
            System.out.println("Извините, в этой зоне мест нет");
        } else {
            System.out.println("Проходите");
            memberships[membershipCount] = membership; // складываем в массив абонементы, без цикла? если нам не нужна проверка на null.
            membershipCount++;
        }
    }
}
