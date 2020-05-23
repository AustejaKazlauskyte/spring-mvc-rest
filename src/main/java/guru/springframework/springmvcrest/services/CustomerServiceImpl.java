package guru.springframework.springmvcrest.services;

import guru.springframework.springmvcrest.domain.Customer;
import guru.springframework.springmvcrest.repositories.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

// sets up a data layer
@Service
public class CustomerServiceImpl implements CustomerService {

  // deklaruojam interfeisa
  private final CustomerRepository customerRepository;

  // konstruktorius - paima objekta ir grazina
  public CustomerServiceImpl(CustomerRepository customerRepository) {
    this.customerRepository = customerRepository;
  }

  // overaidina - grazina jau pakeistus biski
  @Override
  public Customer findCustomerById(Long id) {
    return customerRepository.getOne(id);
  }

  @Override
  public List<Customer> findAllCustomers() {
    return customerRepository.findAll();
  }
}
