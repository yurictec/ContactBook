package org.contactBook;

import org.contactBook.entity.Address;
import org.contactBook.entity.Contact;
import org.contactBook.entity.Email;
import org.contactBook.entity.Phone;
import org.contactBook.entity.enums.TypeAddress;
import org.contactBook.entity.enums.TypeEmail;
import org.contactBook.entity.enums.TypePhone;
import org.contactBook.services.ContactService;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Администратор on 12.03.2017.
 */
public class Test {
    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("classpath:META-INF/spring/app-config.xml");
        context.refresh();

        ContactService service = context.getBean("contactService", ContactService.class);

        Address address = new Address();
        address.setCity("Minsk");
        address.setCountry("Belarus");
        address.setStreet("Koshevogo");
        address.setTypeAddress(TypeAddress.HOME);
        address.setUseFlag(true);

        Phone phone = new Phone();
        phone.setTypePhone(TypePhone.MOBILE);
        phone.setPhone("+123456789");
        phone.setUseFlag(true);

        Email email = new Email();
        email.setUseFlag(true);
        email.setEmail("yurictec1");
        email.setTypeEmail(TypeEmail.HOME);

        Contact contact = new Contact();
        contact.setSurname("Kolennikov");
        contact.setFirstName("Yuriy");
        contact.setPatronymic("Vladimirovich");
        contact.setAddress(address);
        contact.setEmail(email);
        contact.setPhone(phone);

        contact = service.save(contact);

        contact = service.findByIdContact(contact.getId());
        System.out.println(contact);
        System.out.println("");

        contact.setSurname("Judanova");
        contact.setFirstName("Tamara");
        contact.setPatronymic("Sergeevna");

        service.save(contact);

        System.out.println("All contacts: " + service.howManyContacts());

    }
}
