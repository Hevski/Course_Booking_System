package com.codeclan.example.coursebooking.Repositories.CustomerRepositories;

import com.codeclan.example.coursebooking.Models.Customer;

import java.util.List;

public interface CustomerRepositoryCustom {

    List<Customer> findCustomerByCourseId(Long courseId);
}
