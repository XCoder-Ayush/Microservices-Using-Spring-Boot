package com.microservice.contact.services;

import com.microservice.contact.entities.Contact;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactService {

    private List<Contact> contacts=new ArrayList<>();
    public ContactService(){
        contacts.add(new Contact("Kanu","kanu@gmail.com","1"));
        contacts.add(new Contact("Fanu","fanu@gmail.com","1"));
        contacts.add(new Contact("Hanu","hanu@gmail.com","1"));
        contacts.add(new Contact("Panu","panu@gmail.com","2"));
        contacts.add(new Contact("Sanu","sanu@gmail.com","2"));
        contacts.add(new Contact("Lanu","lanu@gmail.com","3"));
    }

    public List<Contact> getContacts(String userId) {
        System.out.println("In Service");
        return this.contacts.stream().filter(contact->contact.getUserid().equals((userId))).collect(Collectors.toList());
    }
}
