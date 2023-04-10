package com.test.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.StudentService.StudentService;
import com.test.entity.Student;
import com.test.repository.StudentRepository;

@RestController
@RequestMapping("/api/v1")
public class StudentController {
	
	@Autowired
	private StudentRepository studentrepo;
	
	@Autowired
	private StudentService service;
	
	
	@GetMapping
	public List<Student> getall(){
		return service.getall();
	}
	
	@GetMapping
	public Student findbyId(@PathVariable Integer id)
	{
		return service.getbyId(id);
	}
	
	
	
	

}
