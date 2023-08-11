package com.contacts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contacts.entity.Contacts;
import com.contacts.service.ContactService;

@RestController
@RequestMapping("/contact")
public class ContactController {

	@Autowired private ContactService contactService;
	@RequestMapping("/user/{userId}")
	public List<Contacts> getContacts(@PathVariable("userId") Long userId){
		System.out.println("contact");
		return contactService.getContactsOfUser(userId);
	}
}
