package org.contactBook.repository;

import org.contactBook.entity.Contact;

import java.util.List;

/**
 * Created by Yuriy Kolennikov on 12.03.2017.
 */
public interface MyRepository {
    List<Contact> findAll();

    Contact findById(int id);

    Contact findByFullName(String surname, String firstName, String patronymic);

    Contact save(Contact contact);

    void delete(Contact contact);

    int howManyContacts();
}
