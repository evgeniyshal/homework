package homework.lesson23.lesson23;

import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Properties;

public class AnnotationMain {
    public static void main(String[] args) {
        // Инфо о времени выполнения получаем с помощью релфексии
        Class<Point> pointClass = Point.class;
        Annotation[] annotations = pointClass.getAnnotations();
        System.out.println(Arrays.toString(annotations));

        // проверка на наличие аннотаций
        if (pointClass.isAnnotationPresent(Component.class)) { // есть ли аннотация у pointClass проверка, если есть метод вернет True
            Component component = pointClass.getDeclaredAnnotation(Component.class);//ссылка на аннотацию
            System.out.println(component.fileName()); // получаем значение
            System.out.println(component.version());
        }

        Field[] fields = pointClass.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(Required.class)) {
                System.out.println(field.getType());
                System.out.println(field.getName());
            }
        }
        Properties properties = new Properties();
        properties.setProperty("ip", "127.0.0.1");
        properties.setProperty("port", "8090");
        System.out.println(properties.getProperty("ip"));
        System.out.println(properties.getProperty("port"));
        // можно выгрузить данные из проперти файла
        try (InputStream input = AnnotationMain.class
                .getClassLoader().getResourceAsStream("point.properties")) { // загрузчик текущего класса свяжется с ресурсами
            properties.load(input); // любоый объект inputstream примет на вход

        } catch (IOException e) {
            System.out.println("Невозможно прочитать файл");
        }
        System.out.println(properties.get("x"));
        System.out.println(properties.get("y"));
    }
}
