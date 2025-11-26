package com.fstail.fstail_admin.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fstail.fstail_admin.model.Mantenimiento;
import com.fstail.fstail_admin.model.Proyecto;

public interface MantenimientoRepo extends JpaRepository <Mantenimiento, Long> {
Optional <Mantenimiento> findByProyecto(Proyecto proyecto);

}
