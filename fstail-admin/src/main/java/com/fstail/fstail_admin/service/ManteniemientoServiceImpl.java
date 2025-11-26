package com.fstail.fstail_admin.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.fstail.fstail_admin.model.Mantenimiento;
import com.fstail.fstail_admin.model.Proyecto;
import com.fstail.fstail_admin.repository.MantenimientoRepo;

@Service
public class ManteniemientoServiceImpl implements MantenimientoService{
    
    private final MantenimientoRepo mantRepo;

    public ManteniemientoServiceImpl (MantenimientoRepo mantRepo){
        this.mantRepo= mantRepo;
    }

    @Override
    public Mantenimiento crearMantenimiento(Mantenimiento mant){
        return mantRepo.save(mant);
    }


    @Override
    public Optional<Mantenimiento> findMantById (Long id){
        return mantRepo.findById(id);
    }


    @Override
    public Optional<Mantenimiento> findMantByProyecto(Proyecto proyecto){
        return mantRepo.findByProyecto(proyecto);
    }


    @Override
    public List<Mantenimiento> findMants(){
        return mantRepo.findAll();
    }


    @Override
    public Mantenimiento updateMant(Long id, Mantenimiento mant){
        Mantenimiento exist= mantRepo.findById(id)
        .orElseThrow(()-> new RuntimeException("Mantence not found, bich"));

        exist.setTipoPlan(mant.getTipoPlan());
        exist.setPrecioMes(mant.getPrecioMes());
        exist.setActive(mant.isActive());
        return mantRepo.save(exist);
    }


    @Override
    public void deleteMant(Long id){
        mantRepo.deleteById(id);
    }
}
