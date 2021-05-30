package com.develop.smoothieOrders.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity(name="users")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_Id;
    @NotNull
    private String user_Name;
    @NotNull
    private String email;
    @NotNull
    private String home_Address;
    @NotNull
    private String phone_Number;
    private long points;

    public User(Long user_Id,String user_Name, String email, String home_Address, String phone_Number, Long points) {
        this.user_Id=user_Id;
        this.user_Name = user_Name;
        this.email = email;
        this.home_Address = home_Address;
        this.phone_Number = phone_Number;
        this.points=points;
    }

    public User(){

    }

    public Long getUser_Id() {
        return user_Id;
    }

    public void setUser_Id(Long user_Id) {
        this.user_Id = user_Id;
    }

    public String getUser_Name() {
        return user_Name;
    }

    public void setUser_Name(String user_Name) {
        this.user_Name = user_Name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHome_Address() {
        return home_Address;
    }

    public void setHome_Address(String home_Address) {
        this.home_Address = home_Address;
    }

    public String getPhone_Number() {
        return phone_Number;
    }

    public void setPhone_Number(String phone_Number) {
        this.phone_Number = phone_Number;
    }

    public long getPoints() {
        return points;
    }

    public void setPoints(long points) {
        this.points = points;
    }
}
