package modul;

public class Person {
    private String surname;
    private String name;
    private String patronymic;
    private String dateOfBirth;
    private int phone_number;
    private char gender;

    public Person(String surname, String name, String patronymic, String dateOfBirth, int phone_number, char gender) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
        this.phone_number = phone_number;
        this.gender = gender;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public char getGender() {
        return gender;
    }
}
