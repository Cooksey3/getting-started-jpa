package hello;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends org.springframework.data.repository.CrudRepository<Customer, Long> {

	List<Customer> findByLastName(String lastName);
}