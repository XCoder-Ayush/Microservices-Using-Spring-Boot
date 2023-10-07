package com.microservice.user.services;

import com.microservice.user.entities.Contact;
import com.microservice.user.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private List<User> users=new ArrayList<>();

    @Autowired
    RestTemplate restTemplate;
    public UserService(){
        users.add(new User("1","Ayush","9874180842",null));
        users.add(new User("2","Snehangshu","807308709",null));
        users.add(new User("3","Kutta","1083708741",null));
    }

    public List<User> getUsers() {
        for(User user : this.users){
            List<Contact> contacts=this.restTemplate.getForObject("http://contact-service/contact/"+ user.getUserId(),List.class);
            user.setContactList(contacts);
        }
        return this.users;
    }

    public User getUser(String id) {
        for(User user : this.users){
            if(user.getUserId().equals(id)){
                List<Contact> contacts=this.restTemplate.getForObject("http://localhost:8081/contact/"+ user.getUserId(),List.class);
                user.setContactList(contacts);
                return user;
            }
        }

        return null;
    }
}
