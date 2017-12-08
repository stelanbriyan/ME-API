package com.hsenid.employeeservice.repository;

import com.hsenid.employeeservice.domain.EmployeeSkill;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeSkillRepository extends CrudRepository<EmployeeSkill, Long> {


    @Query(value = "SELECT MES.* , ME.EMPLOYEE_NAME , MS.SKILL FROM MAPPER_EMPLOYEE_SKILL MES " +
            "LEFT JOIN MST_EMPLOYEE ME ON ME.ID = MES.FK_EMPLOYEE " +
            "LEFT JOIN MST_SKILL MS ON MS.ID = MES.FK_SKILL", nativeQuery = true)
    List<EmployeeSkill> findEmployeeSkillMapper();
}
