package com.example.SpringBootCRUDDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringBootCRUDDemo.model.Employee;
@Repository
public interface EmpolyeeRepository extends JpaRepository<Employee, Integer> {

}
