package org.contactBook.services;

import org.contactBook.entity.Contact;
import org.contactBook.repository.MyRepository;
import org.contactBook.repository.MyRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yuriy Kolennikov on 12.03.2017.
 */
@Service("contactService")
public class ContactServiceImpl implements ContactService {

    private MyRepository myRepository;

    public List<Contact> findAllContacts() {
        return new ArrayList<Contact>(myRepository.findAll());
    }

    public Contact findByIdContact(int id) {

        return myRepository.findById(id);
    }

    public Contact findContactByFullName(String surname, String firstName, String patronymic) {
        return null;
    }

    public Contact save(Contact contact) {
        return myRepository.save(contact);
    }

    public void delete(Contact contact) {

    }

    public int howManyContacts() {
        return myRepository.howManyContacts();
    }

    @Autowired
    public void setMyRepository(MyRepository myRepository) {
        this.myRepository = myRepository;
    }
}
