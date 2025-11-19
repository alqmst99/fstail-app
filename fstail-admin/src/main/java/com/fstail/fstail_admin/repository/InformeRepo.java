package com.fstail.fstail_admin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fstail.fstail_admin.model.Informe;
import com.fstail.fstail_admin.model.Proyecto;

public interface InformeRepo extends JpaRepository <Informe, Long> {
List<Informe> findByProject(Proyecto project);
}
