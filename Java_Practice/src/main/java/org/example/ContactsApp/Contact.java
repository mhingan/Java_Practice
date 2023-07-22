package org.example.ContactsApp;

public class Contact {
    private String name;
    private String phoneNumber;
    private String email;
    private String additionalInfo;

    public Contact(String name, String phoneNumber, String email, String additionalInfo) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.additionalInfo = additionalInfo;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    @Override
    public String toString() {
        return "\nContact{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", additionalInfo='" + additionalInfo + '\'' +
                '}';
    }
}
