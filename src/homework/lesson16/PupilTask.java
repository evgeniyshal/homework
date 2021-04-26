package homework.lesson16;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class PupilTask {
    public static void main(String[] args) {
        // Стрим создат МАР    Map<Pupil.Gender, ArrayList<Pupil>> Pupil::getGender
        // Стрим берет первый объект, смотрит, что для группировки нужен метод getGender, вызывает у ученика этот метод.

        Pupil pupil1 = new Pupil(UUID.randomUUID(),"Вася", Pupil.Gender.MALE, LocalDate.now().minusYears(15));
        Pupil pupil2 = new Pupil(UUID.randomUUID(),"Петя", Pupil.Gender.MALE, LocalDate.now().minusYears(10));
        Pupil pupil3 = new Pupil(UUID.randomUUID(),"Саша", Pupil.Gender.MALE, LocalDate.now().minusYears(12));
        Pupil pupil4 = new Pupil(UUID.randomUUID(),"Толя", Pupil.Gender.MALE, LocalDate.now().minusYears(14));
        Pupil pupil5 = new Pupil(UUID.randomUUID(),"Леша", Pupil.Gender.MALE, LocalDate.now().minusYears(9));
        Pupil pupil6 = new Pupil(UUID.randomUUID(),"Катя", Pupil.Gender.FEMALE, LocalDate.now().minusYears(11));
        Pupil pupil7 = new Pupil(UUID.randomUUID(),"Тоня", Pupil.Gender.FEMALE, LocalDate.now().minusYears(8));
        Pupil pupil8 = new Pupil(UUID.randomUUID(),"Соня", Pupil.Gender.FEMALE, LocalDate.now().minusYears(9));
        Pupil pupil9 = new Pupil(UUID.randomUUID(),"Оля", Pupil.Gender.FEMALE, LocalDate.now().minusYears(11));
        Pupil pupil10 = new Pupil(UUID.randomUUID(),"Саша", Pupil.Gender.FEMALE, LocalDate.now().minusYears(14));

        ArrayList<Pupil> pupils = new ArrayList<>();
        pupils.addAll(Arrays.asList(pupil1,pupil2,pupil3,pupil4,pupil5,pupil6,pupil7,pupil8,pupil9,pupil10));


        // Используя Stream API:
        // 1. Разделить учеников на две группы: мальчиков и девочек. Результат:
        Map<Pupil.Gender, ArrayList<Pupil>> byGender = pupils.stream()// Делаем каждого ученика эл-том потока
                        .collect(Collectors.groupingBy(Pupil::getGender,Collectors.toCollection(ArrayList::new)));


        // 2. Найти средний возраст учеников
        // Возраст каждого это int
        double avgAge = pupils.stream()
                .mapToInt(pupil -> LocalDate.now().getYear() - pupil.getBirth().getYear())// позволяет объект из потока приобразовать в числовой поток
                .average().orElse(0); // подсчет среднего значения // без orElse вернет optional(кладет внутрь null, объект будект внутри контейнера)


        // 3. Найти самого младшего ученика
         Pupil minAge = pupils.stream()
                 .max(Comparator.comparing(Pupil::getBirth))
                 .get();


        // 4. Найти самого взрослого ученика
        Pupil maxAge = pupils.stream()
                .min(Comparator.comparing(Pupil::getBirth))
                .get();


        // 5. Собрать учеников в группы по году рождения
        Map<Integer, List<Pupil>> byBirth = pupils.stream().collect(Collectors.groupingBy(pupil -> pupil.getBirth().getYear()));


        // 6. Оставить учеников с неповторяющимися именами,
        // имена и дату рождения оставшихся вывести в консоль.
        // Например, [Иван, Александра, Ольга, Иван, Ольга] -> [Иван, Александра, Ольга]
        pupils.stream()
                .collect(Collectors.toMap(Pupil::getName,Pupil::getBirth,
                        (key1,key2) -> null))
                .entrySet()
                .forEach(System.out::println);


        // 7. Отсортировать по полу, потом по дате рождения, потом по имени (в обратном порядке), собрать в список (List)
            pupils.sort(
                    Comparator.comparing(Pupil::getGender)
                    .thenComparing(Comparator.comparing(Pupil::getBirth))
                            .thenComparing(Comparator.comparing(Pupil::getName).reversed())
            );

        /* 8. Вывести в консоль всех учеников в возрасте от N до M лет*/

        pupils.stream()
                .filter(pupil -> pupil.getBirth().getYear() >= 8 && pupil.getBirth().getYear() <=10)
                .forEach(System.out::println);


        // 9. Собрать в список всех учеников с именем = someName
        String name = "Саша";
       List<Pupil> listMap = pupils.stream()
                .filter(pupil -> name.equals(pupil.getName()))
                        .collect(Collectors.toList());


        // 10. Собрать Map<Pupil.Gender, Integer>, где Pupil.Gender - пол, Integer - суммарный возраст учеников данного

        // создать коллектор который смотрит на пол
         // Collectors.summingInt(
        // далее перебор вычитаем локал дейт год из дня рожденияю год

        Map<Pupil.Gender, Integer> sumAge = pupils.stream()
                .collect(Collectors
                        .groupingBy(Pupil::getGender, Collectors.summingInt
                                (LocalDate.now().getYear() - pupil.getBirth().getYear()));


