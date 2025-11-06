package com.fstail.fstail_admin.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "mantence")
public class Mantenimiento {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String planType;
    private double monthPrice;
    private boolean active;



    @OneToOne
    @JoinColumn(name = "project_id")
    private Proyecto project;
 
    //constructors arg and all
        public Mantenimiento(Long id, String planType, double monthPrice, boolean active) {
        this.id = id;
        this.planType = planType;
        this.monthPrice = monthPrice;
        this.active = active;
    }


    public Mantenimiento() {
    }


    //Getters and Setters
    
    
    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getPlanType() {
        return planType;
    }


    public void setPlanType(String planType) {
        this.planType = planType;
    }


    public double getMonthPrice() {
        return monthPrice;
    }


    public void setMonthPrice(double monthPrice) {
        this.monthPrice = monthPrice;
    }


    public boolean isActive() {
        return active;
    }


    public void setActive(boolean active) {
        this.active = active;
    }


}
