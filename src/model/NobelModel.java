package model;

public class NobelModel 
{
    String dateOfNobel;
    String typeOfNobel;
    String lastName;
    String firstName;

    public NobelModel() {
    }

    public String getDateOfNobel() {
        return dateOfNobel;
    }

    public void setDateOfNobel(String dateOfNobel) {
        this.dateOfNobel = dateOfNobel;
    }

    public String getTypeOfNobel() {
        return typeOfNobel;
    }

    public void setTypeOfNobel(String typeOfNobel) {
        this.typeOfNobel = typeOfNobel;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
