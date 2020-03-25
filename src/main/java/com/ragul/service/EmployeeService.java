package com.ragul.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ragul.model.Employee;
import com.ragul.repository.EmployeeRepository;



@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository er;
	
	@Transactional
	public void save(Employee e) {
		er.save(e);
	}
	
	@Transactional
	public Employee get(Integer i) {
		return er.findById(i).get();
	}

	
	@Transactional
	public List<Employee> getAllPermanentEmployees(){
		return er.getAllPermanentEmployees();
	}
	
	@Transactional
	public List<Employee> getAllEmployeesNative(){
		return er.getAllEmployeesNative();
	}
	
	@Transactional
	public double getAverageSalary(int id){
		return er.getAverageSalary(id);
	}
	

}
