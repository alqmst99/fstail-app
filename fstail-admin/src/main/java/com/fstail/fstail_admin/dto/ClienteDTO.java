package com.fstail.fstail_admin.dto;

public class ClienteDTO {
    private Long id;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    private String empresa;
    private String pais;
    private String ciudad;




    
    public ClienteDTO(Long id, String nombre, String apellido, String email, String telefono, String empresa, String pais,
            String ciudad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido= apellido;
        this.email = email;
        this.telefono = telefono;
        this.empresa = empresa;
        this.pais = pais;
        this.ciudad = ciudad;
    }


    public ClienteDTO() {
    }

    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getEmpresa() {
        return empresa;
    }
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }


}
