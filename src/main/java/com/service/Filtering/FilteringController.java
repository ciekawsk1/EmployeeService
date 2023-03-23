package com.service.Filtering;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class FilteringController {

    @GetMapping("/filter1")
    public List<UserDetails> filter1() {
        return UserDetails.getDetails();
    }
}
@JsonIgnoreProperties(value = {"panNumber"})
class UserDetails {
    private int userId;
    private String userName;
    private String panNumber;

    public UserDetails(int userId, String userName, String panNumber) {
        this.userId = userId;
        this.userName = userName;
        this.panNumber = panNumber;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPanNumber() {
        return panNumber;
    }

    public void setPanNumber(String panNumber) {
        this.panNumber = panNumber;
    }

    public static List<UserDetails> getDetails() {
        return Arrays.asList(new UserDetails(12, "Daniel", "AVGPOAMU"),
                new UserDetails(13, "Mike", "AVGPASMU"),
                new UserDetails(14, "John", "VATADD"));
    }
}
