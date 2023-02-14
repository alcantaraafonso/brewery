package br.com.beganinha.brewery.services;

import br.com.beganinha.brewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {

    public CustomerDto getCustomerById(UUID id);
}
