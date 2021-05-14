package homework.lesson23.lesson23;


import java.lang.reflect.*;
import java.util.Arrays;

public class ReflectionLesson {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        /* Рефлексия - механизм, с помощью которого можно получать
         * информацию о классах, интерфейсах, полях и методах
         * во время выполнения программы.
         * Reflection API дает возможность создавать новые экземпляры классов,
         *
         * получать и устанавливать значения свойств, вызывать методы.

         * Все классы в языке являются объектами типа Class
         * Ссылку на объекта класса можно получить 2мя способами*/

        Class<String> stringClass = String.class; // переменными словом class называть нельзя
        System.out.println(stringClass); // получили ссылку

        Class<Integer> intClass = int.class; // обращаемся к примитивам через обертку
        System.out.println(intClass);

        Class<Text> textClass = Text.class;
        System.out.println(textClass);

        Text text = new Text("Reflection");
        text.setText("Reflection Apo дает возможность создавать экземпляр");


        Class<? extends Text> textClass2 = text.getClass(); // есть у всех объектов, реализован в object

        textClass = Text.class;
        System.out.println(textClass.getName()); // получаем имя класса строкой
        System.out.println(textClass.getSimpleName());
        System.out.println(textClass.getPackageName());

        //можем получить интерфейсы которые имплементируют класс, но его родителей

        Class<?>[] interfaces = textClass.getInterfaces();// чтобы получить список интер, обращаемся к ссылке на класс
        System.out.println(Arrays.toString(interfaces));

        //родительский класс
        System.out.println(textClass.getSuperclass()); // возвращает ссылку на класс родителя( не строку)
        System.out.println(textClass.getSuperclass().getSuperclass()); // ссылка на object;

        textClass = Text.class;
        // Доступ к компонентам класса
        // поля import java.lang.reflect.Field;
        Field[] fields = textClass.getFields();
        System.out.println(Arrays.toString(fields));
        // метод возвращает массив с публичными полями включая родителский

        Field[] declaredFields = textClass.getDeclaredFields();
        // обращаемся к ссылке класса и вызваем метод.getDeclaredFields()
        // вернет массив с любым модификатором, туда войдут все поля класса ( только собственные, не родительские)

        // все методы являются объектами
        Method[] methods = textClass.getMethods();
        System.out.println(Arrays.toString(methods));

        Method[] declaredMethods = textClass.getDeclaredMethods();
        System.out.println(Arrays.toString(declaredMethods));

        // конструкторы
        Constructor<?>[] declaredConstructor = textClass.getDeclaredConstructors(); // класс неизвестен <?> могут быть разные
        System.out.println(Arrays.toString(declaredConstructor));

        //создание объекта
        Constructor<Text> textConstructor = textClass.getDeclaredConstructor(String.class); // Метод получения одного конструктора, чтобы получить конкретный, нужно знать типы данных
        //Если конструктор не найден, будет noSuchMethodExp


        Text reflectText = textConstructor.newInstance("Reflection"); // конструктор может принимать несколько типов

        //private String text - поле
        // У нас есть ссылка на поле, внутри класса Text, мы должны это самое поле и добавить значение ( строчку abc)
        Field field = textClass.getDeclaredField("text"); // вызывваем для получения одного поля, если не знаем, то получаем все поля и делаем перебор массивом
        System.out.println(field.getType());
        System.out.println(field.getName());

        field.setAccessible(true); // получаем возможность установить свойства полей с любым модификатором
        field.set(reflectText, "abc"); //
        System.out.println(field.get(reflectText)); // вытаскиваем значение из reflectText

        // тоже самое сделаем с методами, если нам нужно вызвать методы
        //setText(String text)
        Method method = textClass.getDeclaredMethod("setText", String.class); // Передаем имя метода строкой, далее тип принимаемого значения
        method.setAccessible(true); // снова позволит вызвать методы с любыми модификаторами
        // reflectText.setText
        method.invoke(reflectText, "Reflection API"); // вызов метода

        System.out.println(field.getType()); // Class
        System.out.println(field.getName()); // String
        System.out.println(method.getGenericReturnType()); // Тип возвращаемого значения
        System.out.println(Arrays.toString(method.getGenericParameterTypes()));
        System.out.println(Arrays.toString(method.getGenericExceptionTypes())); // Массив исключений

        Modifier.isPrivate(field.getModifiers()); // можно вызвать у поля, метода и конструктора.


        //TODO написать рефлексивный статический метод toString(Object o)
        // TODO toString (reflectText);
        // obj: int, boolean String, User, String [] - посмотреть как выводить, рефлексивно массивы
        // Посмотреть класс modifier
    }

    public static void toString(Object o) { //проходит по всем его свойствам, с помощью рефлексии

    }


    // Аннтоации - информация методанные или метки
    // Сами по себе ничего не делают, могут существовать только в исходном коде и в скомпелированном файле
    // Во время вып. прог. мы считываем методанные
    // Аннотировать можно классы, конструкторы, методы, пар методов

    //TODO 2ое дз
    // если у класса есть аннтоация Component
    // Создать объект данного класса
    // Если поле отмечено аннотацией Required
    // установить значение данного поля, испольщуя сеттер! (значение рандомное)
    // название сеттера x setXname - set Name;

    // name setName()

}
