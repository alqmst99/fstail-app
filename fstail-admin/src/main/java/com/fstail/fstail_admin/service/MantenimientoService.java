package com.fstail.fstail_admin.service;

import java.util.List;
import java.util.Optional;


import com.fstail.fstail_admin.model.Mantenimiento;
import com.fstail.fstail_admin.model.Proyecto;

public interface MantenimientoService {
    Mantenimiento crearMantenimiento(Mantenimiento mant);
    Optional<Mantenimiento> findMantById(Long id);
    Optional<Mantenimiento> findMantByProyecto(Proyecto proyecto);
    List<Mantenimiento> findMants();
    Mantenimiento updateMant (Long id, Mantenimiento mant);
    void deleteMant(Long id);
}
