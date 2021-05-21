package multithreading.lesson25;

public class Writer extends Thread{ // Первый вариант создания - через наследования от Thread
                                    // Обычный класс. У него могут быть любый свойства, методы и конструкторы.
    @Override
    public void run() {
        // те инструкции которые должны выполнятся в этом нашем потоке, пишем в методе run.
        System.out.println("Writer");
    }
}
