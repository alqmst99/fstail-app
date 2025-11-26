package com.fstail.fstail_admin.service;

import java.util.List;
import java.util.Optional;

import com.fstail.fstail_admin.model.Informe;
import com.fstail.fstail_admin.model.Proyecto;

public interface InformeService {
     Informe crearInforme(Informe info);
    Optional<Informe> findInfoById(Long id);
    List<Informe> findInfos();
    List<Informe> findByProyecto(Proyecto proyecto);
    Informe updateInfo (Long id, Informe info);
    void deleteInfo(Long id);
}
