package com.main;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentsService {

	@Autowired
	private QueryInterface queryInterface;
	
	public Person select(int roll){
		return new Person(queryInterface.findOne(roll).getRoll(),queryInterface.findOne(roll).getName());
	}
	
	public ArrayList<Person> selectAll(){
		ArrayList<Person> arrayList=new ArrayList<>();
		queryInterface.findAll().forEach(t->{arrayList.add(new Person(t.getRoll(),t.getName()));});
		return arrayList;
	}
	
	public Person insert(Students students){
		queryInterface.save(students);
		return new Person(students.getRoll(),students.getName());
	}
	
	public Person update(int roll ,Students students){
		queryInterface.delete(roll);
		queryInterface.save(students);
		return new Person(students.getRoll(),students.getName());
	}
	
	public Person delete(int roll){
		Person person=new Person(queryInterface.findOne(roll).getRoll(),queryInterface.findOne(roll).getName());
		queryInterface.delete(roll);
		return person;
	}
	
	public String deleteAll(){
		queryInterface.deleteAll();
		return "[]";
	}
}
