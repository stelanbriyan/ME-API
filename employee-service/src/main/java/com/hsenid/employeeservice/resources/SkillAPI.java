package com.hsenid.employeeservice.resources;

import com.hsenid.employeeservice.domain.Skill;
import com.hsenid.employeeservice.services.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Stelan Briyan
 */
@RestController
@RequestMapping("/skill/")
public class SkillAPI {

    @Autowired
    private SkillService skillService;

    @GetMapping("findSkill")
    public List<Skill> findSkill(){
        return this.skillService.findSkill();
    }
}
