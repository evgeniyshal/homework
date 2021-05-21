package multithreading.lesson25;

public class Base {
    public static void main(String[] args) {
    //Одна программа один процесс, при запуске создается процесс в операционной системе
    // Последовательно выполняются инструкции, только те которые отдадим потоку
        // Многопоточность приложения, инструкции одного процесса могут выполняться паралельно
        // Создаем потоки, которые выполняют инструкции
        // Все потоки, работают с одной области памяти, где создаются объекти.
        // Одно ядро процессора, способно обрабатывать, один поток.
        // Когда запускается программа, всегда создается один поток, ОСНОВНОЙ ПОТОК - MAIN. ( Запуск авт.), после этого создаются другие потоки.4

        /* Жизненный цикл потока
        * 1. New создания экземпляра Thread
        * 2. RUNNABLE(отдаем поток) (вызов метода start() объекта Tread) поток мы передаем планировщику потоков.
        * 3. RUNNING Не можем управлять потоком. Инструцкии имеют рекомендательный характер.
        * 4. NON - RUNNING () состояние ожидания
        * 5. TERMINATED - поток завершил свою работу
        *
        * */

        Writer writer = new Writer(); // вызываем конструктор нашего класса, создаем объект
        writer.start(); // поток переходит в состоние runnable, передается планировщику потоков. Планировщик вызовет метод run


    }
}