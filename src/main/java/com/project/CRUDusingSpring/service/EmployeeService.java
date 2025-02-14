package com.project.CRUDusingSpring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.CRUDusingSpring.entity.Employee;
import com.project.CRUDusingSpring.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository repository;

	public void addDatas(Employee employee) {
		
		repository.save(employee);
		
	}
	
	public List<Employee> getalldet(){
		
		return  (List<Employee>)repository.findAll();
		
	}
	

	public Optional<Employee> getbyid(long id) {
		return repository.findById(id);
	}
	
	public void updateDet(Employee employee) {
		
		repository.save(employee);
		
	}
	
	public void delbyid(long id) {
		
		repository.deleteById(id);
		
	}
	
	public void delall() {
		
		repository.deleteAll();
		
	}
	
}
