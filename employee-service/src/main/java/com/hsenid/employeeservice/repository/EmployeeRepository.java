package com.hsenid.employeeservice.repository;

import com.hsenid.employeeservice.domain.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

    @Query(value = "SELECT ME.* FROM MAPPER_EMPLOYEE_SKILL MES " +
            "LEFT JOIN MST_EMPLOYEE ME ON ME.ID = MES.FK_EMPLOYEE " +
            "LEFT JOIN MST_SKILL MS ON MS.ID = MES.FK_SKILL " +
            "WHERE MS.SKILL LIKE :skill ", nativeQuery = true)
    List<Employee> findEmployeeBySkill(@Param("skill") String skill);

}