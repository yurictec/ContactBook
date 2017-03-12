package org.contactBook.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yuriy Kolennikov on 12.03.2017.
 */
@Entity
public class Contact {

    private int id;
    private String surname;
    private String firstName;
    private String patronymic;
    private List<Phone> phones = new ArrayList<Phone>();
    private List<Address> addresses = new ArrayList<Address>();
    private List<Email> emails = new ArrayList<Email>();

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setPhone(Phone phone) {
        if (phone != null) {
            phones.add(phone);
        }
    }

    public void setAddress(Address address) {
        if (address != null) {
            addresses.add(address);
        }
    }

    public void setEmail(Email email) {
        if (email != null) {
            emails.add(email);
        }
    }

    public List getAllAddresses() {
        return addresses;
    }

    public List getAllPhones() {
        return phones;
    }

    public List getAllEmails() {
        return emails;
    }

    public Phone getDefaultPhone() {
        Phone phone = null;
        for (Phone p : phones) {
            if (p.isUseFlag()) {
                phone = p;
                break;
            }
        }
        return phone;
    }

    public Address getDefaultAddress() {
        Address address = null;
        for (Address a : addresses) {
            if (a.isUseFlag()) {
                address = a;
                break;
            }
        }
        return address;
    }

    public Email getDefaultEmail() {
        Email email = null;
        for (Email e : emails) {
            if (e.isUseFlag()) {
                email = e;
                break;
            }
        }
        return email;
    }

    @Override
    public String toString() {
        return "Contact #: " + id + ". " + surname + " " + firstName + " " + patronymic + "\n" + addresses.toString() +
                "\n" + phones.toString() + "\n" + emails.toString();
    }
}
