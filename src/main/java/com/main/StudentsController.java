package com.main;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentsController {

	@Autowired
	private StudentsService studentsService;
	
	@GetMapping("/{roll}")
	public Person get(@PathVariable("roll") int roll){
		return studentsService.select(roll);
	}
	
	@GetMapping
	public ArrayList<Person> getAll(){
		return studentsService.selectAll();
	}
	
	@PostMapping
	public Person post(@RequestBody Students students){
		return studentsService.insert(students);
	}
	
	@PutMapping("/{roll}")
	public Person put(@PathVariable("roll") int roll,@RequestBody Students students){
		return studentsService.update(roll, students);
	}
	
	@DeleteMapping("/{roll}")
	public Person delete(@PathVariable("roll") int roll){
		return studentsService.delete(roll);
	}
	
	@DeleteMapping
	public String deleteAll(){
		return studentsService.deleteAll();
	}
}
