package com.hsenid.empmanager.repository;

import com.hsenid.empmanager.domain.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}