package com.example.SpringBootCRUDDemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringBootCRUDDemo.model.Employee;
import com.example.SpringBootCRUDDemo.repository.EmpolyeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmpolyeeRepository empolyeeRepository;
	
	public Employee createEmployee(Employee employee) {
		return empolyeeRepository.save(employee);
	}
	public Employee getEmployee (Integer id) {
		Employee emp = empolyeeRepository.findById(id).orElse(null);
		return emp;
	}
	public Employee updateEmployee(Employee employee, Integer id) {
		Employee emp = empolyeeRepository.findById(id).orElse(null);
		if(emp == null) {
			return null;
		}
		emp.setEmpName(employee.getEmpName());
		emp.setEmpAddress(employee.getEmpAddress());
		emp.setEmpSalary(employee.getEmpSalary());
		
		return empolyeeRepository.save(emp);
	}
	public void deleteEmployee(Integer id) {
		empolyeeRepository.deleteById(id);
	}
}
