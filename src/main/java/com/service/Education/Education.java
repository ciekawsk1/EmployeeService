package com.service.Education;

public class Education {
    private int educationId;
    public TypeEdu typeEdu;
    private String fullname;
    private String city;

    private String email;

    public Education(int educationId, TypeEdu typeEdu, String fullname, String city, String email) {
        this.educationId = educationId;
        this.typeEdu = typeEdu;
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

    public TypeEdu getTypeEdu() {
        return typeEdu;
    }

    public void setTypeEdu(TypeEdu typeEdu) {
        this.typeEdu = typeEdu;
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
