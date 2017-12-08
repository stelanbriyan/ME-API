package com.hsenid.employeeservice.domain;

import javax.persistence.*;

@Entity
@Table(name = "MAPPER_EMPLOYEE_SKILL")
public class EmployeeSkill {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Column(name = "FK_SKILL")
    private Long fkSkill;

    @Column(name = "FK_EMPLOYEE")
    private Long fkEmployee;

    @Column(name = "SKILL")
    private String skill;

    @Column(name = "EMPLOYEE_NAME")
    private String employeeName;


    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFkSkill() {
        return fkSkill;
    }

    public void setFkSkill(Long fkSkill) {
        this.fkSkill = fkSkill;
    }

    public Long getFkEmployee() {
        return fkEmployee;
    }

    public void setFkEmployee(Long fkEmployee) {
        this.fkEmployee = fkEmployee;
    }
}
