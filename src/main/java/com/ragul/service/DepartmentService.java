package com.ragul.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ragul.model.Department;
import com.ragul.repository.DepartmentRepository;



@Service
public class DepartmentService {
	@Autowired
	private DepartmentRepository dr;

	@Transactional
	public void save(Department d) {
		dr.save(d);
	}
	
	@Transactional
	public Department get(Integer i) {
		return dr.findById(i).get();
	}

}
