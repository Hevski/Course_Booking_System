package com.codeclan.example.coursebooking.Controllers;

import com.codeclan.example.coursebooking.Models.Course;
import com.codeclan.example.coursebooking.Models.Customer;
import com.codeclan.example.coursebooking.Repositories.CustomerRepositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping(value = "/course/{courseId}")
    public List<Customer> findAllCustomersForAGivenCourse(@PathVariable Long courseId){
        return customerRepository.findCustomerByCourseId(courseId);
    }


}
