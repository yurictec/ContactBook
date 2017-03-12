package org.contactBook.controller;

import org.contactBook.entity.Contact;
import org.contactBook.repository.MyRepository;
import org.contactBook.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by Администратор on 12.03.2017.
 */
@Controller
public class ContactController {

    private ContactService contactService;

    @RequestMapping(value = "/contacts", method = RequestMethod.GET)
    public String list(Model uiModel) {
        List<Contact> list = contactService.findAllContacts();
        uiModel.addAttribute("contacts", list);
        return "list";
    }

    @Autowired
    public void setContactService(ContactService contactService) {
        this.contactService = contactService;
    }
}
