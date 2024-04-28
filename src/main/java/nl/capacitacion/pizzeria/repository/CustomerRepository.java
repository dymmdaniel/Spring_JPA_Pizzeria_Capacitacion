package nl.capacitacion.pizzeria.repository;

import nl.capacitacion.pizzeria.model.Customer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.query.Param;

public interface CustomerRepository extends ListCrudRepository<Customer,String> {
    @Query(value = "SELECT c FROM CustomerEntity c WHERE c.phoneNumber = :phone")
    Customer findByPhone(@Param("phone") String phone);
}
