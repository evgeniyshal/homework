package homework.coursework.game;

public enum Zone {
    START_MENU("1. Начать игру\n2. Загрузить игру\n3. Выйти"),
    GAME_MENU("1. Начать игру\n2. Загрузить игру\n3. Выйти\n4. Сохранить игру\""),
    MENU("1. Начать игру\n2. Загрузить игру\n3. Выйти"),
    NEAR_FOX_HOME("Каждое утро Лисёнок просыпался, завтракал и шёл увидеться с Бельчонком. " +
            "Это утро не было исключением. Лисёнок пришёл на их обычное место встречи, но Бельчонка там не было. " +
            "\nЛисёнок ждал, ждал, но так и не смог дождаться своего друга. \" " +
            "Бельчонок не пропустил еще ни одной встречи, вдруг он попал в беду.\" - подумал Лисёнок. " +
            "\nКак поступить Лисенку?" +
            "\n" +
            " 1. Вернуться домой\n" +
            " 2. Отправиться на поиски\n"),

    IN_SEARCH("Все лесные жители были заняты своими делами и не обращали внимания на Лисёнка и его проблему. " +
            "\n Но вдруг кто нибудь видел Бельчонка... Лисёнок не знал, что ему делать. Помогите ему." +
            "\n 1.Попытаться разузнать о Бельчонке у лесных жителей" +
            "\n 2.Искать Бельчонка в одиночку"),

    HOME("Вернувшись домой, Лисёнок нашёл там Бельчонка. " +
            "Оказалось,что Бельчонок пришёл на место встречи раньше и увидел там рой злобных пчел. " +
            "Он поспешил предупредить об этом Лисёнка, но они разминулись. " +
            "Наконец-то друзья нашли друг друга!" +
            "Игра завершилась успехом"),

    DWELLERS("Пока Лисёнок принимал решение, лесные жители разошлись кто куда. " +
            "Остались только Сова и Волк. " +
            "Но у Совы бывают проблемы с памятью, а Волк может сильно разозлиться из-за расспросов. Кого выбрать? " +
            "\n 1. Расспросить Сову" +
            "\n 2. Расспросить Волка"),

    SINGLESEARCH("Лисёнок слишком долго плутал по лесу в поисках друга и сам не заметил, как заблудился. " +
            "Теперь его самого нужно искать. " +
            "Игра завершилась неудачей"),

    OWLHOME("Сова долго не хотела говорить, но в итоге сказала, что видела испуганного Бельчонка, " +
            "бежавшего вглубь леса. Все лесные жители знают, что в глубине леса опасно, " +
            "если Бельчонок там, ему срочно нужна помощь." +
            "\n 1.Поверить Сове и отправиться вглубь леса" +
            "\n 2.Сове не стоит верить -> Искать Бельчонка в одиночку"),

    WOLFHOME("Волк оказался вполне дружелюбным, но помочь не смог. " +
            "Лишь сказал, что маленькому лисенку не стоит бродить по лесу одному. И как теперь поступить?" +
            "\n 1. Волк прав -> Вернуться домой" +
            "\n 2. Искать Бельчонка в одиночку"),

    FORREST("В глубине леса Лисёнок встретил Медвежонка. " +
            "Ленивый Медвежонок был готов рассказать все, что знает, если Лисёнок принесёт ему мёда.\n" +
            "\n 1. Нет, потрачено слишком много времени, нужно идти дальше -> Искать Бельчонка в одиночку" +
            "\n 2. Нужно воспользоваться шансом и раздобыть мёд"),

    HONEY("Лисёнок быстро нашёл мёд, но вокруг летал рой злобных пчел. " +
            "Лисёнок всегда боялся пчёл, но и не найти друга он тоже боялся." +
            "\n1.Подождать, вдруг пчёлы улетят\n2.Нужно попытаться выкрасть мёд немедленно\n"),

    BEERETREAT("Лисёнок подождал немного, и пчёлы разлетелись. Лисёнок без проблем набрал мёда. " +
            "Вдруг он понял, что очень голоден. " +
            "Что же делать?" +
            "\n1.Поесть немного и передохнуть\n2.Скорее отнести мёд Медвежонку\n"),

    STOLENHONEY("Это была не лучшая идея. Пчёлы покусали Лисёнка, теперь ему самому нужна помощь. " +
            "Игра завершилась неудачей"),

    REST("Пока Лисёнок ел, злобные пчёлы вернулись и покусали его. " +
            "Лисёнку нужна помощь, он не сможет продолжить поиски. Игра завершилась неудачей"),

    HONEYFORBEAR("Довольный Медвежонок рассказал Лисёнку, " +
            "что очень хорошо знает семью Белок и уверен, что Бельчонок никогда не пошёл бы в глубь леса. " +
            "Он заверял Лисёнка, что Белки не попадают в неприятности, и что Совам нельзя верить, " +
            "он также уговаривал Лисёнка вернуться домой." +
            "\n1.Медвежонок ничего не знает, нужно продолжить поиски -> Искать Бельчонка в одиночку" +
            "\n2.Может быть он прав и Лисёнок просто паникует -> Вернуться домой\n");
    private String text;

    Zone(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    }
