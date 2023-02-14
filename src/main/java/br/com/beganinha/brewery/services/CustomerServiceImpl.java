package br.com.beganinha.brewery.services;

import br.com.beganinha.brewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID id) {
        return new CustomerDto().builder()
                .id(UUID.randomUUID())
                .name("Afonso")
                .build();
    }

    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {
        return customerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
        //TODO implement this later
        log.info("Updating a customer");
    }

    @Override
    public void deleteById(UUID customerId) {
        //TODO implement this later
        log.info("Deleting a customer");
    }
}
