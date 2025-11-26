package com.fstail.fstail_admin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fstail.fstail_admin.model.Cliente;
import com.fstail.fstail_admin.model.Proyecto;

public interface ProyectoRepo extends JpaRepository <Proyecto, Long> {
List<Proyecto> findByCliente(Cliente cliente);
List<Proyecto> findByEstado(String estado);

}
