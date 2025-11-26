package com.fstail.fstail_admin.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.fstail.fstail_admin.model.Cliente;
import com.fstail.fstail_admin.repository.ClienteRepo;

@Service
public class ClienteServiceImpl implements ClienteService {
    private final ClienteRepo clientRepo;

    // Constructor
    public ClienteServiceImpl(ClienteRepo clientRepo) {
        this.clientRepo = clientRepo;
    }

    @Override
    public Cliente crearCliente(Cliente cliente) {
        if (clientRepo.existsByEmail(cliente.getEmail())) {
            throw new RuntimeException("The Client ready exist, bich.");
        }
        return clientRepo.save(cliente);
    }

    @Override
    public Optional<Cliente> findClientById(Long id) {
        return clientRepo.findById(id);
    }

    @Override
    public List<Cliente> findClients() {
        return clientRepo.findAll();

    }

   
    public Cliente updateClient(Long id, Cliente cliente) {
        Cliente existe = clientRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Client not found, bich"));
        existe.setNombre(cliente.getNombre());
        existe.setApellido(cliente.getApellido());
        existe.setTelefono(cliente.getTelefono());
        existe.setEmpresa(cliente.getEmpresa());
        existe.setEmail(cliente.getEmail());
        existe.setPais(cliente.getPais());
        existe.setCiudad(cliente.getCiudad());
        return clientRepo.save(existe);
    }

    @Override
    public void deleteClient(Long id) {
        clientRepo.deleteById(id);
    }

    @Override
    public Cliente updateClient(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateClient'");
    }

}