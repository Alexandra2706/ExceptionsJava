package Model;

public class Human implements Person {
    private String lastName;
    private String firstName;
    private String surname;
    private String birthday;
    private String phoneNumber;
    private String gender;

    public Human(String[] initialData) {
        this.lastName = initialData[0];
        this.firstName = initialData[1];
        this.surname = initialData[2];
        this.birthday = initialData[3];
        this.phoneNumber = initialData[4];
        this.gender = initialData[5];
    }

    @Override
    public String toString() {
        return String.format("<%s> <%s> <%s> <%s> <%s> <%s>",
                lastName, firstName, surname, birthday, phoneNumber, gender);
    }

    @Override
    public String getLastName() {
        return lastName;
    }

}
