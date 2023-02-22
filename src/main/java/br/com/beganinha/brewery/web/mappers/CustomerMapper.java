package br.com.beganinha.brewery.web.mappers;

import br.com.beganinha.brewery.domain.Customer;
import br.com.beganinha.brewery.web.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

    CustomerDto toCustomerDto(Customer customer);

    Customer toCustomer(CustomerDto customerDto);

}
