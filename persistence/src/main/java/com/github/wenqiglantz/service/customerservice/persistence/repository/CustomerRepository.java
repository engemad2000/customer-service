package com.github.wenqiglantz.service.customerservice.persistence.repository;

import com.github.wenqiglantz.service.customerservice.persistence.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.history.RevisionRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Transactional(readOnly = true)
public interface CustomerRepository extends JpaRepository<Customer, String> {
    Optional<Customer> findByCustomerId(String customerId);

    @Override
    Optional<Customer> findById(String s);

    List<Customer> findByFirstName(String firstName);



    List<Customer> findByFirstNameAndLastName(String firstName, String lastName);
}

