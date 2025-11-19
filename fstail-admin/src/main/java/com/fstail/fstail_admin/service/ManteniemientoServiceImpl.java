package com.fstail.fstail_admin.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.fstail.fstail_admin.model.Mantenimiento;
import com.fstail.fstail_admin.model.Proyecto;
import com.fstail.fstail_admin.repository.MantenimientoRepo;

@Service
public class ManteniemientoServiceImpl {
    
    private final MantenimientoRepo mantRepo;

    public ManteniemientoServiceImpl (MantenimientoRepo mantRepo){
        this.mantRepo= mantRepo;
    }

    public Mantenimiento createMant(Mantenimiento mant){
        return mantRepo.save(mant);
    }


    public Optional<Mantenimiento> findById (Long id){
        return mantRepo.findById(id);
    }


    public Optional<Mantenimiento> findByProject(Proyecto project){
        return mantRepo.findByProject(project);
    }


    public List<Mantenimiento> findMants(){
        return mantRepo.findAll();
    }


    public Mantenimiento updateMant(Long id, Mantenimiento mant){
        Mantenimiento exist= mantRepo.findById(id)
        .orElseThrow(()-> new RuntimeException("Mantence not found, bich"));

        exist.setPlanType(mant.getPlanType());
        exist.setMonthPrice(mant.getMonthPrice());
        exist.setActive(mant.isActive());
        return mantRepo.save(exist);
    }


    public void deleteMant(Long id){
        mantRepo.deleteById(id);
    }
}
