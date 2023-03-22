package com.service.Education;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class EducationDao {
    static List<Education> listaSp = new ArrayList<>();

    static {
        listaSp.add(new Education(0011, TypeEdu.SZKOLAPODST, "Szkoła Podstawowa nr 1", "Krakow", "spnr1@edu.pl"));
        listaSp.add(new Education(0012, TypeEdu.SZKOLAPODST, "Szkoła Podstawowa nr 2", "Krakow", "spnr2@edu.pl"));
        listaSp.add(new Education(0013, TypeEdu.SZKOLAPODST, "Szkoła Podstawowa nr 3", "Krakow", "spnr2@edu.pl"));

    }
    static List<Education> listaSs = new ArrayList<>();

    static {
        listaSs.add(new Education(0021, TypeEdu.SZKOLASREDNIA, "Technikum nr 1", "Warszawa", "technikumnr1@edu.pl"));
        listaSs.add(new Education(0022, TypeEdu.SZKOLASREDNIA, "Liceum nr 1", "Warszawa", "liceum1@edu.pl"));
        listaSs.add(new Education(0023, TypeEdu.SZKOLASREDNIA, "Zawodowka nr 1", "Warszawa", "brudasy@edu.pl"));
    }
    public List<Education> getAllSzkolaPodst() {
        return listaSp;
    }

    public List<Education> getAllSzkolaSrednia() {
        return listaSs;
    }

    public Map<String, Object> getAllSzkoly() {
        Map<String, Object> map = new HashMap<>();
        map.put("listaSp", listaSp);
        map.put("listaSs", listaSs);
        return map;

    }


}
