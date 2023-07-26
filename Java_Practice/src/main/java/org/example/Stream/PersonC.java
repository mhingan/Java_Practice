package org.example.Stream;

import java.util.Objects;

public class PersonC {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private  String occupation;
    private String gender;

    public PersonC(String firstName, String lastName, String dateOfBirth, String occupation, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.occupation = occupation;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getOccupation() {
        return occupation;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", occupation='" + occupation + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonC personC = (PersonC) o;
        return Objects.equals(firstName, personC.firstName) && Objects.equals(lastName, personC.lastName) && Objects.equals(dateOfBirth, personC.dateOfBirth) && Objects.equals(occupation, personC.occupation) && Objects.equals(gender, personC.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, dateOfBirth, occupation, gender);
    }
}
