package com.fstail.fstail_admin.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.fstail.fstail_admin.model.Proyecto;
import com.fstail.fstail_admin.repository.ProyectoRepo;

@Service
public class ProyectoServiceImpl {
        private final ProyectoRepo projectRepo;

    //Constructor 
    public ProyectoServiceImpl (ProyectoRepo projectRepo){
        this.projectRepo= projectRepo;
    }

public Proyecto crearProyecto(Proyecto project){
    if(projectRepo.existsById(project.getId())){ 
   throw new RuntimeException("The project ready exist, bich.");
    }
return projectRepo.save(project);
}


public Optional<Proyecto> findProjectById(Long id){
    return projectRepo.findById(id);
}

public List<Proyecto> findprojects(){
    return projectRepo.findAll();

}

public Proyecto Updateproject(Long id, Proyecto project){
    Proyecto existe= projectRepo.findById(id).
    orElseThrow(()-> new RuntimeException("project not found, bich"));
    existe.setProjectName(project.getProjectName());
    existe.setState(project.getState());
    existe.setServiceType(project.getServiceType());
    existe.setFinishedAt(project.getFinishedAt());

    return projectRepo.save(existe);
}

public void deleteProject(Long id){
     projectRepo.deleteById(id);
}

}
