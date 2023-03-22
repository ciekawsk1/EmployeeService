package com.service.Education;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

import static com.service.Employees.EmployeeDao.list;

@Component
public class EducationDao {
    static List<Education> listaSp = new ArrayList<>();

    static {
        listaSp.add(new Education(0011, typeEdu.SZKOLAPODST, "Szkoła Podstawowa nr 1", "Krakow", "spnr1@edu.pl"));
        listaSp.add(new Education(0012, typeEdu.SZKOLAPODST, "Szkoła Podstawowa nr 2", "Krakow", "spnr2@edu.pl"));
        listaSp.add(new Education(0013, typeEdu.SZKOLAPODST, "Szkoła Podstawowa nr 3", "Krakow", "spnr2@edu.pl"));

    }

    static List<Education> listaSs = new ArrayList<>();

    static {
        listaSs.add(new Education(0021, typeEdu.SZKOLASREDNIA, "Technikum nr 1", "Warszawa", "technikumnr1@edu.pl"));
        listaSs.add(new Education(0022, typeEdu.SZKOLASREDNIA, "Liceum nr 1", "Warszawa", "liceum1@edu.pl"));
        listaSs.add(new Education(0023, typeEdu.SZKOLASREDNIA, "Zawodowka nr 1", "Warszawa", "brudasy@edu.pl"));
    }


    public List<Education> getAllSzkolaPodst() {
        return listaSp;
    }

    public List<Education> getAllSzkolaSrednia() {
        return listaSs;
    }


}
