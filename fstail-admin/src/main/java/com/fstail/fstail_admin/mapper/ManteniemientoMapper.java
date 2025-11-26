package com.fstail.fstail_admin.mapper;

import com.fstail.fstail_admin.dto.MantenimientoDTO;
import com.fstail.fstail_admin.model.Mantenimiento;
import com.fstail.fstail_admin.model.Proyecto;

public class ManteniemientoMapper {
    public static MantenimientoDTO toDTO(Mantenimiento m){
        if(m == null) return null;

        MantenimientoDTO dto= new MantenimientoDTO();

        dto.setId(m.getId());
        dto.setPlan(m.getTipoPlan());
        dto.setPrecioMes(m.getPrecioMes());
        dto.setActive(m.isActive());

        return dto;
    }

    public static Mantenimiento toEntity(MantenimientoDTO dto, Proyecto project){
        if(dto == null) return null;

        Mantenimiento m = new Mantenimiento();
        m.setId(dto.getId());
        m.setTipoPlan(dto.getPlan());
        m.setPrecioMes(dto.getPrecioMes());
        m.setActive(dto.isActive());
        
        return m;
    }


}
