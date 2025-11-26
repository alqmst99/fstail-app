package com.fstail.fstail_admin.mapper;

import com.fstail.fstail_admin.dto.InformeDTO;
import com.fstail.fstail_admin.model.Informe;
import com.fstail.fstail_admin.model.Proyecto;

public class InformeMapper {
public static InformeDTO dto(Informe info){ 
    if(info == null) return null;

    InformeDTO dto = new InformeDTO();
    
    dto.setId(info.getId());
    dto.setProyectoId(info.getProyecto().getId());
    dto.setTitulo(info.getTitulo());
    dto.setDescripcion(info.getDescripcion());
    dto.setCreationAt(info.getCreationAt());
    dto.setPdfFile(info.getPdfFile());

    return dto;
}
    

public static Informe toEntity (InformeDTO dto, Proyecto proyecto){
if(dto== null) return null;

Informe i = new Informe();

i.setId(dto.getId());
i.setProyecto(proyecto);
i.setCreationAt(dto.getCreationAt());
i.setTitulo(dto.getTitulo());
i.setDescripcion(dto.getDescripcion());
i.setPdfFile(dto.getPdfFile());

return i;

}
}
