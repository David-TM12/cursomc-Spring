package com.davidmagalhaes.cursomc.services;

import com.davidmagalhaes.cursomc.domain.Cliente;
import com.davidmagalhaes.cursomc.repositories.ClienteRepository;
import com.davidmagalhaes.cursomc.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    public Cliente buscar(Integer id){

        Optional<Cliente> cliente = repository.findById(id);

        return cliente.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado!, Id: " + id + "Tipo: " + Cliente.class.getName()));
    }
}
