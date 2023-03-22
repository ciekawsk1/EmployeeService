package com.service.Education;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class EducationController {
    final EducationDao service;
@Autowired
    public EducationController(EducationDao service) {
        this.service = service;
    }

    @GetMapping("/education/sp")
    public List<Education> getAllSzkolaPodstawowa() {
        return service.getAllSzkolaPodst();
    }

    @GetMapping("/education/ss")
    public List<Education> getAllSzkolaSrednia() {
        return service.getAllSzkolaSrednia();
    }

    @GetMapping("/education/alls")
    public Map<String, Object> getAllSzkoly() {
       return service.getAllSzkoly();
    }
}
