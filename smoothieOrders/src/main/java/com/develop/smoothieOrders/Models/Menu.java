package com.develop.smoothieOrders.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity(name="menu")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long smoothieNumber;
    @NotNull
    @Column(unique = true)
    private String smoothieName;
    @NotNull
    private double smoothiePrice;
    @NotNull
    private boolean isFancy;


    public Menu(Long smoothieNumber, String smoothieName, double smoothiePrice, boolean isFancy) {
        this.smoothieNumber = smoothieNumber;
        this.smoothieName = smoothieName;
        this.smoothiePrice = smoothiePrice;
        this.isFancy = isFancy;
    }

    public Menu(){}

    public Long getSmoothieNumber() {
        return smoothieNumber;
    }

    public void setSmoothieNumber(Long smoothieNumber) {
        this.smoothieNumber = smoothieNumber;
    }

    public String getSmoothieName() {
        return smoothieName;
    }

    public void setSmoothieName(String smoothieName) {
        this.smoothieName = smoothieName;
    }

    public double getSmoothiePrice() {
        return smoothiePrice;
    }

    public void setSmoothiePrice(double smoothiePrice) {
        this.smoothiePrice = smoothiePrice;
    }

    public boolean isFancy() {
        return isFancy;
    }

    public void setFancy(boolean fancy) {
        isFancy = fancy;
    }
}
