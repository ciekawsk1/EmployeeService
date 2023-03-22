package com.service.Education;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class EducationController {
    final EducationDao service;
@Autowired
    public EducationController(EducationDao service) {
        this.service = service;
    }

    @GetMapping("/educations")
    public List<Education> getAll() {
        return service.getAllEducations();
    }
}
