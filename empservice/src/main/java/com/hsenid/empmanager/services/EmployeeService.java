package com.hsenid.empmanager.services;

import com.hsenid.empmanager.domain.Employee;
import com.hsenid.empmanager.repository.EmployeeRepository;
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
        List<Employee> all = (List<Employee>) this.employeeRepository.findAll();

        return null;
    }
}
