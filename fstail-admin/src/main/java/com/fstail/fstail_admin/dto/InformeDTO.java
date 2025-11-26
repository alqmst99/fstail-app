package com.fstail.fstail_admin.dto;

import java.time.LocalDate;

public class InformeDTO {
    private Long id;
    private Long proyectoId;
    private String titulo;

    private LocalDate creationAt;
    private String descripcion;
    private String pdfFile;

//Contructor
    public InformeDTO(Long id, Long proyectoId, String titulo ,LocalDate creationAt, String descripcion, String pdfFile) {
        this.id = id;
        this.proyectoId = proyectoId;
        this.titulo = titulo;
        this.creationAt = creationAt;
        this.descripcion = descripcion;
        this.pdfFile = pdfFile;
    }

    //Getters & Setters
    public InformeDTO() {
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getProyectoId() {
        return proyectoId;
    }
    public void setProyectoId(Long proyectoId) {
        this.proyectoId = proyectoId;
    }

        public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public LocalDate getCreationAt() {
        return creationAt;
    }
    public void setCreationAt(LocalDate creationAt) {
        this.creationAt = creationAt;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getPdfFile() {
        return pdfFile;
    }
    public void setPdfFile(String pdfFile) {
        this.pdfFile = pdfFile;
    }



}
