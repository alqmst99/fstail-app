package com.fstail.fstail_admin.service;

import java.util.List;
import java.util.Optional;



import com.fstail.fstail_admin.model.Proyecto;

public interface ProyectoService {
    Proyecto crearProyecto(Proyecto Project);
    Optional<Proyecto> findProjectById(Long id);
    List<Proyecto> findProjects();
    Proyecto updateProject (Long id);
    void deleteProject(Long id);
}
