package com.contacts.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.contacts.entity.Contacts;

@Service
public class ContactServiceImpl implements ContactService {

	ArrayList<Contacts> list=new ArrayList<Contacts>();
	public List<Contacts> getContactList(){
		System.out.println("11111");
		list.add(new Contacts(11L,"MUK@gmail.com","mukesh",11111L));
		list.add(new Contacts(22L,"ni@gmail.com","nit",11111L));
		list.add(new Contacts(33L,"rit@gmail.com","rit",11111L));
		return list;
	}
	public List<Contacts> getContactsOfUser(Long userId) {
		// TODO Auto-generated method stub
		getContactList();
		System.out.println("size--:"+list.size());
		return list;
	}

}
