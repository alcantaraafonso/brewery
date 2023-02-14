package br.com.beganinha.brewery.services;

import br.com.beganinha.brewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID id) {
        return new CustomerDto().builder()
                .id(UUID.randomUUID())
                .name("Afonso")
                .build();
    }
}
