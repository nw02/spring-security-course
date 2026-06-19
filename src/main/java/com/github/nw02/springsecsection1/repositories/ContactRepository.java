package com.github.nw02.springsecsection1.repositories;

import com.github.nw02.springsecsection1.model.Contact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends CrudRepository<Contact, String> {


}