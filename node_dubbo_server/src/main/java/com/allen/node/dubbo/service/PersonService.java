package com.allen.node.dubbo.service;

import java.util.List;

import com.allen.node.dubbo.model.Person;

public interface PersonService {

	void save(Person person);
	
	Person getById(long id);
	
	List<Person> findAll();
	
	String deleteById(long id);
}
