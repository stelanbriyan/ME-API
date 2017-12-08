package com.hsenid.employeeservice.services;

import com.hsenid.employeeservice.domain.Skill;
import com.hsenid.employeeservice.repository.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillService {

    @Autowired
    private SkillRepository skillRepository;

    public List<Skill> findSkill() {
        return (List<Skill>) this.skillRepository.findAll();
    }
}
