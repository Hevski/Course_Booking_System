package com.codeclan.example.coursebooking.Repositories.CustomerRepositories;

import com.codeclan.example.coursebooking.Models.Course;
import com.codeclan.example.coursebooking.Models.Customer;
import com.codeclan.example.coursebooking.Projections.EmbedCourse;
import com.codeclan.example.coursebooking.Projections.EmbedCustomer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(excerptProjection = EmbedCustomer.class)
public interface CustomerRepository extends JpaRepository<Customer, Long>, CustomerRepositoryCustom {

}
