package com.fstail.fstail_admin.service;

import java.util.List;
import java.util.Optional;



import org.springframework.stereotype.Service;

import com.fstail.fstail_admin.model.Cliente;
import com.fstail.fstail_admin.repository.ClienteRepo;

@Service
public class ClienteServiceImpl {
    private final ClienteRepo clientRepo;

    //Constructor 
    public ClienteServiceImpl (ClienteRepo clientRepo){
        this.clientRepo= clientRepo;
    }

public Cliente crearCliente(Cliente client){
    if(clientRepo.existsByEmail(client.getEmail())){ 
   throw new RuntimeException("The Client ready exist, bich.");
    }
return clientRepo.save(client);
}


public Optional<Cliente> findClientById(Long id){
    return clientRepo.findById(id);
}

public List<Cliente> findClients(){
    return clientRepo.findAll();

}

public Cliente UpdateClient(Long id, Cliente client){
    Cliente existe= clientRepo.findById(id).
    orElseThrow(()-> new RuntimeException("Client not found, bich"));
    existe.setName(client.getName());
    existe.setLastName(client.getLastName());
    existe.setPhone(client.getPhone());
    existe.setEnterprice(client.getEnterprice());
    existe.setEmail(client.getEmail());
    existe.setCountry(client.getCountry());
    existe.setCity(client.getCity());
    return clientRepo.save(existe);
}



}