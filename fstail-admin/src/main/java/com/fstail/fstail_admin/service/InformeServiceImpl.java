package com.fstail.fstail_admin.service;

import java.util.List;
import java.util.Optional;

import com.fstail.fstail_admin.model.Informe;
import com.fstail.fstail_admin.model.Proyecto;
import com.fstail.fstail_admin.repository.InformeRepo;

public class InformeServiceImpl implements InformeService{
    private final InformeRepo infoRepo;

    public InformeServiceImpl( InformeRepo infoRepo){
        this.infoRepo= infoRepo;
    }
@Override
    public Informe crearInforme(Informe info){
        return infoRepo.save(info);
    }

@Override
    public Optional<Informe> findInfoById(Long id){
      return infoRepo.findById(id);
    }

@Override
    public List<Informe> findInfos(){
        return infoRepo.findAll();
    }

    public List<Informe> findByProyecto(Proyecto proyecto){
      return infoRepo.findByProyecto(proyecto);
    }

@Override
    public Informe updateInfo(Long id, Informe info){
        Informe exist= infoRepo.findById(id)
        .orElseThrow(()-> new RuntimeException("Inform not found"));
        exist.setTitulo(info.getTitulo());
        exist.setDescripcion(info.getDescripcion());
        exist.setPdfFile(info.getPdfFile());
        exist.setCreationAt(info.getCreationAt());

        return infoRepo.save(exist);
    }

@Override
    public void deleteInfo(Long id){
        infoRepo.deleteById(id);
    }



    
}
