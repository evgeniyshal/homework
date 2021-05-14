package homework.lesson23.lesson23;

@Component(fileName = "point.properties", version = 2)
public class Point {
    @Required
    private int x;
    @Required
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
