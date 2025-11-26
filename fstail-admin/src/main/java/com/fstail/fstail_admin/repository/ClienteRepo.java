package com.fstail.fstail_admin.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fstail.fstail_admin.model.Cliente;

public interface ClienteRepo extends JpaRepository <Cliente, Long> {
Optional<Cliente> findByEmail(String email);
boolean existsByEmail(String email);
}
