package homework.lesson16;

import homework.lesson7.Student;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class PupilTask {
    public static void main(String[] args) {


        ArrayList<Pupil> arrPupil = new ArrayList<>(
                // Используя Stream API:
        // 1. Разделить учеников на две группы: мальчиков и девочек. Результат: Map<Pupil.Gender, ArrayList<Pupil>>

        // 2. Найти средний возраст учеников

        // 3. Найти самого младшего ученика

        // 4. Найти самого взрослого ученика

        // 5. Собрать учеников в группы по году рождения

        // 6. Оставить учеников с неповторяющимися именами,
        // имена и дату рождения оставшихся вывести в консоль.
        // Например, [Иван, Александра, Ольга, Иван, Ольга] -> [Иван, Александра, Ольга]

        // 7. Отсортировать по полу, потом по дате рождения, потом по имени (в обратном порядке), собрать в список (List)

        // 8. Вывести в консоль всех учеников в возрасте от N до M лет

        // 9. Собрать в список всех учеников с именем=someName

        // 10. Собрать Map<Pupil.Gender, Integer>, где Pupil.Gender - пол, Integer - суммарный возраст учеников данного


        //Методы получения Stream:
        //
        //    из коллекций collection.stream();
        //    из массива Arrays.stream(arr);
        //    из файла Files.lines(path_to_file);
        //    из строки string.chars();
        //    используя builder Stream.builder().add(obj1).add(obj2).add(objN).build();`
        //    из набора данных Stream.of(1, 4, 7);
    }
}