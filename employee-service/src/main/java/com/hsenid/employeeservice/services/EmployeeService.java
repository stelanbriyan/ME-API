package com.hsenid.employeeservice.services;

import com.hsenid.employeeservice.domain.Employee;
import com.hsenid.employeeservice.domain.Skill;
import com.hsenid.employeeservice.repository.EmployeeRepository;
import com.hsenid.employeeservice.repository.EmployeeSkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Stelan Briyan
 */
@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private EmployeeSkillRepository employeeSkillRepository;

    @Autowired
    private SkillService skillService;

    public List<Employee> findEmployeeBySkill(String skill) {
        return this.employeeRepository.findEmployeeBySkill(skill);
    }

    /**
     * This method same function using streams api
     *
     * @param skill
     * @return
     */
    public List<Employee> findEmpBySkill(String skill) {
        List<Employee> employees = new ArrayList<>();
        this.employeeSkillRepository.findEmployeeSkillMapper()
                .stream()
                .filter(val -> skill.equals(val.getSkill()))
                .forEach(employeeSkill -> {
                    Employee employee = new Employee();
                    employee.setEmployeeName(employeeSkill.getEmployeeName());
                    employee.setId(employeeSkill.getFkEmployee());
                    employees.add(employee);
                });

        return employees;
    }

    public List<Employee> findEmployeeBySkill(Skill skill) {
        return this.employeeRepository.findEmployeeBySkill(skill.getSkill());
    }

    public List<Employee> findEmployees() {
        return (List<Employee>) this.employeeRepository.findAll();
    }
}
