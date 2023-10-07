package com.microservice.contact.entities;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Contact {
    String name;
    String email;
    String userid;//whose contact
}
