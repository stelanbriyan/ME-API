package com.hsenid.empmanager.resources;

import com.hsenid.empmanager.domain.Employee;
import com.hsenid.empmanager.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Stelan Briyan
 */
@RestController
@RequestMapping(value = "/emp/")
public class EmployeeAPI {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("findEmployeeBySkill/{skill}")
    public List<Employee> findEmployeeBySkill(@PathVariable("skill") String skill) {
        return this.employeeService.findEmployeeBySkill(skill);
    }

}
