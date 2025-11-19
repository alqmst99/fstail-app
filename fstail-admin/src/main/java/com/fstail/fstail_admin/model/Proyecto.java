package com.fstail.fstail_admin.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Projects")
public class Proyecto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String projectName;
    private String serviceType;
    private String state;
    private LocalDate startedAt;
    private LocalDate finishedAt;

    // many to one, many projects and one client
    @ManyToOne
    @JoinColumn(name = "client_id")
    private Cliente client;

    // one to one maintance per projects
    @OneToOne(mappedBy = "project", cascade  = CascadeType.ALL)
    private Mantenimiento maintence;

    // one to many one project many informs
    @OneToMany(mappedBy = "project", cascade = CascadeType.ALL)
    private List<Informe> inform;



    // contructor arg and all
    public Proyecto() {
    }

    public Proyecto(Long id, String projectName, String serviceType, String state, LocalDate startedAt,
            LocalDate finishedAt) {
        this.id = id;
        this.projectName = projectName;
        this.serviceType = serviceType;
        this.state = state;
        this.startedAt = startedAt;
        this.finishedAt = finishedAt;
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public LocalDate getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(LocalDate startedAt) {
        this.startedAt = startedAt;
    }

    public LocalDate getFinishedAt() {
        return finishedAt;
    }

    public void setFinishedAt(LocalDate finishedAt) {
        this.finishedAt = finishedAt;
    }
    
    public Mantenimiento getMaintence() {
        return maintence;
    }

    public void setMaintence(Mantenimiento maintence) {
        this.maintence = maintence;
    }

    public List<Informe> getInform() {
        return inform;
    }

    public void setInform(List<Informe> inform) {
        this.inform = inform;
    }
}
