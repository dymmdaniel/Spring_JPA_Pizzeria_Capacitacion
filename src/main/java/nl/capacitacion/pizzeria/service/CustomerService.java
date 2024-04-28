package nl.capacitacion.pizzeria.service;


import nl.capacitacion.pizzeria.model.Customer;
import nl.capacitacion.pizzeria.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer findByPhone(String phone) {
        return this.customerRepository.findByPhone(phone);
    }
}
