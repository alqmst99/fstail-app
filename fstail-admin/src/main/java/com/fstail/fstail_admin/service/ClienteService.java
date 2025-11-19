package com.fstail.fstail_admin.service;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.actuate.autoconfigure.metrics.MetricsProperties.Web.Client;

import com.fstail.fstail_admin.model.Cliente;

public interface ClienteService {
    Cliente crearCliente(Cliente client);
    Optional<Cliente> findClientById(Long id);
    List<Cliente> findClients();
    Client updateClient (Long id);
    void deleteClient(Long id);
}
