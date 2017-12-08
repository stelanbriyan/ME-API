package com.hsenid.employeeservice.resources;

import com.hsenid.employeeservice.domain.Employee;
import com.hsenid.employeeservice.domain.Skill;
import com.hsenid.employeeservice.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Stelan Briyan
 */
@RestController
@RequestMapping(value = "/")
public class EmployeeAPI {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("findEmployeeBySkill/{skill}")
    public List<Employee> findEmployeeBySkill(@PathVariable("skill") String skill) {
        this.employeeService.findEmpBySkill(skill);
        return this.employeeService.findEmployeeBySkill(skill);
    }

    @PostMapping("findEmployeeSkill")
    public List<Employee> findEmployeeBySkill(@RequestBody Skill skill) {
        return this.employeeService.findEmployeeBySkill(skill);
    }

}
