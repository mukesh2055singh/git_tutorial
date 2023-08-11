package com.contacts.service;

import java.util.List;

import com.contacts.entity.Contacts;

public interface ContactService {
	public List<Contacts> getContactsOfUser(Long userId);
}
