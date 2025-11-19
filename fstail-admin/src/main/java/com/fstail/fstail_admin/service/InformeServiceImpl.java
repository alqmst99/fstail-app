package com.fstail.fstail_admin.service;

import java.util.List;
import java.util.Optional;

import com.fstail.fstail_admin.model.Informe;
import com.fstail.fstail_admin.model.Proyecto;
import com.fstail.fstail_admin.repository.InformeRepo;

public class InformeServiceImpl {
    private final InformeRepo infoRepo;

    public InformeServiceImpl( InformeRepo infoRepo){
        this.infoRepo= infoRepo;
    }

    public Informe createInfo (Informe info){
        return infoRepo.save(info);
    }


    public Optional<Informe> findById(Long id){
      return infoRepo.findById(id);
    }


    public List<Informe> findInfo(){
        return infoRepo.findAll();
    }

    public List<Informe> findByOptional(Proyecto project){
      return infoRepo.findByProject(project);
    }


    public Informe updateInfo(Long id, Informe info){
        Informe exist= infoRepo.findById(id)
        .orElseThrow(()-> new RuntimeException("Inform not found"));
        exist.setTitle(info.getTitle());
        exist.setDescription(info.getDescription());
        exist.setPdfFile(info.getPdfFile());
        exist.setCreationAt(info.getCreationAt());

        return infoRepo.save(exist);
    }


    public void deleteInfo(Long id){
        infoRepo.deleteById(id);
    }
    
}
