package homework.lesson6.storage;

public class Author {
    private String name; // закрыты от использования.
    private String surname;

    public String getName() { // getter это отдача информации
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Author(String name, String soName) {
        setName(name);
        setSurname(soName);
    }

    private void setName(String name) {
        if (name == null || !(name.trim().length() > 1)) {
            throw new IllegalArgumentException("Это не имя автора книги");
        }
        this.name = name;
    }

    private void setSurname (String surname){
        if (surname== null || !(surname.trim().length() > 1)) {
            throw new IllegalArgumentException("Это не фамилия автора книги");
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
