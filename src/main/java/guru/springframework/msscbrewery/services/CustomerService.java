package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDto;
import guru.springframework.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);

    CustomerDto saveCustomer(CustomerDto CustomerDto);

    void updateCustomer(UUID beerId, CustomerDto CustomerDto);

    void deleteCustomer(UUID beerId);
}
