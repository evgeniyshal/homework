package homework.lesson23.lesson23;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.METHOD}) // Аннотация полей и методов

@Retention(RetentionPolicy.RUNTIME) // во время выполнения программы

public @interface Required {
    //чтобы использовать для поле, добавляем @target
}
