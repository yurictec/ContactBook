package org.contactBook.repository;

import org.contactBook.entity.Contact;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Yuriy Kolennikov on 12.03.2017.
 */
public class MyRepositoryImpl implements MyRepository {

    private static Set<Contact> contacts;
    private static AtomicInteger integer;

    public MyRepositoryImpl() {
    }

    public MyRepositoryImpl(Set<Contact> contacts, AtomicInteger integer) {
        this.contacts = contacts;
        this.integer = integer;
    }

    public List<Contact> findAll() {
        return new ArrayList<Contact>(contacts);
    }

    public Contact findById(int id) {
        Contact contact = null;
        for (Contact contact1 : contacts) {
            if (contact1.getId() == id) {
                contact = contact1;
                break;
            }
        }
        return contact;
    }

    public Contact findByFullName(String surname, String firstName, String patronymic) {
        Contact contact = null;
        for (Contact contact1 : contacts) {
            if (contact1.getSurname().equalsIgnoreCase(surname)
                    && contact1.getFirstName().equalsIgnoreCase(firstName)
                    && contact1.getPatronymic().equalsIgnoreCase(patronymic)) {
                contact = contact1;
                break;
            }
        }
        return contact;
    }

    public Contact save(Contact contact) {
        contact.setId(integer.incrementAndGet());
        contacts.add(contact);
        return findById(contact.getId());
    }

    public void delete(Contact contact) {
        contacts.remove(contact);
    }

    public int howManyContacts(){
        return contacts.size();
    }
}
