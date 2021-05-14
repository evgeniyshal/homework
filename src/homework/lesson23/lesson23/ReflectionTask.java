package homework.lesson23.lesson23;

import java.lang.reflect.Field;

public class ReflectionTask {

    public static String toString(Object o) {
        Field[] superFields = o.getClass().getSuperclass().getDeclaredFields();
        Field[] fields = o.getClass().getDeclaredFields();
        StringBuilder builder = new StringBuilder();

        for (Field superField : superFields) {
            superField.setAccessible(true);
            try {
                builder.append(superField.getName()).append(" ").append(superField.get(o)).append("\n");
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        for (Field field : fields) {
            field.setAccessible(true);
            try {
                builder.append(field.getName()).append(" ").append(field.get(o)).append("\n");
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        
        return builder.toString();
    }

    public static void main(String[] args) {
        Message message = new Message("Dreder");
        message.setSent();
        System.out.println(toString(message));

        Text text = new Text("Geka");
        text.setText("Hello");
        text.setSent();
        System.out.println(toString(text));
    }
}
