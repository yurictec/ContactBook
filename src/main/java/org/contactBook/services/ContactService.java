package org.contactBook.services;

import org.contactBook.entity.Contact;

import java.util.List;

/**
 * Created by Yuriy Kolennikov on 12.03.2017.
 */
public interface ContactService {
    List<Contact> findAllContacts();

    Contact findByIdContact(int id);

    Contact findContactByFullName(String surname, String firstName, String patronymic);

    Contact save(Contact contact);

    void delete(Contact contact);

    int howManyContacts();
}
