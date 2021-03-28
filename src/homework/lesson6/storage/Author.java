package homework.lesson6.storage;

public class Author {
    private String name;
    private String surname;

    public Author(String name, String soName) {
        setName(name);
        setSurname(soName);
    }

    private void setName(String name) {
        if (name == null || !(name.trim().length() > 1)) {
            throw new IllegalArgumentException("Это не имя Автора");
        }
        this.name = name;
    }

    private void setSurname (String surname){
        if (surname== null || !(surname.trim().length() > 1)) {
            throw new IllegalArgumentException("Это не фамилия Автора");
        }
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
