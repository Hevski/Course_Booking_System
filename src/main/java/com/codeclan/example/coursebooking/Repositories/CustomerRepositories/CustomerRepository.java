package com.codeclan.example.coursebooking.Repositories.CustomerRepositories;

import com.codeclan.example.coursebooking.Models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
