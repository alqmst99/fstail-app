package com.fstail.fstail_admin.mapper;

import com.fstail.fstail_admin.dto.ProyectoDTO;
import com.fstail.fstail_admin.model.Cliente;
import com.fstail.fstail_admin.model.Proyecto;

public class ProyectoMapper {

    public static ProyectoDTO toDTO(Proyecto project) {
        if (project == null)
            return null;
        ProyectoDTO dto = new ProyectoDTO();
        dto.setId(project.getId());
        dto.setClientId(project.getCliente().getId());
        dto.setNombreProyecto(project.getNombreProyecto());
        dto.setTipoServicio(project.getTipoServicio());
        dto.setEstado(project.getEstado());
        dto.setStartedAt(project.getStartedAt());
        dto.setFinishedAt(project.getFinishedAt());
        dto.setPrecio(project.getPrecio());
        dto.setDias(project.getDias());
        dto.setPasos(project.getPasos());

        return dto;
    }

    public static Proyecto toEntity(ProyectoDTO dto, Cliente client) {
        if (dto == null)
            return null;

        Proyecto p = new Proyecto();
        p.setId(dto.getId());
        p.setCliente(client);
        p.setNombreProyecto(dto.getNombreProyecto());
        p.setTipoServicio(dto.getTipoServicio());
        p.setEstado(dto.getEstado());
        p.setStartedAt(dto.getStartedAt());
        p.setFinishedAt(dto.getFinishedAt());
        p.setPrecio(dto.getPrecio());
        p.setDias(dto.getDias());
        p.setPasos(dto.getPasos());

        return p;
    }
}
