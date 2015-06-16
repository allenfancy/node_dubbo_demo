package com.allen.node.dubbo.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.allen.node.dubbo.model.Person;
import com.allen.node.dubbo.service.PersonService;

public class PersonServiceImpl implements PersonService {

	List<Person> listPerson = new ArrayList<Person>();
	
	public void save(Person person) {
		// TODO Auto-generated method stub
		System.out.println("添加成功!");
		listPerson.add(person);
		
	}

	public Person getById(long id) {
		// TODO Auto-generated method stub
		return new Person(123L,"吴涛","上海",false);
	}

	public List<Person> findAll() {
		// TODO Auto-generated method stub
		return listPerson;
	}

	public String deleteById(long id) {
		// TODO Auto-generated method stub
		System.out.println("删除一个人："+id);
		return "删除一条";
	}

}
