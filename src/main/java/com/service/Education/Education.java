package com.service.Education;

public class Education {
    private int educationId;
    private String typ;

    private String fullname;
    private String city;

    private String email;

    public Education(int educationId, typeEdu typ, String fullname, String city, String email) {
        this.educationId = educationId;
        this.typ = ;
        this.fullname = fullname;
        this.city = city;
        this.email = email;

    }

    public int getEducationId() {
        return educationId;
    }

    public void setEducationId(int educationId) {
        this.educationId = educationId;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
