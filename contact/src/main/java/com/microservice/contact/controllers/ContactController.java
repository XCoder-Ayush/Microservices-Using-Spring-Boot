package com.microservice.contact.controllers;

import com.microservice.contact.entities.Contact;
import com.microservice.contact.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/contact")
@RestController
public class ContactController {

    @Autowired
    private ContactService contactService;

    @GetMapping("/{userId}")
    public List<Contact> getContact(@PathVariable String userId){
        System.out.println("In Controller");
        return this.contactService.getContacts(userId);
    }
}
