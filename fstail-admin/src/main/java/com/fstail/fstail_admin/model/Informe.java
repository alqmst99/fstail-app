package com.fstail.fstail_admin.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "inform")
public class Informe {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private LocalDate creationAt;
    private String pdfFile;
   


    @ManyToOne
    @JoinColumn(name = "project_id")
    private Proyecto project;


    //Contrutors arg and all


 public Informe() {
    }

        public Informe(Long id, String title, String description, LocalDate creationAt, String pdfFile) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.creationAt = creationAt;
        this.pdfFile = pdfFile;
    }


    //Getter and Setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getCreationAt() {
        return creationAt;
    }

    public void setCreationAt(LocalDate creationAt) {
        this.creationAt = creationAt;
    }

    public String getPdfFile() {
        return pdfFile;
    }

    public void setPdfFile(String pdfFile) {
        this.pdfFile = pdfFile;
    }
    
 public Proyecto getProject() {
        return project;
    }

    public void setProject(Proyecto project) {
        this.project = project;
    }
    
}
