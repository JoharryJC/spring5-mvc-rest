package guru.springfamework.repositories;

import guru.springfamework.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
/*
Created by Joharry Correa 09/08/2018
*/
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
