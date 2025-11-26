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

    private String titulo;
    private String descripcion;
    private LocalDate creationAt;
    private String pdfFile;
   


    @ManyToOne
    @JoinColumn(name = "proyecto_id")
    private Proyecto proyecto;


    //Contrutors arg and all


 public Informe() {
    }

        public Informe(Long id, String titulo, String descripcion, LocalDate creationAt, String pdfFile) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
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

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
    
 public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }
    
}
