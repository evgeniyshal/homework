package homeworklesson6.storage;

public class Author {
    private String name;
    private String soName;

    public Author(String name, String soName) { // конструктор
        setName(name);
        setSoName(soName);
    }

    public String getName() {
        return name;
    }
    public String getSoName () {
        return soName;
    }


    public void setName(String name) {
        if (name == null || !name.trim().contains("0")) { // проверка на null, удаления пробелов, проверка на содержание
            throw new IllegalArgumentException("Это не имя Автора");
        }
            this.name = name;
        }

        public void setSoName (String soName){
            if (soName== null || !soName.trim().contains("0")) { // проверка на null, удаления пробелов, проверка на содержание
                throw new IllegalArgumentException("Это не фамилия Автора");
            }
            this.soName = soName;
        }
    }
