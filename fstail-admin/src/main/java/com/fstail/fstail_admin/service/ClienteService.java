package com.fstail.fstail_admin.service;

import java.util.List;
import java.util.Optional;


import com.fstail.fstail_admin.model.Cliente;

public interface ClienteService {
    Cliente crearCliente(Cliente cliente);
    Optional<Cliente> findClientById(Long id);
    List<Cliente> findClients();
    Cliente updateClient (Long id);
    void deleteClient(Long id);
}
