package org.contactBook.controller;

import org.contactBook.entity.Contact;
import org.contactBook.exception.MyException;
import org.contactBook.services.ContactService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Администратор on 12.03.2017.
 */
@Controller
public class ContactController {

    private final Logger logger = LoggerFactory.getLogger(ContactController.class);

    private ContactService contactService;

    @RequestMapping(value = "/contacts")
    public String list(Model model) throws MyException{
        List<Contact> list = contactService.findAllContacts();
        model.addAttribute("contacts", list);
        return "list";
    }

    @ExceptionHandler(MyException.class)
    public String hendleException(Exception e){
        logger.error("ERROR CONTROLLER");
        return "error";
    }

    @RequestMapping(value = "/*")
    public void error() throws MyException {
        throw  new MyException();
    }

    @Autowired
    public void setContactService(ContactService contactService) {
        this.contactService = contactService;
    }
}
