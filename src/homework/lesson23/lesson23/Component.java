package homework.lesson23.lesson23;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)

@Retention(RetentionPolicy.RUNTIME)
public @interface Component {
    // в качестве параметров, можно исп только строки, примитивы и enum
    String fileName(); // Параметр с типом данных String
    long version() default 1; // Значение по умолчанию


}
