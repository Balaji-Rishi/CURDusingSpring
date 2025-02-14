package com.project.CRUDusingSpring.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.service.annotation.PutExchange;

import com.project.CRUDusingSpring.entity.Employee;
import com.project.CRUDusingSpring.service.EmployeeService;

@Controller
@RequestMapping("/api")
public class EmployeeController {
	
	@Autowired
	EmployeeService service;
	
	@ResponseBody
	@PostMapping("/adddet")
	public String addDetails(@RequestBody Employee employee) {
		
		service.addDatas(employee);
		return "Details add successfully";
		
	}
	
	@ResponseBody
	@GetMapping("/getdet")
	public List<Employee> getAllDetails(){
		
		return service.getalldet();
		
	}
	
	@ResponseBody
	@GetMapping("/getbyid/{id}")
	public Optional<Employee> getById(@PathVariable("id")long id) {
		
		return service.getbyid(id);
		
	}
	
	@ResponseBody
	@PutMapping("/updatedet")
	public String updateDetails(@RequestBody Employee employee) {
		
		service.updateDet(employee);
		return "Update Successfully";
	}
	
	@ResponseBody
	@DeleteMapping("/delbyid/{id}")
	public String deleteById(@PathVariable("id") long id) {
		
		service.delbyid(id);
		return "delete successfully";
		
	}

	@ResponseBody
	@DeleteMapping("/delall")
	public String deleteAll() {
		
		service.delall();
		return "All details delete successfully...";
		
	}
	
}
