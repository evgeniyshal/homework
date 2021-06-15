package homework.coursework.chat;

public class Main {


    // Клиент устанавливает соединение с сервером и не разрывает, после каждой отправки сообщения
    // 2 потока:
    // Отправитель Получатель
    // Между собой они передают  Message implements Serializable() объект, Чтобы клиент мог передать сообщения нужна сериализация
    // В объекте = new Message(отправитель, текст, дата)



    /* Сервер висит, ждет клиентов, ему выделяется один поток(только чтение), на получение сообщений и доб. в блок. очередь
    * на каждое подключение выделяется отдельный поток
    * Отправитель ( один поток) будет забирать сообщения из блкирующей очереди и рассылать всем клиентам кроме отправителя
    * Коллекция с объектами сообщений ( потокобезопасная)
    *
    *
    * Модули имя проекта new модуль, папка src отмеченная как исходная, должен быть общий пакет, для всех остальных пакетов. Модуль info.java пкм cоздать файл
    *
    * */
}
