package homeworkLesson2;

public class Task5 {
    public static void main(String[] args) {


        while (true) {
            int random = (int) ((Math.random() * 499) +1);

             if (random >= 25 && random <= 200) {
                System.out.println("число " + random + " содержится в интервале (25;200)." );
             } else  {
                 System.out.println("число " + random + " не содержится в интервале (25;200)." );

             }
            break;
        }
    }
}
