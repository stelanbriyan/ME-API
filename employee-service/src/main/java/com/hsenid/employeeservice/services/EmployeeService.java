package com.hsenid.employeeservice.services;

import com.hsenid.employeeservice.domain.Employee;
import com.hsenid.employeeservice.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private SkillService skillService;

    public List<Employee> findEmployeeBySkill(String skill) {
        List<Employee> employees = this.employeeRepository.findEmployeeBySkill(skill);

        return null;
    }
}