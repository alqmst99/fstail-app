package com.fstail.fstail_admin.mapper;

import com.fstail.fstail_admin.dto.ClienteDTO;
import com.fstail.fstail_admin.model.Cliente;


public class ClienteMapper {

    public static ClienteDTO toDTO(Cliente client){
        if (client == null) return null;

        ClienteDTO dto= new ClienteDTO();
        dto.setId(client.getId());
        dto.setNombre(client.getNombre());
        dto.setApellido(client.getApellido());
        dto.setEmail(client.getEmail());
        dto.setTelefono(client.getTelefono());
        dto.setEmpresa(client.getEmpresa());
        dto.setPais(client.getPais());
        dto.setCiudad(client.getCiudad());

        return dto;
        
    }


    public static Cliente toEntity(ClienteDTO dto){
        if(dto== null) return null;

        Cliente client= new Cliente();
        client.setNombre(dto.getNombre());
        client.setApellido(dto.getApellido());
        client.setEmail(dto.getEmail());
        client.setTelefono(dto.getTelefono());
        client.setEmpresa(dto.getEmpresa());
        client.setPais(dto.getPais());
        client.setCiudad(dto.getCiudad());

        return client;

    }
}
